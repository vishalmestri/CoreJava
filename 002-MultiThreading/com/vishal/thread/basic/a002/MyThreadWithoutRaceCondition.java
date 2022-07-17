package com.vishal.thread.basic.a002;

public class MyThreadWithoutRaceCondition extends Thread {
	
	private MyObject myObject;
	
	
	public MyThreadWithoutRaceCondition(MyObject myObject) {
		super();
		this.myObject = myObject;
	}



	public MyThreadWithoutRaceCondition() {
		// TODO Auto-generated constructor stub
	}
	
	
	
	@Override
	public void run() {
		// TODO Auto-generated method stub
	//	super.run();
		synchronized (myObject) {
			this.myObject.setVar1(this.getMyObject().getVar1()+1);			
		}

	}



	public MyObject getMyObject() {
		return myObject;
	}



	public void setMyObject(MyObject myObject) {
		this.myObject = myObject;
	}

}
