package array;

import java.util.Scanner;

public class ContiguousSubarraySum {

	public static void main(String[] args) {
		// 8 : find Largest sum contiguous Sub-array [V. IMP]
		
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
		
		int maxSum = arr[0];
		for (int i =0 ; i<n ; i++) {
			for (int j=i ; j<n ; j++) {
				int sum = 0;
				for (int k=i; k<=j; k++) {
					sum += arr[k]; 
				}
				maxSum = (maxSum>sum) ? maxSum : sum;
			}
		}
		
		/*
		 Alternative method --->
		 
		int tillnow = arr[0];
        int curr = arr[0];

        for (int i = 1; i < n; i++)
        {
            curr = max(arr[i], curr+arr[i]);
            tillnow = max(tillnow, curr);
        }
        return tillnow;
        
		 */
		
		System.out.println("\nMax Sum of contiguous sub array is : " + maxSum);
		
		sc.close();
	}

}
