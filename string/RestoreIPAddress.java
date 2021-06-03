package string;

import java.util.ArrayList;
import java.util.List;

public class RestoreIPAddress {
	
	// 32 : Program to generate all possible valid IP addresses from given  string.
	
	public static List<String> restoreIpAddresses(String s) {
		List<String> result = new ArrayList<>();
		restoreIP (s , result , "" , 0 , 0);
		return result;
	}
	
	static void restoreIP (String s, List<String> res, String restored, int pos, int sec) {
		// check whether left section is too lengthy to be valid
        if (s.length() - pos > 3 * (4 - sec)) return;
        if (sec == 4 && pos == s.length()) {
            res.add(restored);
            return;
        }
        
        for (int i = 1; i <= 3; i++) {
            if (pos + i > s.length()) return;
            
            String part = s.substring(pos, pos + i);
            
            if (part.length() > 1 && part.startsWith("0") || i == 3 && Integer.valueOf(part) >= 256) continue;
            
            restoreIP(s, res, sec == 0 ? part : restored + "." + part, pos + i, sec + 1);
        }
	}
        
    public static void main(String[] args) {
    	String s = "25525511135";
    	System.out.println(restoreIpAddresses(s));
    }

}
