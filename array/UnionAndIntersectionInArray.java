package array;

import java.util.Scanner;

public class UnionAndIntersectionInArray {

	public static void main(String[] args) {
		// 6 : Find the Union and Intersection of the two sorted arrays.
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Enter the length of First array : ");
		int n = sc.nextInt();
		int arr1[] = new int[n];
		System.out.println("\nEnter the elements of first array (sorted) :: ");
		for (int i=0 ; i<n ; i++) {
			System.out.print("Enter the " + (i+1) + "th element : ");
			arr1[i] = sc.nextInt();
		}
		
		System.out.print("\n\nEnter the length of Second array : ");
		int m = sc.nextInt();
		int arr2[] = new int[m];
		System.out.println("\nEnter the elements of second array (sorted) :: ");
		for (int i=0 ; i<m ; i++) {
			System.out.print("Enter the " + (i+1) + "th element : ");
			arr2[i] = sc.nextInt();
		}
		
		System.out.print("\n First Array is : [  ");
		for (int ele : arr1) System.out.print(ele + "  ");
		System.out.print("]\n");
		System.out.print("\n Second Array is : [  ");
		for (int ele : arr2) System.out.print(ele + "  ");
		System.out.print("]\n");
		
		int[] intersection = new int[(n<m) ? m:n];
		int[] union =  new int[n+m];
			
		// for intersection
		int i=0;
		if (n<=m) {
			for(int ele1: arr1) 
				for (int ele2: arr2) 
					if (ele1 == ele2) {
						intersection[i] = ele1;
						i++;
					}
		}
		else {
			for(int ele1: arr2) 
				for (int ele2: arr1) 
					if (ele1 == ele2) {
						intersection[i] = ele1;
						i++;
					}

		}
		
		// for union 
		int j=0;
			for(int ele1: arr2) 
				union[j++] = ele1;	
			for(int ele1: arr1) {
				int count = 0;
				for (int k=0; k<j;k++) {
					if (union[k] == ele1)	break;
					else	count++;
					
					if (count == j) union[j++] = ele1;
				}
			}
			
			for (int x=0; x<j-1; x++) {			// sort the union array
				boolean isSorted = true;
				for (int y=0; y<j-1-x; y++) {
					
					if (union[y+1]<union[y]) {
						int temp = union[y+1];
						union[y+1] = union[y];
						union[y] = temp;
						isSorted = false;
					}
				}
				if (isSorted) break;
			}
		
		
		System.out.print("\n Intersecting Array is : [  ");
		for (int k=0; k<i; k++) System.out.print(intersection[k] + "  ");
		System.out.print("]\n");
		
		System.out.print("\n Union of Array is : [  ");
		for (int k=0; k<j; k++) System.out.print(union[k] + "  ");
		System.out.print("]\n");
		
		sc.close();
	}

}
