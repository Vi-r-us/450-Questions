package string;

public class LongestPalindromeSubstring {

	public static void main(String[] args) {
		// 8 : Write a program to find the longest Palindrome in a string.[ Longest palindromic Substring]
		
		String str = "xxxx";
		
		int[][] dp = new int[str.length()][str.length()];	
		int result = 0;
		
		for (int g=0 ; g<str.length() ; g++) {
			
			for (int i=0 , j=g ; j<str.length() ; i++ , j++) {
				if (g == 0) dp[i][j] = 0;
				
				else dp[i][j] = (str.charAt(i) == str.charAt(j)) ? dp[i][j-1]+1 : dp[i][j-1];
				
				result = Math.max(result, dp[i][j]);
				
			}
		}
		
		System.out.println(result);

	}

}
