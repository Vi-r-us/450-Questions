package string;

public class PalindromeString {

	public static void main(String[] args) {
		// 1 : Check whether a String is Palindrome or not
		
		String s = "abba";
		
		int isPalin = 1;
		int i=0 , j=s.length()-1;
		while( i<j ) {
			if (s.charAt(i) != s.charAt(j))	isPalin = 0;
			i++; j--;
		}
		
		System.out.println(isPalin);
	}

}
