package com.exception;

public class CheckingAccount {
	double balance;
	int acno;
	String cname;
	public CheckingAccount(double balance, int acno, String cname) {
		super();
		this.balance = balance;
		this.acno = acno;
		this.cname = cname;
		System.out.println("Hello! "+this.cname+"Your Account Number is"+this.acno+" Is opened with "+this.balance+"Rs.");
	}
	public void deposit(double amount) {
		this.balance=this.balance+amount;
	}
	public void withdraw(double amount) throws InSufficientFund{
		if(amount<=this.balance) {
			this.balance=this.balance-amount;
		}else {
//			System.out.println("Sorry!! You need Another"+(amount-this.balance)+"Rs to withdraw");
			throw new InSufficientFund(amount-this.balance);
		}
	}
	public void checkBalance() {
		System.out.println("your Current balance is "+this.balance);
	}
	

}
