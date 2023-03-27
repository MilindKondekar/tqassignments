package com.testPaper;

public class TestAccount {

	public static void main(String[] args) {
		
		Account a1 = new Account(1,"Milind","SBI");
		Account a2 = new Account(1,"Rushi","Axis");
		Account a3 = new Account(1,"Vinayak","HDFC");
		
		
		System.out.println(a1.getBalance());
		
		a1.Deposit(50000);
		a1.Withdraw(25000);

		
	}

}
