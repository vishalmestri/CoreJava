package com.vishal.thread.basic.a003;

public class MyRunnableWithoutSynchronized implements Runnable {

	private int count=0;
	
	public int getCount() {
		return count;
	}

	@Override
	public void run() {
		// TODO Auto-generated method stub
		int i=0;
		for(i=0;i<10_00_000;i++) {
				this.count++;				
			}

		
		System.out.println("Thread "+Thread.currentThread().getName()+" | this.count="+this.count+" | i="+i);
	}

}
