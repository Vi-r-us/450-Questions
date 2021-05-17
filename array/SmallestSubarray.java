package array;

public class SmallestSubarray {

	public static void main(String[] args) {
		// 31 : Smallest Sub-array with sum greater than a given value
		
		long[] arr = {1, 4, 45, 6, 0, 19};
		long n = arr.length, x = 51;
		
		long sum = 0;
        int count = 0;
        int j = 0;
        int minCount = Integer.MAX_VALUE;
        for(int i = 0 ; i < n ; i++)
        {
            sum += arr[i];
            count++;
            
            while(sum > x)
            {
                minCount = Math.min(minCount,count);
                sum -= arr[j];
                if(sum > x)
                {
                    count--;
                    j++;
                    minCount = Math.min(minCount,count);
                }
                else
                {
                    sum += arr[j];
                    break;
                }
            }
        }
        
        System.out.println(minCount);
	}

}
