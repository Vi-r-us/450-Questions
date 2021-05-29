package string;

import java.util.*;

public class SearchWord2DGrid {

	// 23 : Count of number of given string in 2D character array

		static boolean internalSearch(int curRow , int curCol , int rowMax , int colMax, String  word , char[][] grid , int x , int y) {
			
			if (curRow >= 0 && curRow < rowMax && curCol >= 0 && curCol < colMax 
					 && grid[curRow][curCol] == word.charAt(0) ) {		
				
				if (word.length() == 1) return true;
				else return internalSearch(curRow+x, curCol+y, rowMax, colMax, word.substring(1), grid, x, y);
						
			}
			return false;
			
		}
		
		public static void main(String[] args) {
			char[][] grid ={{'a','b','a','e','b','e','e','e','c','c'}, 
					{'a','b','e','c','b','d','e','c','a','d'} ,
					{'e','c','c','c','c','a','d','a','c','b'} ,
					{'e','e','a','d','d','d','c','b','b','b'} ,
					{'b','d','b','a','c','a','b','b','d','d'} ,
					{'c','c','c','d','a','e','a','c','e','b'}};
			
			String word = "bed";
			
			List<ArrayList<Integer>> result = new ArrayList<>();
			
			int[] xAxis = {-1,-1,-1,0,0,1,1,1}; 
			int[] yAxis = {-1,0,1,1,-1,1,0,-1}; 
			
			for (int i=0 ; i<grid.length ; i++) {
				
				for (int j=0; j<grid[0].length ; j++) {	
					
					if (grid[i][j] == word.charAt(0))
						for (int k=0 ; k<xAxis.length ; k++) {
							if(internalSearch(i+xAxis[k], j+yAxis[k], grid.length, grid[0].length , word.substring(1) , grid , xAxis[k], yAxis[k])) {
								List<Integer> dir = new ArrayList<>();
								dir.add(i);
								dir.add(j);
								result.add((ArrayList<Integer>) dir); 
							}
						}
					
				}
			}
			
			System.out.println("Result : " + result);
			
		}

}
