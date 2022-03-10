package week3.Day1.Assignment3.Methodoverriding;

public class AxisBank extends BankInfo {

	  public void deposit() {
	  System.out.println("Axis bank Deposit amount is 12000"); }
	 
	public static void main(String[] args) {
		AxisBank axis = new AxisBank();
		axis.saving();
		axis.fixed();
		axis.deposit();
	}
}
