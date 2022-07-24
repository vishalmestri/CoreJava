package com.vishal.thread.basic.a002;

public class MyThreadWithRaceConditionWithVolatile extends Thread {
	
	private MyObjectWithVolatile myObject;
	
	
	public MyThreadWithRaceConditionWithVolatile(MyObjectWithVolatile myObject) {
		super();
		this.myObject = myObject;
	}



	public MyThreadWithRaceConditionWithVolatile() {
		// TODO Auto-generated constructor stub
	}
	
	
	
	@Override
	public void run() {
		// TODO Auto-generated method stub
	//	super.run();
				//String x=this.getName()+"Before var1="+this.myObject.getVar1()+" <> ";
				this.myObject.setVar1(this.getMyObject().getVar1()+1);			
				//System.out.println(x+this.getName()+"After var1="+this.myObject.getVar1());
	
	}



	public MyObjectWithVolatile getMyObject() {
		return myObject;
	}



	public void setMyObject(MyObjectWithVolatile myObject) {
		this.myObject = myObject;
	}

}
