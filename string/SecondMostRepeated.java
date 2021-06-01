package string;

import java.util.HashMap;

public class SecondMostRepeated {

	public static void main(String[] args) {
		// 29 : Find the first repeated word in string.
		
		String[] arr = {"aaa", "bbb", "ccc", "bbb", "aaa", "aaa"};
 		
		HashMap<String, Integer> count = new HashMap<>();
		
		for (String ele : arr) {
			if (count.containsKey(ele))  count.put(ele, count.get(ele)+1);
			else  count.put(ele, 1);
		}
		
		int max=0,secondMax=0;
		String maxstr = "", secondMaxstr="" ;
		
		for (String ele : count.keySet()) {
			if ( count.get(ele) >= max ) {
				secondMax = max; 
				secondMaxstr = maxstr;
				max = count.get(ele);
				maxstr = ele;
			}
			else if ( count.get(ele) >= secondMax ){
				secondMax = count.get(ele);
				secondMaxstr = ele;
			}
		}
		
		System.out.println(secondMaxstr);

	}

}
