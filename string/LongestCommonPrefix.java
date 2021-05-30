package string;

import java.util.Arrays;

public class LongestCommonPrefix {
	// 27 : Longest Common Prefix
	
	static String longestCommonPrefix(String[] strs) {
		
		if (strs == null || strs.length == 0) return "";
        if (strs.length == 1) return strs[0];
        
		StringBuilder sb = new StringBuilder();
		Arrays.sort(strs);
		
		char[] first = strs[0].toCharArray();
		char[] last = strs[strs.length-1].toCharArray();
		
		for (int i = 0, j = 0; i < first.length && j < last.length; i++, j++) {
			if (first[i] != last[i]) break;
			sb.append(first[i]);
		}
		return sb.toString();
		
	}
	public static void main(String[] args) {

		String[] strs = {"flower","flow","flight"};
		
		System.out.println(longestCommonPrefix(strs));

	}

}
