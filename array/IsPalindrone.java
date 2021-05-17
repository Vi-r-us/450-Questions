package array;

public class IsPalindrone {
	
	// 34 : Minimum no. of operations required to make an array palindrome
	
	static boolean isPalindrome(int num) {
		int temp = num, dunum = 0;
		while (temp != 0) {
			dunum = dunum*10 + temp%10;
			temp /= 10;
		}
		
		return (num == dunum) ? true:false ;
	}
	
	public static void main(String[] args) {
		
		int[] a = {111 ,222 ,333 ,444 ,555};
		
		int i=1;
		for (int ele: a) {
			if (!isPalindrome(ele)) {
				i=0;
				break;
			}
		}
		
		System.out.println(i);
	}

}