package matrix;

import java.util.Arrays;

public class KthSmallestElement {

	public static void main(String[] args) {
		// 9 : Kth smallest element in a row-column wise sorted matrix
		
		int[][] mat = {{16, 28, 60, 64},
			            {22, 41, 63, 91},
			            {27, 50, 87, 93},
			            {36, 78, 87, 94 }};
		int n = mat.length , k=3;
		
		int[] result = new int[n*n]; //resultant array
        for(int i = 0; i < n; i++) {
            System.arraycopy(mat[i], 0, result, i*n, n);
        }
        Arrays.sort(result);
        System.out.println(result[k-1]);
		
	}

}
