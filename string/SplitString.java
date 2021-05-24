package string;

public class SplitString {

	public static void main(String[] args) {
		// 12 : Split the Binary string into two substring with equal 0’s and 1’s
		
		String str = "0111100010";
		
		int countZeroTillNow = 0, countOneTillNow = 0, result = 0;
		
		for (int i=0 ; i<str.length() ; i++) {
			if (str.charAt(i) == '0') countZeroTillNow++;
			else countOneTillNow++;
			
			if (countOneTillNow == countZeroTillNow) {
				result++;
			}
		}
		
		System.out.println((result==0) ? -1 : result);
	}

}
