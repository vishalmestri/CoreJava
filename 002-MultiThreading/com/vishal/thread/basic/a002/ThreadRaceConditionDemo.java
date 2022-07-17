package com.vishal.thread.basic.a002;

public class ThreadRaceConditionDemo {

	public static void main(String[] args) {
		System.out.println("Demo of Race condition:");
		System.out.println("Race Condition:-Happen when two threads share some data on heap. Both thread read and write it in not synchronized manner.");
		
		System.out.println("Please check youtube vid: https://www.youtube.com/watch?v=LCSqZyjBwWA&list=PLL8woMHwr36EDxjUoCzboZjedsnhLP1j4&index=3");
		System.out.println("");
		MyObject myObject=new MyObject();
		myObject.setVar1(0);
		//MyThread t1=new MyThread(myObject);
		
		int threadCount=100000;
		
		
		System.out.println("-------------RACE CONDITION DEMO - START-------------------------------------");
		MyThreadWithRaceCondition t[]=new MyThreadWithRaceCondition[threadCount];
		
		for(int i=0;i<threadCount;i++) {
			t[i]=new MyThreadWithRaceCondition(myObject);
		}
		
		System.out.println("Before myObject var1="+myObject.getVar1());
		
		for(MyThreadWithRaceCondition t2:t) {
			t2.start();
		}
		try {
			Thread.sleep(1000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		System.out.println("After myObject var1="+myObject.getVar1());
		System.out.println("-----ABOVE VALUE SHOULD HAVE BEEN "+threadCount+" ------------------------------------");
		System.out.println("-------------RACE CONDITION DEMO - END-------------------------------------");
		
		
		System.out.println("-------------RACE CONDITION SOLVED WITH WAIT DEMO - START-------------------------------------");
		MyThreadWithoutRaceCondition tt[]=new MyThreadWithoutRaceCondition[threadCount];
		
		MyObject myObject1=new MyObject();
		myObject1.setVar1(0);
		
		for(int i=0;i<threadCount;i++) {
			tt[i]=new MyThreadWithoutRaceCondition(myObject1);
		}
		
		System.out.println("Before myObject var1="+myObject1.getVar1());
		
		for(MyThreadWithoutRaceCondition t2:tt) {
			t2.start();
		}
		try {
			Thread.sleep(1000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		System.out.println("After myObject var1="+myObject1.getVar1());
		System.out.println("-----ABOVE VALUE IS "+threadCount+" ------------------------------------");
		System.out.println("-------------RACE CONDITION SOLVED WITH WAIT - END-------------------------------------");
	}
}
