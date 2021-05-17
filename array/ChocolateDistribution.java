package array;

import java.util.Arrays;

public class ChocolateDistribution {

	public static void main(String[] args) {
		// 30 : Chocolate Distribution problem
		
		int[] arr = {3, 4, 1, 9, 56, 7, 9, 12};
		int n = arr.length, m = 5;
		
		Arrays.sort(arr);
		
		int minDif = arr[n-1] - arr[0];
		for (int i=0; i<=n-m ; i++) {
			minDif = Math.min(minDif, arr[i+m-1] - arr[i]);
		}
		
		System.out.println(minDif);
	}

}
