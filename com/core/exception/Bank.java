package com.exception;

import java.util.Scanner;

public class Bank {
	public static void main(String[] args) {
		double amount;
		Scanner sc = new Scanner(System.in);
		CheckingAccount c = new CheckingAccount(1000, 101, "aqsa");
		while(true) {
		System.out.println("1. Deposit");
		System.out.println("2. wihdraw");
		System.out.println("3. Check Blance");
		System.out.println("4. Exit");
		System.out.println("Enter your choice :");
		int choice = sc.nextInt();
		if(choice == 1) {
			System.out.println("Enter Deposit amount: ");
			amount=sc.nextDouble();
			c.deposit(amount);
		}
		else if(choice == 2) {
			try {
			System.out.println("Enter Withdraw amount :  ");
			amount = sc.nextDouble();
			c.withdraw(amount);
			}catch(InSufficientFund e){
				System.out.println("sorry! you need another"+e.getAmount()+"to withdraw ");
			}
		}
		else if(choice == 3) {
			c.checkBalance();
		}else if(choice == 4) {
			System.out.println("Thank you for usim-ng our services");
			break;
		}
		else {
			System.out.println("Invalid choice. TRY AGAIN!!");
		}
	}
		
	}
}
