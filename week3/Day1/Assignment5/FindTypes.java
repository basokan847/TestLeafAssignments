package week3.Day1.Assignment5;

public class FindTypes {

	public static void main(String[] args) {
		String text = "$$ Welcome to 2nd Class of Automation $$ ";
		int letter = 0, space = 0, num = 0, specialChar = 0;
		System.out.println("Length of given string is : "+text.length());
		char[] text1 = text.toCharArray();
		System.out.println(text1);
		//Character.isLetter(text1);
		for (int i = 0; i < text1.length; i++) {
			boolean letter2 = Character.isLetter(text1[i]);
			boolean digit = Character.isDigit(text1[i]);
			@SuppressWarnings("deprecation")
			boolean space2 = Character.isSpace(text1[i]);
			if(letter2) {
				letter = letter+1;
			}
			else if(digit) {
				num = num+1;
			} 
			else if(space2) {
				space = space+1;
			} 
			else {
				specialChar = specialChar+1;
			} 
		}
		System.out.println("Letters in string is : "+letter);
		System.out.println("Numbers in string is : "+num);
		System.out.println("Spaces in string is : "+space);
		System.out.println("Special characters in string is : "+specialChar);
	}
}
