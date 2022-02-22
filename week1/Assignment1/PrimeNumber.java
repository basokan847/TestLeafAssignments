package week1.Assignment1;

public class PrimeNumber {
	
	public static void main(String[] args) {
		int a = 15;
		boolean flag = false;
		for (int i = 2; i <= a/2; i++) {
			int b = a%i;	
			if(b==0) {
				flag = true;
				break;
			}
		}
		if(flag == true) {
			System.out.println("Given number is not prime");
		}
		else {
			System.out.println("Given number is prime");
		}
	}
}
