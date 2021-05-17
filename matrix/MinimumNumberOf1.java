package matrix;

public class MinimumNumberOf1 {

	public static void main(String[] args) {
		// 4 : Find row with maximum no. of 1's
		
		int[][] arr = {{0, 1, 1, 1},
		           {0, 0, 1, 1},
		           {1, 1, 1, 1},
		           {0, 0, 0, 0}};
		int n = arr.length, m = arr[0].length;
		
		int result=-1;
		for (int i=0, j=m-1 ; i<n && j>=0 ;) {
			if (arr[i][j] == 1) {
			    result = i;
			    j--;
			}
			else i++;
		}
		System.out.println(result);

	}

}
