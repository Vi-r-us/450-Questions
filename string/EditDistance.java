package string;

public class EditDistance {

	public static void main(String[] args) {
		// 14 : EDIT Distance [Very Imp]
		
		String s = "geek";
		String t = "gesek";
		
		int[][] dp = new int[s.length()+1][t.length()+1];
		
		for (int i=0 ; i<=s.length() ; i++) {
			for (int j=0 ; j<=t.length() ; j++) {
				
				if (i==0) 
					dp[0][j] = j;
				
				else if (j==0) 
					dp[i][j] = i;
				
				else if (s.charAt(i-1) == t.charAt(j-1)) 
					dp[i][j] = dp[i-1][j-1];
				
				else 
					dp[i][j] = Math.min(dp[i-1][j-1] , Math.min(dp[i-1][j], dp[i][j-1])) + 1;
			}
		}
		
		System.out.println("Minimum operations required : " + dp[s.length()][t.length()] );

	}

}
