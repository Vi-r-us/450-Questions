package matrix;

public class SearchElement {
	
	public static void main(String[] args) {
		// 2 : Search an element in a matrix
		
		int[][] matrix = {{1,3,5,7},
		          		{10,11,16,20},
		          		{23,30,34,60}};
		int r = matrix.length, c = matrix[0].length , target = 4;
		
		int i=r-1;
		boolean isPresent = false;
		for (int j=0 ; j<c && i>=0; ) {
			if (matrix[i][j] <= target ) {
				if (matrix[i][j] == target) isPresent = true;
				j++;
			}
			else {
				i--;
			}
		}
		
		System.out.println(isPresent);
	}
}
