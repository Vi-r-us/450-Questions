package string;

public class ParenthesisChecker {

	public static void main(String[] args) {
		// 16 : Balanced Parenthesis problem.[Imp]
		
		String x = "[({[([{}])]})}";
		
		int roundBrackets = 0, curlyBrackets = 0, squareBrackets = 0;
		
		for (int i=0 ; i<x.length() ; i++) {
			
			if (x.charAt(i) == '(') roundBrackets++;
			else if (x.charAt(i) == ')') roundBrackets--;
			else if (x.charAt(i) == '{') curlyBrackets++;
			else if (x.charAt(i) == '}') curlyBrackets--;
			else if (x.charAt(i) == '[') squareBrackets++;
			else if (x.charAt(i) == ']') squareBrackets--;
			
		}

		System.out.println( ( roundBrackets == 0 && curlyBrackets == 0 && squareBrackets == 0 ) ? "true" : "false");

	}

}
