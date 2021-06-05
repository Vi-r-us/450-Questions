package string;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class AnagramTogether {

	public static void main(String[] args) {
		// 36 : Given a sequence of words, print all anagrams together
		
		String[] string_list = {"act","god","cat","dog","tac"};
		
		List<List<String>> result = new ArrayList<List<String>>();
		
		String[] stringListCopy = string_list.clone();
		
		for (int i=0 ; i<string_list.length ; i++) 
			stringListCopy[i] = sortString(string_list[i]); 
		
		for (int i=0 ; i<string_list.length ; i++) {
			if (stringListCopy[i] == null) continue;
			
			List<String> tempList = new ArrayList<String>();
			tempList.add(string_list[i]);
			
			for (int j=i+1 ; j<string_list.length ; j++) {
				
				if (stringListCopy[i].equals(stringListCopy[j])) {
					
					tempList.add(string_list[j]);
					stringListCopy[j] = null;
					
				}
				
			}
			result.add(tempList);
			
		}
		
		System.out.println(result);
	}
	
	public static String sortString(String inputString)
    {
        char tempArray[] = inputString.toCharArray();
        Arrays.sort(tempArray);
        return new String(tempArray);
    }

}
