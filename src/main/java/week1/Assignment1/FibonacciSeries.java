package week1.Assignment1;

public class FibonacciSeries {

	public static void main(String[] args) {
		int a=0,b=1,c,count=8;
		
		for (int i = 1; i <= count; i++) {
			System.out.println("Fibonacci Series :"+a);
			c = a+b;
			a = b;
			b = c;
		}
		
	}
}
