package array;

public class TrapRainWater {

	public static void main(String[] args) {
		// 29 : Trapping Rain water problem
		
		int[] arr = {7,1,4,0,2,8,6,3,5};
		int n = arr.length;
		
		int l = 0, r = n-1, lMax = 0, rMax = 0, ans =0;
		
		while (l < r) {
			if (arr[l] > arr[r]) {
				if (rMax < arr[r]) rMax = arr[r];
				else ans += rMax - arr[r];
				r--;
			}
			else {
				if (lMax < arr[l]) lMax = arr[l];
				else ans += lMax - arr[l];
				l++;
			}
		}
		
		System.out.println(ans);
		

	}

}
