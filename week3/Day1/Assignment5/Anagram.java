package week3.Day1.Assignment5;

import java.util.Arrays;

public class Anagram {

	public static void main(String[] args) {
		String text1 = "stops";
		String text2 = "potss";
		int text1Length = text1.length();
		int text2Length = text2.length();
		if(text1Length==text2Length) {
			System.out.println("Both length are same");
			char[] text1char = text1.toCharArray();
			char[] text2char = text2.toCharArray();
			System.out.println(text1char);
			System.out.println(text2char);
			Arrays.sort(text1char);
			Arrays.sort(text2char);
			System.out.println(text1char);
			System.out.println(text2char);
			if(Arrays.equals(text1char, text2char)) {
				System.out.println("Given Array characters are same");
			}
			else {
				System.out.println("Given Array characters are not same");
			}
		}
		else {
			System.out.println("Both length are different");
		}
	}
}
