package array;

import java.util.Scanner;

public class StockPriceQuestion {

	public static void main(String[] args) {
		// 17 : Best Time to Buy and Sell Stock
		
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
		
		int i=arr.length-1, j=arr.length-2,maxProfit=0;
		while (j >= 0) {
			if (arr[j] < arr[i]) {
				maxProfit = Math.max(maxProfit,arr[i]-arr[j]);
				j--;
			}
			else {
				if (j == i-1) {
                    j--; i--;
                }
                else i--;
			}
		}
		
		System.out.println("\n Max Profit can be achieved is : " + maxProfit);
		sc.close();

	}

}
