package com.cg.service;

import com.cg.bean.Account;

public interface Transaction {
public double withdraw(Account ob,double amount);
public double deposit(Account ob,double amount);
public double transfer(Account from,Account to,double amount);
public default void printStatement(Account ob) {
	System.out.println("===================");
	System.out.println("Statement for Account No"+ob.getAid());
	System.out.println("Account holder"+ob.getAccountholder());
	System.out.println("Balance is=>"+ob.getBalance());
	System.out.println("===================");
}
}
