package string;

public class PalindromicSubsequence {

	public static void main(String[] args) {
		// 22 : Count All Palindromic Subsequence in a given String.
		
		String str = "abccbc";
		
		long[][] dp = new long[str.length()][str.length()];	
		
		for (int g=0 ; g<str.length() ; g++) {
			
			for (int i=0 , j=g ; j<str.length() ; i++ , j++) {
				if (g == 0) dp[i][j] = 1;
				
				else if (g == 1) dp[i][j] = (str.charAt(i) == str.charAt(j)) ? 3 : 2;
				
				else dp[i][j] = (str.charAt(i) == str.charAt(j)) ? (dp[i][j-1] + dp[i+1][j] + 1) : (dp[i][j-1] + dp[i+1][j] - dp[i+1][j-1]);
				
				//if (dp[i][j] && str.substring(i, j+1).length() > result.length()) result = str.substring(i, j+1);
			}
		}
		
		System.out.println(dp[0][str.length()-1]);
	}

}
