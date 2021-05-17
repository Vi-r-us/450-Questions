package array;

import java.util.Arrays;

public class FindMedian {

	public static void main(String[] args) {
		// 35 : Median of  sorted arrays of equal size
		
		int v[] = {90 ,100 ,78 ,89 ,67};
		
		Arrays.sort(v);
		if (v.length/2 == 0)
            System.out.println((v[v.length/2] + v[v.length/2 - 1])/2);
		System.out.println(v[v.length/2]);
	}

}
