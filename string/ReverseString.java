package string;

public class ReverseString {

	public static void main(String[] args) {
		// 1 : Reverse a String
		
		char[] s = {'h', 'e' , 'l' , 'l' , 'o'};
		
		int i=0 , j=s.length-1;
		
		while( i<j ) {
			char temp = s[i];
			s[i] = s[j];
			s[j] = temp;
			i++; j--;
		}
		
		System.out.println(s);
	}

}
