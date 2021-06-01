package string;

public class BalanceBySwap {

	public static void main(String[] args) {
		// 30 : Minimum number of swaps for bracket balancing.
		
		String S = "[]][][";
		
		int left=0,right=0;
		int swaps=0,imbalance=0;
		
		for (int i=0 ; i<S.length() ; i++) {
			
			if (S.charAt(i) == '[') {
				
				left++;
				if(imbalance > 0) {
					swaps += imbalance;
					imbalance--;
				}
			}
			else {
				right++;
				imbalance = right-left;
			}
		}
		
		System.out.println(swaps);

	}

}
