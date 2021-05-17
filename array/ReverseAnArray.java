package array;

import java.util.Scanner;

public class ReverseAnArray {

	public static void main(String[] args) {
		
		// 1 : Reverse the array
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Enter the length of array : ");
		int n = sc.nextInt();
		int arr[] = new int[n];
		
		System.out.println("\nEnter the elements of array :: ");
		for (int i=0 ; i<n ; i++) {
			System.out.print("Enter the " + (i+1) + "th element : ");
			arr[i] = sc.nextInt();
		}
		
		System.out.print("\n Array before reversed : [  ");
		for (int ele : arr) System.out.print(ele + "  ");
		System.out.print("]");
		
		for (int i=0 ; i<n/2 ; i++) {
			int temp = arr[n-i-1];
			arr[n-i-1] = arr[i];
			arr[i] = temp;
		}
		
		System.out.print("\n Array after reversed : [  ");
		for (int ele : arr) System.out.print(ele + "  ");
		System.out.print("]");
		
		sc.close();
		
	}

}
