package array;

import java.util.Arrays;

public class MedianOfTwoSortedArray {

	public static void main(String[] args) {
		// 36 : Median of 2 sorted arrays of different size
		
        int[] arr1 = {2, 3, 5, 10};
        int i = arr1.length;

        int[] arr2 = {8, 12, 14, 16, 18, 20};
        int j = arr2.length;

        int[] arr3 = new int[i + j];

        System.arraycopy(arr1, 0, arr3, 0, i);
        System.arraycopy(arr2, 0, arr3, i, j);
        Arrays.sort(arr3);

        int n = i+j, mid = n/2;

        if(n%2!=0)  System.out.println("Result: "+arr3[mid]);
        else    System.out.println("Result: "+ (arr3[mid] +arr3[mid-1]) / 2);

	}

}
