package matrix;

public class FindMedian {

	public static void main(String[] args) {
		// 3 : Find median in a row wise sorted matrix
		
		int[][] matrix = { {1, 3, 5} ,
          				   {2, 6, 9} ,
          				   {3, 6, 9}};
		int r = matrix.length, c = matrix[0].length;
		
		int median = 0;
		for (int i=0 ; i<r ; i++) {
			median += matrix[i][c/2];
		}
		
		System.out.println(median/r);
	}

}
