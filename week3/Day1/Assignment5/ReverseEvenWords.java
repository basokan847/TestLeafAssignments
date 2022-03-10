package week3.Day1.Assignment5;

public class ReverseEvenWords {

	public static void main(String[] args) {
		String text = "I am a software tester";
		System.out.println("Length of the given string is : "+text.length());
		System.out.println("Given String is : "+text);
		String[] splitString = text.split(" ");
		for (int i = 0; i < splitString.length; i++) {
			//System.out.println(splitString[i]);
			if(i%2!=0) {
				char[] charArray = splitString[i].toCharArray();
				for (int j = charArray.length-1; j >= 0; j--) {
					System.out.print(charArray[j]);
				}
				System.out.print(" ");
			}
			else {
				System.out.print(splitString[i]+" ");
			}
		}
	}
}
