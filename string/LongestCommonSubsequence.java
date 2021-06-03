package string;

public class LongestCommonSubsequence {

	public static void main(String[] args) {
		// 31 : Find the longest common subsequence between two strings.
		
		String s1 = "abcde";
		String s2 = "axccxe";
		
		int[][] dp = new int[s1.length()+1][s2.length()+1];
		
		for (int i=dp.length-1 ; i>=0 ; i--) {
			for (int j=dp[0].length-1 ; j>=0 ; j--) {
				
				if (i == dp.length-1 || j== dp[0].length-1) {
					dp[i][j] = 0;
				}
				else {
					if (s1.charAt(i) == s2.charAt(j))  dp[i][j] = dp[i+1][j+1] + 1;
					
					else  dp[i][j] = Math.max(dp[i+1][j], dp[i][j+1]);
				}
			}
		}
		
		System.out.println(dp[0][0]);
		
	}

}
