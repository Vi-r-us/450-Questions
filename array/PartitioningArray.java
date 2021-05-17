package array;

public class PartitioningArray {

	public static void main(String[] args) {
		// 32 : Three way partitioning of an array around a given value
		
		int[] arr = {3, 4, 1, 9, 56, 7, 9, 12};
		int n = arr.length, a = 7, b = 9;
		
		int l = 0 , r = n-1;
		
		int i = 0; 
		while (i <= r) {
			if (arr[i] <= a) {
				int temp = arr[i];
				arr[i] = arr[l];
				arr[l] = temp;
				l++;
				i++;
			}
			else if (arr[i] > b) {
				int temp = arr[i];
				arr[i] = arr[r];
				arr[r] = temp;
				r--;
			}
			else i++;
		}

		System.out.print("\n Array is : [  ");
		for (int ele : arr) System.out.print(ele + "  ");
		System.out.print("]\n");

	}

}
