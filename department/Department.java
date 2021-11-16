package org.department;

import org.college.College;

public class Department extends College {
	public void deptName() {
		System.out.println("deptName: Information Technology");
	}
	public static void main(String[] args) {
		Department dn=new Department();
		dn.deptName();
		dn.collegeName();
		dn.collegeCode();
		dn.collegeRank();
		
	}

}
