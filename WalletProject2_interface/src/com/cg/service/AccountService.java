package com.cg.service;

import com.cg.bean.Account;
import com.cg.exception.InsufficientFundException;

public class AccountService implements Gst,Transaction{

	@Override
	public double withdraw(Account ob, double amount) throws InsufficientFundException {
		// TODO Auto-generated method stub
		double new_balance=ob.getBalance()-amount;
		if(new_balance<1000.00) {
			new_balance=ob.getBalance();
			//System.out.println("Insufficient Balance");
			//throw new RuntimeException("Insufficient fund.Cannot process withdrawal");
			throw new InsufficientFundException("Insufficient fund.Cannot process withdrawal",new_balance);
		}
		ob.setBalance(new_balance);
		return new_balance;
	}

	@Override
	public double deposit(Account ob, double amount) {
		return ob.getBalance()+amount;
		
	}

	@Override
	public double transfer(Account from, Account to, double amount) {
		double new_balance=from.getBalance()-amount;
		if(new_balance<1000.00) {
			new_balance=from.getBalance();
			System.out.println("Insufficient Balance");
		}
		else {
			from.setBalance(new_balance);
			to.setBalance(to.getBalance()+amount);
		}
		return new_balance;
	}

	@Override
	public double calculateTax(double PCT, double amount) {
		return amount*Gst.PCT_5;
	}

}
