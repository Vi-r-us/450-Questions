package array;

import java.util.*;

public class FactorialToArray {
	
	// 22 : Find factorial of a large number
	
	static void multiply (List<Integer> resultList, int x ) {
		int carry=0;
		
		for (int i=0 ; i<resultList.size() ; i++) {
			int prod = resultList.get(i) * x + carry;	// the number x multiplied by digit i
			resultList.set(i, prod % 10);				// getting the last digit and replacing to i th index
			carry = prod/10;							// updating the carry
		}
		
		while (carry != 0) {							// adding carry digits too 
			resultList.add(carry%10);		
			carry = carry/10;
		}
	}
	
	public static void main(String[] args) {
		
		long N = 1000; 
		
		List<Integer> resultList = new ArrayList<>();
		resultList.add(1);
		
		for (int i=2 ; i<=N ; i++) 
			multiply(resultList, i);
		
		Collections.reverse(resultList);
		
		for (Integer digit:resultList) 
			System.out.print(digit);
		
	}

}
