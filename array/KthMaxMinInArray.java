package array;

import java.util.Scanner;

public class KthMaxMinInArray {

	public static void main(String[] args) {
		// 3 : Find the maximum and minimum element in an array
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Enter the length of array : ");
		int n = sc.nextInt();
		int arr[] = new int[n];
		
		System.out.println("\nEnter the elements of array :: ");
		for (int i=0 ; i<n ; i++) {
			System.out.print("Enter the " + (i+1) + "th element : ");
			arr[i] = sc.nextInt();
		}
		
		System.out.print("\n Array is : [  ");
		for (int ele : arr) System.out.print(ele + "  ");
		System.out.print("]\n");
		
		// Sorting by selection sort
		for (int i=0; i<n-1; i++) {
			
			int minIndex = i;
			for (int j=i; j<n; j++)		if (arr[j] < arr[minIndex])		 minIndex = j;
			
			int temp = arr[i];
			arr[i] = arr[minIndex];
			arr[minIndex] = temp;
		}
		
		System.out.print("\nEnter the value of k : ");
		int k = sc.nextInt();
		
		if (k<n && k>0) System.out.print("\n Maximum element : " + arr[n-k] + "\n Minimum element : " + arr[k-1]);
		else System.out.println("\n kth maximum and minimum dosen't exist.");
		
		sc.close();

	}

}
