package array;

import java.util.Scanner;

public class SortingFor012Array {

	public static void main(String[] args) {
		// 4 : Given an array which consists of only 0, 1 and 2. Sort the array without using any sorting algorithm
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Enter the length of array : ");
		int n = sc.nextInt();
		int arr[] = new int[n];
		
		System.out.println("\nEnter the elements of array :: ");
		for (int i=0 ; i<n ; i++) {
			System.out.print("Enter the " + (i+1) + "th element : ");
			arr[i] = sc.nextInt();
		}
		
		System.out.print("\n Array before sorting is : [  ");
		for (int ele : arr) System.out.print(ele + "  ");
		System.out.print("]\n");
		
		int no0=0,no1=0;
		
		for (int ele: arr) {
			switch (ele) {
			case 0 : 
				no0++;
				break;
			case 1 : 
				no1++;
				break;
			case 2 :
				break;
			}
		}
		
		for (int i=0; i<n; i++) {
			if (i<no0)  arr[i] = 0;
			else if ((i-no0)<no1) arr[i] = 1;
			else arr[i] = 2;
		}
		
		System.out.print("\n Array after sorting is : [  ");
		for (int ele : arr) System.out.print(ele + "  ");
		System.out.print("]\n");
		
		
		/*
		 	There can be a alternative method by which ,
		 	we swaps the all the 0's to the left side of the array and 2's to the right sides
		 */
		
		sc.close();
		

	}

}
