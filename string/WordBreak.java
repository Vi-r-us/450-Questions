package string;

import java.util.*;

public class WordBreak {

	// 17 : Word break Problem [Very Imp] // can apply dynamic programming too
	
	static int wordBreak(String A, ArrayList<String> B ) {
		
		if (A.length() == 0) return 1;
		
		int ans = 0;
		
		for (String ele : B) {
			if (ele.length() > A.length()) continue;
			
			String s = A.substring(0, ele.length());
			
			if (s.equals(ele)) {
				ans = wordBreak(A.substring(ele.length()), B);
				
			if (ans == 1) break;
			}
		}
		
		return ans;
		
	}
	
	public static void main(String[] args) {

		
		String A = "ilikesamsung";
		ArrayList<String> B = new ArrayList<>();
		
		String[] words = { "i", "like", "sam", "sung", "samsung", "mobile",
				"ice","cream", "icecream", "man", "go", "mango", "likes" };
		
		Collections.addAll(B, words);
		
		System.out.println(wordBreak(A, B));

	}

}
