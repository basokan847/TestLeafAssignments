package week1.Assignment2;

public class MyCalculator {

	public static void main(String[] args) {
		Calculator obj = new Calculator();
		/*
		 * obj.add(1, 2, 3);
		 *  obj.sub(4, 1); 
		 *  obj.mul(7, 2); 
		 *  obj.div(9, 2);
		 */
		System.out.println("Addition : "+obj.add(1, 2, 3));
		System.out.println("Subtraction : "+obj.sub(4, 1));
		System.out.println("Multiplication : "+obj.mul(7, 2));
		System.out.println("Division : "+obj.div(9, 2));
	}
}
