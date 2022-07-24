package com.vishal.thread.basic.a002;

public class MyObjectWithVolatile {
	private volatile int var1;

	public int getVar1() {
		return var1;
	}

	public void setVar1(int var1) {
		this.var1 = var1;
	}
}
