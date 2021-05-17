package array;

import java.util.Scanner;

public class CountPairSum {

	public static void main(String[] args) {
		// 18 : find all pairs on integer array whose sum is equal to given number 
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Enter the length of array : ");
		int n = sc.nextInt();
		System.out.print("Enter the value of k (desired sum) : ");
		int k = sc.nextInt();
		int arr[] = new int[n];
		
		System.out.println("\nEnter the elements of array :: ");
		for (int i=0 ; i<n ; i++) {
			System.out.print("Enter the " + (i+1) + "th element : ");
			arr[i] = sc.nextInt();
		}
		
		System.out.print("\n Array before reversed : [  ");
		for (int ele : arr) System.out.print(ele + "  ");
		System.out.print("]");
		
		int i = 0,j = n - 1, count = 0;
        while(i < n && j >= 0) {
            if(i != j) {
                if((arr[i] + arr[j]) == k) count++;
                j--;
            }
            else
            {
                j = n - 1;
                i++;
            } 
        }
        
        System.out.println("\n Number of possible pairs are : " + count);
		sc.close();
	}

}
