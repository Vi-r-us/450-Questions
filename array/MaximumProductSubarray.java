package array;

public class MaximumProductSubarray {

	public static void main(String[] args) {
		// 23 : Find maximum product sub-array
		
		int[] arr = {2, 3, 4, 5, -1, 0 };
		
		// Variables to store maximum and minimum
        // product till ith index.
        int minVal = arr[0];
        int maxVal = arr[0];
    
        int maxProduct = arr[0];
    
        for (int i = 1; i < arr.length; i++)
        {
            if (arr[i] < 0)
            {
                int temp = maxVal;		// When multiplied by -ve number,
                maxVal = minVal;        // maxVal becomes minVal
                minVal =temp;			// and minVal becomes maxVal
            }
    
            maxVal = Math.max(arr[i], maxVal * arr[i]);	// maxVal and minVal stores the
            minVal = Math.min(arr[i], minVal * arr[i]); // product of sub-array ending at arr[i].
    
            maxProduct = Math.max(maxProduct, maxVal);	// Max Product of array.
        }
    
		System.out.println(maxProduct);
	}

}
