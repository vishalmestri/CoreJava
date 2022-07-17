package com.vishal.thread.basic.a001;

public class Account {
	
	private int balance;
	
	private String accNumber;

	public int getBalance() {
		return balance;
	}

	public void setBalance(int balance) {
		this.balance = balance;
	}
	
	public void add(String threadname,int amount) {
		System.out.println("Adding "+amount+" in account "+this.getAccNumber()+" in thread "+threadname);
		balance=balance+amount;
	}
	public void deduct(String threadname,int amount) {
		System.out.println("Deducting "+amount+" from account "+this.getAccNumber()+" in thread "+threadname);
		balance=balance-amount;
	}
	public static void transfer(String threadname,Account from, Account to, int amount) {
		System.out.println("Transferring -start - "+amount+" from account "+from.getAccNumber()+" to account "+to.getAccNumber()+" in thread "+threadname);
		from.deduct(threadname,amount);
		to.add(threadname,amount);
		System.out.println("Transferring -end - "+amount+" from account "+from.getAccNumber()+" to account "+to.getAccNumber()+" in thread "+threadname);
		
	}

	public String getAccNumber() {
		return accNumber;
	}

	public void setAccNumber(String accNumber) {
		this.accNumber = accNumber;
	}

}
