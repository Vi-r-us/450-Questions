package array;


public class LongestCommonSubsequence {

	public static void main(String[] args) {
		// 24 : Find longest consecutive subsequence
		
		int[] arr = {2,6,1,9,4,5,3};
		int[] hash = new int[1000000];
		
		int result = 1, maxLength = 0;
		
		for (int i = 0 ; i < arr.length ; i++) {
			hash[arr[i]] = 1;							// initialize 1 at index arr[i]
			maxLength = Math.max(maxLength, arr[i]);	// get the max length for the hash array
		}
		
		int countTillNow = 1;
		for (int i = 0 ; i < maxLength ; i++) {
			if (hash[i + 1] == 1 && hash[i] == 1) {		
				countTillNow++;							 // count until get zero
				result = Math.max(result, countTillNow); // update the result accordingly
			}
			else
				countTillNow = 1;						// if found zero at next index reset
		}
		
		System.out.println("Maximum Consecutive Subsequence is : " + result);
	}

}
