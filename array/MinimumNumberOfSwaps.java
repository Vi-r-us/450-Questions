package array;

public class MinimumNumberOfSwaps {

	public static void main(String[] args) {
		// 33 : Minimum swaps required bring elements less equal K together
		
		int[] arr = {10 ,12 ,20 ,20 ,5 ,19 ,19 ,12 ,1 ,20 ,1};
		int k=6 , n=arr.length;
		
		int good=0, bad=0, result;
		
		for (int i=0 ;i<n ; i++)
			if (arr[i] <= k) good++;	

		for (int i=0 ;i<good ; i++)
			if (arr[i] > k) bad++;
		result = bad;
		
		for (int i=0,j=good; j<n ; i++,j++) {
			if (arr[i] > k) bad--;
			if (arr[j] > k ) bad++;
			
			result = Math.min(result , bad);
			
		}
		
		System.out.println(result);

	}

}
