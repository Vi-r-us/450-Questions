package string;

public class CountReversal {

	public static void main(String[] args) {
		// 21 :  Minimum number of bracket reversals needed to make an expression balanced.
		
		String s = "}{{}}{{{";
		Boolean isOdd= true;
		
		int ans = 0;
	    if(s.length()%2 != 0) isOdd = false;
	    int cnt = 0;
	    
	    for(int i=0;i<s.length();i++){
	        if(s.charAt(i) == '{'){
	            cnt++;
	        }
	        else{
	            if(cnt == 0){
	                ans++;
	                cnt++;
	            }
	            else{
	                cnt--;
	            }
	        }
	    }
	    
	    System.out.println("Result : " + ((isOdd) ? (ans + cnt/2) : -1));
	}

}
