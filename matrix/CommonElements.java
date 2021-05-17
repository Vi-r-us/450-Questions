package matrix;

import java.util.*;

public class CommonElements {

	public static void main(String[] args) {
		// 10 : Common elements in all rows of a given matrix
		
		int[][] mat = {{1, 2, 1, 4, 8},
	             {3, 7, 8, 5, 1},
	             {8, 7, 7, 3, 1},
	             {8, 1, 2, 7, 9},
	            };
		
		int M = mat.length, N = mat[0].length;
		Map<Integer,Integer> mp = new HashMap<>();	// Create a hash set
		
		for (int i=0 ; i<N ; i++) 	// initialize the hash by 1 for 1st row
			mp.put(mat[0][i], 1);

		for (int i=1 ; i<M ;i++) {
			
			for (int j=0 ; j<N ; j++) {
				// if present and have the same number of count as rows 
				if (mp.get(mat[i][j]) != null && mp.get(mat[i][j]) == i) {
					mp.put(mat[i][j], i+1);
			
					if (i==M-1) System.out.print(mat[i][j] + " ");
				}
			}
		}
		

	}

}

