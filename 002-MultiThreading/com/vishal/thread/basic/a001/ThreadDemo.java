package com.vishal.thread.basic.a001;

public class ThreadDemo {
	
	
	public static void main(String[] args) {
		
		/*
		 * This program has issue that in case on of thread does not reach wait method before other thread calls notify, 
		 * then that thread will starve or keep in wait state forever.
		 * But this behaviour may not occur everytime. It may occur sometime when you run this program.
		 */
		
		System.out.println("* This program has issue that in case on of thread does not reach wait method before other thread calls notify,\n"+
				"* then that thread will starve or keep in wait state forever.\n"
				+
				"* But this behaviour may not occur everytime. It may occur sometime when you run this program.");
		Account account1=new Account();
		account1.setAccNumber("AccNumber001");
		account1.setBalance(10000);
		Account account2=new Account();
		account2.setBalance(10000);
		account2.setAccNumber("AccNumber002");
		Account account3=new Account();
		account3.setBalance(10000);
		account3.setAccNumber("AccNumber003");
		CustomThread001 t1=new CustomThread001("[Thread 1****]",100,account1,account3,true);
		CustomThread001 t2=new CustomThread001("[Thread 2++++]",200,account2,account1,false);
		CustomThread001 t3=new CustomThread001("[Thread 3@@@@]",400,account3,account2,false);
		
		t1.start();
		t2.start();
		t3.start();
		
		
		try {
			Thread.sleep(7000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		System.out.println("account1.getBalance()="+account1.getBalance());
		System.out.println("account2.getBalance()="+account2.getBalance());
		System.out.println("account3.getBalance()="+account3.getBalance());
		
		
	}

}
