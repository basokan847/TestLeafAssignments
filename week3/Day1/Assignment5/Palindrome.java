package week3.Day1.Assignment5;

public class Palindrome {

	public static void main(String[] args) {
		String str = "MADAM";
		int strLength = str.length();
		System.out.println("Original string length is : "+strLength);
		String rev = "";
		for (int i = strLength-1; i >= 0; i--) {
			rev = rev+str.charAt(i);
			System.out.println(rev);
		}
		System.out.println("Reversed string length is : "+rev.length());
		if(str.equals(rev)) {
			System.out.println("Given String is palindrome");
		}
		else {
			System.out.println("Given String is not a palindrome");
		}
	}
}
