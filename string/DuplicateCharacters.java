package string;

import java.util.*;

public class DuplicateCharacters {
	
	// 3 : Find Duplicate characters in a string
	
	static final int NO_OF_CHARS = 256;
	    
    static void fillCharCounts(String str, int[] count)	 /* Fills count array with frequency of characters */
    {
        for (int i = 0; i < str.length(); i++)
            count[str.charAt(i)]++;
    }
	public static void main(String[] args) {
		
		String str = "test strings";
		
		int count[] = new int[NO_OF_CHARS];
        fillCharCounts(str, count);
        
        for (int i = 0; i < NO_OF_CHARS; i++)
            if (count[i] > 1)							// only counts greater then 1 
                System.out.println((char)(i) + ", count = " + count[i]);	

	}

}
