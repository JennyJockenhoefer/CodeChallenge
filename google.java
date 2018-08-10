package OperatingSystems;

import java.util.Hashtable;
import java.util.Random;
import java.util.Scanner;

public class google {
public static char nonRepeated(String str){
		
		Hashtable<Character, Integer> hash = new Hashtable<Character,Integer>();

		int val = 0;
		char c = ' ';
		for(int i = 0; i < str.length(); i++){
			val = 0;
			if(!hash.isEmpty() && hash.containsKey(str.charAt(i))) {
				val = (int)hash.get(str.charAt(i));
			}
			hash.put(str.charAt(i), new Integer(val + 1));
		}
		
		for(int i = 0; i < str.length(); i++){
			if((int)hash.get(str.charAt(i)) == 1) {
				c = str.charAt(i);
				break;
			}
		}
		
		
		return c;
	}

	public static void main(String[] args){
		long startTime = System.nanoTime();
		char result;
		String str;
		System.out.println("Enter a word");
		Scanner scan = new Scanner(System.in);
		str = scan.nextLine();
		result = nonRepeated(str);
		System.out.println("First non-repeating character is " +  result);
		long endTime = System.nanoTime();
		long totalTime = (endTime - startTime)/1000000000;
		System.out.println("Runtime: " + totalTime + " seconds");
	}
}
