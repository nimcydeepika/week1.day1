package org.student;

import org.department.Department;

public class AxisBank extends BankInfo {
	private void deposit() {
		System.out.println("deposit: 10000");
	}
	//overriding method
	//with more accessibility
	@Override
	public void depositm1() {
		System.out.println("deposite the amount: 100");
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		BankInfo bank1=new BankInfo();
		bank1.saving();
		bank1.fixed();
		AxisBank bank2=new AxisBank();
		bank2.deposit();
		bank2.depositm1();
	}

}
