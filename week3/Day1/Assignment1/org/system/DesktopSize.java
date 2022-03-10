package week3.Day1.Assignment1.org.system;

public class DesktopSize extends Computer {

	public void desktopSize() {
		System.out.println("This desktop size is 14.6 inches");
	}
	public static void main(String[] args) {
		DesktopSize desk = new DesktopSize();
		desk.computerModel();
		desk.desktopSize();
	}
}
