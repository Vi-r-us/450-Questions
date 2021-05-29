package string;

public class CountStringIn2DArray {
	// 23 : Count of number of given string in 2D character array
	
	static int internalSearch(int curRow , int curCol , int rowMax , int colMax, String  str , boolean[][] visited , String[] a) {
		
		int found  = 0;
		if (curRow >= 0 && curRow < rowMax && curCol >= 0 && curCol < colMax 
				&& !visited[curRow][curCol] &&  str.charAt(0) == a[curRow].charAt(curCol)) {		
			
			if (str.length() != 1)
				visited[curRow][curCol] = true;
			else 
				return 1;
		
			found += internalSearch(curRow-1, curCol, rowMax, colMax, str.substring(1), visited, a);
			found += internalSearch(curRow+1, curCol, rowMax, colMax, str.substring(1), visited, a);
			found += internalSearch(curRow, curCol-1, rowMax, colMax, str.substring(1), visited, a);
			found += internalSearch(curRow, curCol+1, rowMax, colMax, str.substring(1), visited, a);
			
		}
		
		return found;
		
	}
	
	public static void main(String[] args) {
		String[] a ={ "BBABBM", "CBMBBA",
                "IBABBG", "GOZBBI",
                "ABBBBC", "MCIGAM" };
		
		String str = "MAGIC";
		
		int result = 0;
		
		for (int i=0 ; i<a.length ; i++) {
			for (int j=0; j<a[i].length() ; j++) {	
				boolean[][] visited = new boolean [a.length] [a[i].length()];
				result += internalSearch(i, j, a.length, a[0].length(), str, visited, a); 
			}
		}
		
		System.out.println("Result : " + result);
		
	}
	
}
