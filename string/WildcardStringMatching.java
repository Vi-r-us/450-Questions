package string;


public class WildcardStringMatching {

	public static void main(String[] args) {
		// 39 : String matching where one string contains wild-card characters

		String S = "aabbccaa";
		
		
		StringBuilder ans = new StringBuilder();
		ans.append(S.charAt(0));
		
		for (int i=1 ; i<S.length() ; i++) {
			if (S.charAt(i-1) != S.charAt(i)) {
				ans.append(S.charAt(i));
			}
		}
		
		System.out.println(ans);
		
	}

}
