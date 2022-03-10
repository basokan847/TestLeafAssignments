package week3.Day2.Assignments;

public class MyBank {

	public static void main(String[] args) {
		SBI obj1 = new SBI();
		obj1.openAccount();
		obj1.provideDebitCard();
		obj1.provideCreditCard();
		
		RBI obj2 = new SBI();
		obj2.openAccount();
		obj2.provideDebitCard();
	}
}
