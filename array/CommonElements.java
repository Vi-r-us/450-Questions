package array;

import java.util.Scanner;

public class CommonElements {

	public static void main(String[] args) {
		// 19 : Find common elements in 3 Sorted array 
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Enter the length of first array : ");
		int n1 = sc.nextInt();
		int A[] = new int[n1];
		System.out.print("Enter the length of second array : ");
		int n2 = sc.nextInt();
		int B[] = new int[n2];
		System.out.print("Enter the length of third array : ");
		int n3 = sc.nextInt();
		int C[] = new int[n3];
		
		System.out.println("\nEnter the elements of first array :: ");
		for (int i=0 ; i<n1 ; i++) {
			System.out.print("Enter the " + (i+1) + "th element : ");
			A[i] = sc.nextInt();
		}
		System.out.println("\nEnter the elements of second array :: ");
		for (int i=0 ; i<n2 ; i++) {
			System.out.print("Enter the " + (i+1) + "th element : ");
			B[i] = sc.nextInt();
		}
		System.out.println("\nEnter the elements of third array :: ");
		for (int i=0 ; i<n3 ; i++) {
			System.out.print("Enter the " + (i+1) + "th element : ");
			C[i] = sc.nextInt();
		}
		
		
		System.out.print("\n First Array is : [  ");
		for (int ele : A) System.out.print(ele + "  ");
		System.out.print("]");
		System.out.print("\n Second Array is : [  ");
		for (int ele : B) System.out.print(ele + "  ");
		System.out.print("]");
		System.out.print("\n Third Array is : [  ");
		for (int ele : C) System.out.print(ele + "  ");
		System.out.print("]");
		
		
		int i=n1-1, j=n2-1, k=n3-1;
		
		while (i>=0 && j>=0 && k >= 0) {
			if (A[i] == B[j] && B[j] == C[k]) {
				System.out.println(A[i]);; i--; j--; k--;
			}
			else {
				if (A[i]<B[j]) j--;
				else if(A[i]>B[j]) i--;
				
				if (A[i]<C[k]) k--;
				else if(A[i]<C[k]) i--;
			}
		}
		
		sc.close();
	}

}
