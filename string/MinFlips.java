package string;

public class MinFlips {

	public static void main(String[] args) {
		// 28 : Number of flips to make binary string alternate
		
		String S = "0001010111";
		
		int forOdd=0, forEven=0;
		
		for (int i=0 ;i<S.length() ; i++) {
			
			if (i%2 == 0) {
				if ( S.charAt(i) != '1' ) forOdd++;
				else if ( S.charAt(i) != '0' ) forEven++;
			}
			else {
				if ( S.charAt(i) != '0') forOdd++;
				else if ( S.charAt(i) != '1' ) forEven++;
			}
		}
		
		System.out.println((forOdd<forEven) ? forOdd : forEven);
	}

}
