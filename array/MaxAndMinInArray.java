package array;

import java.util.Scanner;

public class MaxAndMinInArray {

	public static void main(String[] args) {
		// 2 : Find the maximum and minimum element in an array
		
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
		System.out.print("]");
		
		int max = arr[0],min = arr[0];
		
		for (int i=0 ; i<n ; i++) {
			if (arr[i] < min)	min = arr[i];
			if (arr[i] > max)	max = arr[i];
		}
		
		System.out.print("\n Maximum element : " + max + "\n Minimum element : " + min);
		
		sc.close();
	}

}
