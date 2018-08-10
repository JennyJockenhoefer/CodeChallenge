package OperatingSystems;
import java.util.ArrayList;
import java.util.Collections;

import util.StdInput;
public class Median {
public static double getmedian (ArrayList Numbers) {
	
	Collections.sort(Numbers);   //Liste sort
	for(int i=0; i<Numbers.size(); i++) {
		System.out.println(Numbers.get(i));
	}
	int median = 0;
	double median2 = 0.0;
	int position1 = (int)Math.floor((Numbers.size()-1.0)/2.0);  // from left side
	int position2 = (int)Math.ceil((Numbers.size()-1.0)/2.0);  // from right side
	if (position1 == position2) {
		median = (int)Numbers.get(position1);
		return median;
	} else {
		int num1 = (int)Numbers.get(position1);
		int num2 = (int)Numbers.get(position2);
		
		median2 = (num1 + num2) / 2.0;
		return median2;
	}
}
	public static void main (String []args) {
		boolean flag = true;
		int n, n2;
		ArrayList Numbers = new ArrayList();
	while(flag) {
		n = StdInput.readInt("Add Number");
		Numbers.add(n);
		n2 = StdInput.readInt("Get median? 1=yes 0=no");
		if(n2 == 1) {
			double median = getmedian(Numbers);
			System.out.println(median);
		}else { 
			flag = true;
			}
		}
	}

}