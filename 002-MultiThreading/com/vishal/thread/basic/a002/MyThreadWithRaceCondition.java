package com.vishal.thread.basic.a002;

public class MyThreadWithRaceCondition extends Thread {
	
	private MyObject myObject;
	
	
	public MyThreadWithRaceCondition(MyObject myObject) {
		super();
		this.myObject = myObject;
	}



	public MyThreadWithRaceCondition() {
		// TODO Auto-generated constructor stub
	}
	
	
	
	@Override
	public void run() {
		// TODO Auto-generated method stub
	//	super.run();
				//String x=this.getName()+"Before var1="+this.myObject.getVar1()+" <> ";
				this.myObject.setVar1(this.getMyObject().getVar1()+1);			
			//	System.out.println(x+this.getName()+"After var1="+this.myObject.getVar1());
	
	}



	public MyObject getMyObject() {
		return myObject;
	}



	public void setMyObject(MyObject myObject) {
		this.myObject = myObject;
	}

}
