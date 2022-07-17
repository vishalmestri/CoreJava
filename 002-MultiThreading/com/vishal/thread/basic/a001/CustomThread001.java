package com.vishal.thread.basic.a001;

public class CustomThread001 extends Thread {


	
	private boolean  firstThread;
	private int intvar;
	
	private static Integer sharedIntVar=0;
	private static Object obj;
	static {
		obj=new Object();
	}
	
	private  Account from;
	private  Account to;
	
	public CustomThread001(String name,int intvar,Account from,Account to,boolean firstThread) {
		super();
		this.setName(name);
		this.intvar = intvar;
		this.setFrom(from);
		this.setTo(to);
		this.setFirstThread(firstThread);
		//if(this.isFirstThread()) {
			//obj=new Object();
		//}
		
	}

	@Override
	public void run() {
		// TODO Auto-generated method stub
	System.out.println("Thread "+this.getName()+" reached location 1------------RUN START");
		try {
			System.out.println("Thread "+this.getName()+" reached location 2");

			synchronized (obj) {
				
				System.out.println("Thread "+this.getName()+" reached location 3");

					
					if(!this.isFirstThread()) {
						
						
						System.out.println("Thread "+this.getName()+" reached location 4.1 [Before calling wait on Obj object]");
						obj.wait();
						System.out.println("Thread "+this.getName()+" reached location 4.2 [After immediate wait on Ojb object]");
						
					}
					System.out.println("Thread "+this.getName()+" reached location 5");

				
				Account.transfer(this.getName(),from, to, intvar);
				sharedIntVar=intvar;
				System.out.println("Thread "+this.getName()+" reached location 6");

				System.out.println("Thread "+this.getName()+" reached location 7.1 [Before calling Notifyall on Obj object]");
				obj.notifyAll();
				System.out.println("Thread "+this.getName()+" reached location 7.2 [After calling Notifyall on Obj object]");

				

		
				

			}
			
		} catch (Exception e) {
			// TODO Auto-generated catch block
			System.out.println("Thread "+this.getName()+" reached location 8*********[Exception]");
			e.printStackTrace();
		}
//System.out.println("intvar="+intvar+" | sharedIntVar="+sharedIntVar);
		
		System.out.println("Thread "+this.getName()+" reached location 9------------RUN END");
	}

	public int getIntvar() {
		return intvar;
	}

	public void setIntvar(int intvar) {
		this.intvar = intvar;
	}

	public Account getFrom() {
		return from;
	}

	public void setFrom(Account from) {
		this.from = from;
	}

	public Account getTo() {
		return to;
	}

	public void setTo(Account to) {
		this.to = to;
	}

	public boolean isFirstThread() {
		return firstThread;
	}

	public void setFirstThread(boolean isFirstThread) {
		this.firstThread = isFirstThread;
	}

}
