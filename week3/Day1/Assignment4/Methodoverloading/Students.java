package week3.Day1.Assignment4.Methodoverloading;

public class Students {

	public void getStudentInfo(int Id) {
		System.out.println("Student Id : "+Id);
	}
	public void getStudentInfo(int Id, String Name) {
		System.out.println("Student Id is "+Id+" and name is "+Name);
	}
	public void getStudentInfo(String Email, long PhoneNo) {
		System.out.println("Student Email id is "+Email+" and Phone Number is "+PhoneNo);
	}
	public static void main(String[] args) {
		Students stud = new Students();
		stud.getStudentInfo(13579);
		String name = new String("Suresh");
		String email = new String("test123@gmail.com");
		stud.getStudentInfo(24680, name );
		stud.getStudentInfo(email, 9876543210l);
	}
}
