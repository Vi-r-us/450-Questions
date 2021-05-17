package array;

import java.util.ArrayList;

public class SubarrayWithSumZero {

	public static void main(String[] args) {
		// 21 : Find if there is any sub-array with sum equal to 0
		
		int[] arr = {1,-2,-2,3,4};
		
		// using hash set is a more optimal answer
		ArrayList<Integer> temp = new ArrayList<>();  
		int sum = 0; boolean isContains=false;
		
		for (int ele: arr) {
			sum += ele;
			
			// checks if sum of the sub array becomes zero itself
			if (ele==0 || sum==0 || temp.contains(sum)) {	
				isContains = true;
				break;
			}
			
			temp.add(sum);
		}
		
		System.out.println((isContains == true) ? "True" : "False");
	}

}
