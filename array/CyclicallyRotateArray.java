package array;

import java.util.Scanner;

public class CyclicallyRotateArray {

	public static void main(String[] args) {
		// 7 Write a program to cyclically rotate an array by one.
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Enter the length of array : ");
		int n = sc.nextInt();
		int arr[] = new int[n];
		
		System.out.println("\nEnter the elements of array :: ");
		for (int i=0 ; i<n ; i++) {
			System.out.print("Enter the " + (i+1) + "th element : ");
			arr[i] = sc.nextInt();
		}
		
		System.out.print("\n Array before shift by one : [  ");
		for (int ele : arr) System.out.print(ele + "  ");
		System.out.print("]");
		
		int temp = 0;
		for (int i=n-1 ; i>=0 ; i--) {
			if (i == n-1) {
				temp = arr[0];
				arr[0] = arr[i];
			}
			else if (i == 0) {
				arr[i+1] = temp;
			}
			else {
				arr[i+1] = arr[i];
			}
		}
		
		System.out.print("\n Array after shift by one : [  ");
		for (int ele : arr) System.out.print(ele + "  ");
		System.out.print("]");
		
		sc.close();

	}

}
