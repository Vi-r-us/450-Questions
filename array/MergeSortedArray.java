package array;

import java.util.Arrays;
import java.util.Scanner;

public class MergeSortedArray {

	public static void main(String[] args) {
		// 12 : Merge 2 sorted arrays without using Extra space.
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Enter the length of First array : ");
		int n = sc.nextInt();
		int arr1[] = new int[n];
		System.out.println("\nEnter the elements of first array (sorted) :: ");
		for (int i=0 ; i<n ; i++) {
			System.out.print("Enter the " + (i+1) + "th element : ");
			arr1[i] = sc.nextInt();
		}
		
		System.out.print("\n\nEnter the length of Second array : ");
		int m = sc.nextInt();
		int arr2[] = new int[m];
		System.out.println("\nEnter the elements of second array (sorted) :: ");
		for (int i=0 ; i<m ; i++) {
			System.out.print("Enter the " + (i+1) + "th element : ");
			arr2[i] = sc.nextInt();
		}
		
		System.out.print("\n First Array is : [  ");
		for (int ele : arr1) System.out.print(ele + "  ");
		System.out.print("]\n");
		System.out.print("\n Second Array is : [  ");
		for (int ele : arr2) System.out.print(ele + "  ");
		System.out.print("]\n");
		
		Arrays.sort(arr1);
		Arrays.sort(arr2);
		
		int i=n-1,j=0;
		
		while (i>-1 && j<m) {
			if (arr1[i] > arr2[j]) {
				int temp = arr1[i];
				arr1[i] = arr2[j];
				arr2[j] = temp;
				j++;
			}
			else {
				i--;
			}
		}
		
		Arrays.sort(arr1);
		Arrays.sort(arr2);
		
		System.out.print("Sorted array is : [ ");
		for (int ele : arr1) System.out.print(ele + "  ");
		for (int ele : arr2) System.out.print(ele + "  ");
		System.out.print("]\n");
		
		sc.close();
		
	}

}
