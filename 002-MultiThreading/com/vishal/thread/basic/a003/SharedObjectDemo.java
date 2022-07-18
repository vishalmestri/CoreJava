package com.vishal.thread.basic.a003;

public class SharedObjectDemo {

	public static void main(String[] args) {
		MyRunnableWithoutSynchronized myRunnableWithoutSynchronized=new MyRunnableWithoutSynchronized();
		MyRunnableWithSynchronized myRunnableWithSynchronized=new MyRunnableWithSynchronized();
		
		Thread t1=new  Thread(myRunnableWithoutSynchronized,"Thread 1");
		Thread t2=new  Thread(myRunnableWithoutSynchronized,"Thread 2");
		Thread t3=new  Thread(myRunnableWithSynchronized,"Thread 3");
		Thread t4=new  Thread(myRunnableWithSynchronized,"Thread 4");
		t1.start();
		t2.start();
		t3.start();
		t4.start();
		try {
			Thread.sleep(4000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		System.out.println("----------------------------------------------------------------------");
		System.out.println("Thread 1 and 2 shares runnable object without synchronized used in run method. \n hence it leads to variable Visiblity issue.");
		System.out.println("Thread "+Thread.currentThread().getName()+" | this.count="+myRunnableWithoutSynchronized.getCount());
		System.out.println("----------------------------------------------------------------------");
		System.out.println("Thread 3 and 4 shares runnable object with synchronized used in run method. \n hence it does not lead to variable Visiblity issue.");
		System.out.println("Thread "+Thread.currentThread().getName()+" | this.count="+myRunnableWithSynchronized.getCount());
		System.out.println("----------------------------------------------------------------------");
		
	}
}
