package org.student;

public class Students {
	public void getStudentInfo() {
		System.out.println("default constructor");
	}
	String studentName;
	int studentId;
	char email;
	long phoneNumber;

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Students info=new Students();
		info.getStudentInfo();
		System.out.println(info.studentName);
		System.out.println(info.studentId);
		System.out.println(info.email);
		System.out.println(info.phoneNumber);

	}

}
