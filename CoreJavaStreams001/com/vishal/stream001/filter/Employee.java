package com.vishal.stream001.filter;

public class Employee {

	private String name;
	public Employee(String name, byte age, short salary) {
		super();
		this.name = name;
		this.age = age;
		this.salary = salary;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public byte getAge() {
		return age;
	}
	public void setAge(byte age) {
		this.age = age;
	}
	public short getSalary() {
		return salary;
	}
	public void setSalary(short salary) {
		this.salary = salary;
	}
	private byte age;
	private short salary;
}
