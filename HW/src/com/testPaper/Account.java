package com.testPaper;

import java.util.Scanner;

public class Account 
{
    Scanner sc = new Scanner(System.in);
	private int accountId;
	private String name;
	private float balance;
	private String bankName;
	private String pancard;
	
	public Account(int accountId, String name,  String bankName) 
	{
		
		this.accountId = accountId;
		this.name = name;
		this.balance = 500;
		this.bankName = bankName;
		this.pancard = null;
	}

	public int getAccountId() {
		return accountId;
	}

	public void setAccountId(int accountId) {
		this.accountId = accountId;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public float getBalance() {
		return balance;
	}

	public void setBalance(float balance) {
		this.balance = balance;
	}

	public String getBankName() {
		return bankName;
	}

	public void setBankName(String bankName) {
		this.bankName = bankName;
	}

	public String getPancard() {
		return pancard;
	}

	public void setPancard(String pancard) {
		this.pancard = pancard;
	}
	
	public void Deposit(int amount)
	{
		if(amount>50000)
		{
			System.out.println("Amount Greater than 50,000 enter pan card Details");
			String pan = sc.next();
			Deposit(amount,pan);
		}
		
		else
		{
			this.balance = this.balance+amount;
			System.out.println("Amount Deposited \nNew Balance :"+getBalance());
		}
	}
	
	public void Deposit(int amount, String pan)
	{
		this.balance = this.balance+amount;
		this.pancard=pan;
		System.out.println("Amount Deposited \nNew Balance :"+getBalance());
	}
	
	
	public void Withdraw(int amount)
	{
		if((this.balance - amount) < 500)
		{
			System.out.println("Cannot WithDraw Min Balance Should 500 Rs");
		}
		
		else
		{
			this.balance = this.balance - amount;
			System.out.println("Money WithDrawn \nNew Balance is :"+getBalance());
		}
	}
	
}
