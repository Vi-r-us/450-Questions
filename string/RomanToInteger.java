package string;

import java.util.HashMap;

public class RomanToInteger {

	public static void main(String[] args) {
		// 26 : Converting Roman Numerals to Decimal
		
		String str = "LXIV";
		
		int result=0;
		HashMap<Character, Integer> numbers = new HashMap<>();
		
		numbers.put('I', 1);
		numbers.put('V', 5);
		numbers.put('X', 10);
		numbers.put('L', 50);
		numbers.put('C', 100);
		numbers.put('D', 500);
		numbers.put('M', 1000);
		
		for (int i=0 ; i<str.length() ; i++) {
			if (numbers.get(str.charAt(i)) >= numbers.get(str.charAt(i+1))) {
				result += numbers.get(str.charAt(i));
			}
			else {
				result += numbers.get(str.charAt(i+1))-1;
				break;
			}
		}
		
		System.out.println(result);
	}

}
