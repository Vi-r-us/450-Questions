package array;

import java.util.*;

public class MergeIntervals {

	public static void main(String[] args) {
		// 14 : Merge Intervals
		
		int intervals[][] = { {1,3} , {2,6} , {8,10} , {15,18} };	
		
		Arrays.sort(intervals, (a,b) -> Integer.compare(a[0],b[0]));	// sort the matrix
		
		List<int[]> result = new ArrayList<int[]>();	// new array-list
		int ptr1 = intervals[0][0],ptr2 = intervals[0][1];
		
		for (int i=1; i<intervals.length; i++) {
			if (ptr2 < intervals[i][0]) {
				result.add(new int[]{ptr1, ptr2});
				ptr1 = intervals[i][0];  
				ptr2 = intervals[i][1];
			}
			else {
				if (ptr2 < intervals[i][1])
					ptr2 = intervals[i][1];
				ptr2 = (ptr2 < intervals[i][1]) ? intervals[i][1] : ptr2;
			}
		}
		result.add(new int[]{ptr1, ptr2});
		
		int[][] ans = result.toArray(new int[result.size()][]);
		
		System.out.print("\n Result is : [  ");
		for (int[] ele : ans) System.out.print( "[" + ele[0] + " , " + ele[1] + "] ");
		System.out.print("]");
	}

}
