package string;

import java.util.Scanner;

public class NextPermutation {

	public static void main(String[] args) {
		// 15 : Next Permutation
		
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
		
		nextPermutation(arr);
		
		System.out.print("\n Arrays next Permutaion : [  ");
		for (int ele : arr) System.out.print(ele + "  ");
		System.out.print("]");
		
		sc.close();
	}
	
		static void nextPermutation(int[] nums) {
			
		    int i = nums.length-2;
		    
		    //where this condition breaks, i will be pointing the position where
		    // decreasing sequence of array breaks
		    while(i>=0 && nums[i]>=nums[i+1])
		    {
		        i--;
		    }
		    
		    //this condition to make sure whole array is not in DESC order
		    // as i will be -1 if whole array is DESC order
		    if(i>=0){
		        
		        int j = nums.length-1;
		        
		        //where this condition breaks, j will be pointing to first number that is
		        // greater than the number i will be pointing to that needs to be swapped
		        while(j>=i && nums[j]<=nums[i]){
		            j--;
		        }
		        
		        swap(nums,i,j);
		        reverse(nums, i+1);
		    }
		    else
		    {
		        //reverse the whole array as whole array is in DESC order
		        reverse(nums, 0);
		    }
		    
		}

		static void swap(int[] nums, int i , int j)
		{
		    int temp = nums[i];
		    nums[i] = nums[j];
		    nums[j] = temp;
		}

		static void reverse(int[] nums, int start)
		{
		    int i = start;
		    int j = nums.length-1;
		    
		    while(i<j)
		    {
		        swap(nums,i,j);
		        i++;
		        j--;
		    }
		}

}
