package OperatingSystems;
import java.util.Hashtable;
import java.util.Random;
import java.util.Scanner;

public class List {
public static void main (String[] args) {
		long startTime = System.nanoTime();
		Hashtable<Integer, Integer> hash = new Hashtable<Integer,Integer>();
		Scanner scan = new Scanner(System.in);
		System.out.println("Give k");
		int k = scan.nextInt();
		System.out.println("Give n");
		int n = scan.nextInt();
		Random rand = new Random();
		int count = 0;
		int count2 = 0;
		int num;
		boolean flag = true;
		int [] array = new int [k]; 
		int [] array2 = new int [k];
		for (int j =0; j <=k-1; j++) {   // 6 Numbers 6 Mal durchlaufen
			flag = true;
			while(flag){
				num = rand.nextInt(n);
				if(!hash.containsKey(num)) {
					hash.put(num, 1);
					array[j] = num;
					flag = false;
				}
			}
			
			System.out.print(array[j]);
		}
		for (int i = 0; i <= n-1; i++) {
			for (int j = 0; j<=k-1; j++) {
				if(i!= array[j]) {
				count2++;
				}
			}
			if(count2== k) {
				array2[count]=i;
				count++;
				}
			count2=0;
			}
			System.out.println();
			System.out.print(array2 [(int) (Math.random() * count + 0)]);
			System.out.println();
			long endTime = System.nanoTime();
			long totalTime = (endTime - startTime)/1000000000;
			System.out.println("Runtime: " + totalTime + " seconds");
		}
}

