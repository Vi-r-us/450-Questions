package string;

public class CountAndSay {
	// 7 : Count And Say Problem
	
	public static String countAndSay(int n) {
        
		if ( n == 1	 ) 
			return "1";
		
		String check = countAndSay(n-1);
		StringBuilder str = new StringBuilder();

		int count = 1, i=0;
		
		for (i = 1 ; i<check.length() ; i++ ) {
			
			if (check.charAt(i) == check.charAt(i-1)) count++;
			else {
				str.append(count);
				str.append(check.charAt(i-1));
				count = 1;
			}
		}
		str.append(count);
		str.append(check.charAt(i-1));
		
		return str.toString();
    }

	public static void main(String[] args) {
		int n = 7;	
		System.out.println(countAndSay(n));
	}

}
