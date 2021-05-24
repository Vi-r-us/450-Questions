package string;

public class LongestPalindromeSubstring {

	public static void main(String[] args) {
		// 8 : Write a program to find the longest Palindrome in a string.[ Longest palindromic Substring]
		
		String str = "xxxx";
		
		boolean[][] dp = new boolean[str.length()][str.length()];	
		String result = new String();
		
		for (int g=0 ; g<str.length() ; g++) {
			
			for (int i=0 , j=g ; j<str.length() ; i++ , j++) {
				if (g == 0) dp[i][j] = true;
				
				else if (g == 1) dp[i][j] = (str.charAt(i) == str.charAt(j)) ? true : false;
				
				else dp[i][j] = (str.charAt(i) == str.charAt(j) && dp[i+1][j-1]) ? true : false;
				
				if (dp[i][j] && str.substring(i, j+1).length() > result.length()) result = str.substring(i, j+1);
			}
		}
		
		System.out.println(result);

	}

}
