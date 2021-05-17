package array;

import java.util.Arrays;

public class AlternatePosNeg {

	public static void main(String[] args) {
		// 20 : Rearrange array in alternating positive & negative items with O(1) extra space 
		
		int arr[] = {-1,-2,-3,0,0,0,-1,-1};
		
		Arrays.sort(arr);
		
		int neg = 0;
        for (int k = 0; k < arr.length; k++) {
            if (arr[k] < 0)
                neg++;
        }
        
        int j = neg, i = 1;
		while (i<arr.length && arr[i]<0 && j<arr.length) {
			if (arr[j]>=0) {
				int temp = arr[j];
				arr[j] = arr[i];
				arr[i] = temp;
				i += 2;
				j++;
			}
		}
		
		for (int ele: arr) System.out.print(" " + ele +" ");
		
	}

}
