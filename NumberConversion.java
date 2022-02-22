package week1.Assignment3;

public class NumberConversion {

	// Converting Negative number to Positive number
	public static void main(String[] args) {
		int a = -10;
		if(a<0) {
			System.out.println("Original Value is : "+a);
		}
		// Multiply the original negative value with -1 will give the same positive value
		a = a*-1;
		System.out.println("Value after conversion (Positive) : "+a);
	}
}
