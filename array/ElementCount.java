package array;

public class ElementCount {
	
	
	public static void main(String[] args) {
		// 25 : Given an array of size n and a number k, fin all elements that appear more than "n/k" times.
		
		int[] arr = {3, 1, 2, 2, 1, 2, 3, 3};
		int n = arr.length, k = 4;
		int[] hash = new int[10000000];
		
		int maxLength = 0;
		
		for (int i = 0 ; i < arr.length ; i++) {
			hash[arr[i]]++;							// initialize 1 at index arr[i]
			maxLength = Math.max(maxLength, arr[i]);	// get the max length for the hash array
		}
		
		System.out.print("Elements are  : ");
		
		for (int i=0 ; i<=maxLength ; i++) if (hash[i] > n/k ) System.out.print(" " + i + " ");
	}

}
