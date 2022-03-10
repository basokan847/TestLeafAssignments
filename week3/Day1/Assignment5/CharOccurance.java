package week3.Day1.Assignment5;

public class CharOccurance {

	public static void main(String[] args) {
		String str = "Welcome to chennai";
		int count = 0;
		char[] strchar = str.toCharArray();
		System.out.println("Length of the given array is : "+strchar.length);
		System.out.println(strchar);
		for (int i = 0; i < strchar.length; i++) { 
			if(strchar[i]=='e') { 
				count = count+1; 
			} 
		} 
		System.out.println("The count of character 'E' in the string is : "+ count);
	}
}
