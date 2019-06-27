package com.cg.pl;

import com.cg.bean.*;

public class MyWallet {

	public static void main(String[] args) {
//		Account ob=new Account();
		//Abstract class cannot be instantiated
		// TODO Auto-generated method stub
		Account ob1=new SavingAccount(101,22222222,"Raja",25000);
		//ob1.setInterest();
		double b1=ob1.withdraw(245000.00);
		System.out.println(b1);
		SavingAccount s1=(SavingAccount)ob1;
		s1.setInterest();
		System.out.println(ob1);
		SavingAccount ob2=new SavingAccount(105,1545455,"SomeName",55000.00);
		printAcc(ob2);
		System.out.println(ob2 instanceof Account);
	}
	public static void printAcc(Account a) {
		System.out.println(a);
	}public MyWallet() {
		// TODO Auto-generated constructor stub
	}

}
