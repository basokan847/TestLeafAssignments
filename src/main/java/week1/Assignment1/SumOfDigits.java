package week1.Assignment1;

public class SumOfDigits {

	public static void main(String[] args) {
		int a = 564;
		int sum = 0;
		while (a>0) {
			int b=a%10;
			System.out.println(b);
			sum = sum+b;
			System.out.println(sum);
			a = a/10;
			System.out.println(a);
		}
		System.out.println("Sum of Digits : "+sum);
	}
}
