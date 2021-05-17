package matrix;

public class SpecificPair {

	public static void main(String[] args) {
		// 7 : Find a specific pair in matrix
		
		int[][] mat = {{ 1, 2, -1, -4, -20 },
	             { -8, -3, 4, 2, 1 }, 
	             { 3, 8, 6, 1, 3 },
	             { -4, -1, 1, 7, -6 },
	             { 0, -4, 10, -5, 1 }};
		
		int a=0, b=0 , c=mat.length , d = mat[0].length;
		
		while (mat[a][b] != mat[c][d]) {
			if ( mat[a][b] >= mat[c][d] && a!=c || b!=d) {
				
			}
		}
		

	}

}
