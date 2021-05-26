package string;

public class MobileNumericKeypad {

	public static void main(String[] args) {
		// 20 : Convert a Sentence into its equivalent mobile numeric keypad sequence.
		
		String str = "LEET CODE";
		String keyCombo[] = {"2","22","222",
                "3","33","333",
                "4","44","444",
                "5","55","555",
                "6","66","666",
                "7","77","777","7777",
                "8","88","888",
                "9","99","999","9999"
            };
		String output = "";
		
		for (int i =0 ; i<str.length() ; i++) {
			
			if (str.charAt(i) == ' ') output += "0";
			
			else output += keyCombo[str.charAt(i) - 'A'];
		}
		
		System.out.println(output);

	}

}
