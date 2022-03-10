package week3.Day1.Assignment2.org.student;

import week3.Day1.Assignment2.org.department.Department;

public class Student extends Department {

	public void studentName() {
		System.out.println("Student Name : Ramesh");
	}
	public void studentDept() {
		System.out.println("Student Department : ECE");
	}
	public void studentId() {
		System.out.println("Student ID : 12303");
	}
	public static void main(String[] args) {
		Student stud = new Student();
		stud.collegeName();
		stud.collegeCode();
		stud.collegeRank();
		stud.department();
		stud.studentName();
		stud.studentDept();
		stud.studentId();
	}
}
