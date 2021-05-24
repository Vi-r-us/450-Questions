package string;

import java.util.*;

public class PermutationsInString {
	static // 11 : Print all the permutations of the given string
	
	List<String> result = new ArrayList<>();
	
	static void permute(String str, int l , int r) {
		if (l == r)
            result.add(str);
        else
        {
            for (int i = l; i <= r; i++)
            {
                str = swap(str,l,i);
                permute(str, l+1, r);
                str = swap(str,l,i);
            }
        }
	}
	
	public static void main(String[] args) {
		
		String str = "ABCD";
		
		result.clear();
		permute(str , 0 , str.length()-1);
		Collections.sort(result);
		System.out.println(result);

	}
	
	public static String swap(String a, int i, int j)
    {
        char temp;
        char[] charArray = a.toCharArray();
        temp = charArray[i] ;
        charArray[i] = charArray[j];
        charArray[j] = temp;
        return String.valueOf(charArray);
    }

}
