package array;

public class IsSubsetOfAnotherArray {

	public static void main(String[] args) {
		// 27 : Array Subset of another array
		
		long[] a1 = {10, 5, 2, 23, 19};
		long[] a2 = {19, 5, 3};
		long n = a1.length , m = a2.length;
		
		long i = 0, j = n-1;
		while (i<m && j>-1) {
			if (a1[(int) j] == a2[(int) i]) {
				i++; j=n-1;
			}
			else {
				j--;
			}
		}
		
		System.out.println((i != m) ? "No" : "Yes");
		
	}

}
