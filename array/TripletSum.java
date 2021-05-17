package array;

import java.util.Arrays;

public class TripletSum {

	public static void main(String[] args) {
		// 28 : Find the triplet that sum to a given value
		
		int[] arr = {1 ,4 ,45 ,6 ,10 ,8};
		int n = arr.length, X= 15;
		
		Arrays.sort(arr);
		for (int i=0 ; i<n-1 ; i++) {
			
			int j = i+1 , k = n-1;
			boolean resultFound = false;
			while (j != k) {
				
				if (arr[i] + arr[j] + arr[k] == X) {
					System.out.println("Triplet Exist");
					resultFound = true;
					break;
				}
				else if (arr[i] + arr[j] + arr[k]< X)	j++;
				else k--;
				
			}
			if (resultFound) break;
		}
		
	}

}
