package string;

public class RotationOfAnother {

	public static void main(String[] args) {
		// 5 : Write a Code to check whether one string is a rotation of another
		
		String str1 = "ABCDEF";
		String str2 = "DEFABC";
		
		String temp = str1 + str1;
		
		if ( temp.contains(str2)) System.out.println("Is Rotation");
		else System.out.println("Not Rotaion");

	}

}
