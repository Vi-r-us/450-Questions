package array;

import java.util.Arrays;
import java.util.Scanner;

public class FindDuplicatesInArray {

	public static void main(String[] args) {
		// 11 : find duplicate in an array of N+1 Integers
		
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
		
		Arrays.sort(arr);
        for (int i = 0; i<arr.length-1 ; i++) 
            if (arr[i] == arr[i+1])  System.out.println(arr[i]+" have duplicates");
        
        sc.close();
		
	}

}
