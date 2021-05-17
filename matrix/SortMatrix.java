package matrix;

import java.util.Arrays;

public class SortMatrix {

	public static void main(String[] args) {
		// 5 : Print elements in sorted order using row-column wise sorted matrix
		
		int[][] Mat = {{10,20,30,40},
		               {15,25,35,45}, 
		               {27,29,37,48},
		               {32,33,39,50}};
		int N = Mat.length;
		
		int[] temp = new int[N*N];
		int k=0;
		for (int i=0 ; i<N ; i++) 
			for (int j=0 ; j<N ; j++)
				temp[k++] = Mat[i][j];
		
		Arrays.sort(temp);
		
		k=0;
		for (int i=0 ; i<N ; i++) 
			for (int j=0 ; j<N ; j++)
				Mat[i][j] = temp[k++];
		
		for (int i=0 ; i<N ; i++) {
			for (int j=0 ; j<N ; j++)
				System.out.print(Mat[i][j] + " ");
			System.out.print("\n");
		}

	}

}
