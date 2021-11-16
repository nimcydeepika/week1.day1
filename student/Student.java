package org.student;

import org.department.Department;

public class Student extends Department {
	public void studentName() {
		System.out.println("studentName: nimcy");
	}
	public void studentDept() {
		System.out.println("studentDept: It");
	}
	public void studentId() {
		System.out.println("studentId: 987654");
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Student sd=new Student();
		sd.studentName();
		sd.studentDept();
		sd.studentId();
		sd.collegeName();
		sd.collegeCode();
		sd.collegeRank();
		sd.deptName();
	}
}
