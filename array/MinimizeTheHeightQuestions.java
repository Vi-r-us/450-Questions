package array;

import java.util.Arrays;
import java.util.Scanner;

public class MinimizeTheHeightQuestions {

	public static void main(String[] args) {
		// 9 : Minimize the maximum difference between heights [V.IMP]
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Enter the length of array : ");
		int n = sc.nextInt();
		System.out.print("Enter the height : ");
		int k = sc.nextInt();
		int arr[] = new int[n];
		
		System.out.println("\nEnter the elements of array :: ");
		for (int i=0 ; i<n ; i++) {
			System.out.print("Enter the " + (i+1) + "th element : ");
			arr[i] = sc.nextInt();
		}
		System.out.print("\n Array is : [  ");
		for (int ele : arr) System.out.print(ele + "  ");
		System.out.print("]");
		
		Arrays.sort(arr);		// sort the array
        int min_elem, max_elem;
        int ans = arr[n-1] - arr[0];	// difference between max element and min element
        
        for (int i=1 ; i<n; i++){
            if (arr[i] >= k)		// element should be greater than the value of k
            {
                max_elem = Math.max(arr[i-1] + k, arr[n-1] - k );		// number should not exceed the (max value-k) i.e. arr[n-1] - k 
                min_elem = Math.min(arr[0] + k, arr[i] - k );			// number should not lesser then (min value+k) i.e. arr[0] + k
                ans = Math.min(ans, max_elem - min_elem);
            }
        }
        
        System.out.println("\nMinimum difference between maximum and minimum is : " + ans);
        sc.close();

	}

}
