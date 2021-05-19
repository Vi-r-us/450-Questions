package matrix;

public class MaxSizeRectangle {
	// 6 : Maximum size rectangle (can be more optimized using stack)
	
	static int MOH(int[] his) {
		
		int maxArea=0;		// Max Area in Histogram
		for (int i=0 ; i<his.length ; i++) {
			
			// get l: nearest greater left ,  r: nearest greater right
			int l=-1, r=his.length;		
			if (his[i] == 0) continue;	// area for zero dosen't matter
			
			for (int j=i+1 ; j<his.length ; j++) {	
				if (his[i] > his[j]) {		// get ngr
					r = j;
					break;
				}
			}
			
			for (int j=i-1 ; j>-1 ; j--) {
				if (his[i] > his[j]) {		// get ngl
					l = j;
					break;
				}
			}
			maxArea = Math.max(maxArea , (r-l-1)*his[i]);	// take the larger one
		}
		return maxArea;	// return the area
		
	}
	
	public static void main(String[] args) {
		
		int[][] M = { {0,1,1,0} ,
					 {1,1,1,1} ,
					 {1,1,1,1} ,
					 {1,1,0,0} };
		int n=M.length, m=M[0].length; 
		
		int maxAreaFound = 0;
		maxAreaFound = MOH(M[0]);
		
		for (int i=1 ; i<n ;i++) {
			
			for (int j=0 ; j<m ; j++) 
				if (M[i][j] != 0)  
					M[i][j] += M[i-1][j];
				
			maxAreaFound = Math.max(maxAreaFound , MOH(M[i]));
		}
		
		System.out.println(maxAreaFound);
		
	}

}
