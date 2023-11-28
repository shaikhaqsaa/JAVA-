package com.exception;

import javax.naming.InsufficientResourcesException;

public class InSufficientFund extends Exception {
	double amount;
	public InSufficientFund(double amount) {
		this.amount=amount;
	}
	public double getAmount() {
		return this.amount;
	}
	

}
