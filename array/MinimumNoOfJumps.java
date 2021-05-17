package array;

import java.util.Scanner;

public class MinimumNoOfJumps {

	public static void main(String[] args) {
		// 10 : Minimum no. of Jumps to reach end of an array
		
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
		
		int noOfJumps = 0, currFar = 0, currEnd = 0 ; 

        for(int i = 0; i<arr.length; i++){

            currFar = Math.max(currFar, i+arr[i]);
            if(i == currEnd)
            {
                noOfJumps++;    currEnd = currFar;
            }
            if(currEnd>=arr.length-1)   break;
        }
        
        if (currEnd < arr.length-1) System.out.println("\nNo. of Jumps : " + -1);
        else System.out.println("\nNo. of Jumps : " + noOfJumps);
        
        sc.close();

	}

}
