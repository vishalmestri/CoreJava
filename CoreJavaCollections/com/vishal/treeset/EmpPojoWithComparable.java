package com.vishal.treeset;

import java.util.logging.Logger;

public class EmpPojoWithComparable implements Comparable{
	
	private static Logger logger=Logger.getLogger(EmpPojoWithComparable.class.toString());
	
	private String name;
	private int age;
	private String gender;
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public String getGender() {
		return gender;
	}
	public void setGender(String gender) {
		this.gender = gender;
	}
	public EmpPojoWithComparable(String name, int age, String gender) {
		super();
		this.name = name;
		this.age = age;
		this.gender = gender;
	}
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + age;
		result = prime * result + ((gender == null) ? 0 : gender.hashCode());
		result = prime * result + ((name == null) ? 0 : name.hashCode());
		logger.info("EmpPojoWithComparable:hashCode called| result="+result);
		return result;
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj) {
			logger.info("EmpPojoWithComparable:equals called| equals=true");
			return true;
		}
		if (obj == null) {
			logger.info("EmpPojoWithComparable:equals called| equals=false");
			return false;
	}
		if (getClass() != obj.getClass()) {
			logger.info("EmpPojoWithComparable:equals called| equals=false");
			return false;
	}
		EmpPojoWithComparable other = (EmpPojoWithComparable) obj;
		if (age != other.age) {
			logger.info("EmpPojoWithComparable:equals called| equals=false");
			return false;
	}
		if (gender == null) {
			if (other.gender != null) {
				logger.info("EmpPojoWithComparable:equals called| equals=false");
				return false;
		}
		} else if (!gender.equals(other.gender)) {
			logger.info("EmpPojoWithComparable:equals called| equals=false");
			return false;
	}
		if (name == null) {
			if (other.name != null) {
				logger.info("EmpPojoWithComparable:equals called| equals=false");
				return false;
		}
		} else if (!name.equals(other.name)) {
			logger.info("EmpPojoWithComparable:equals called| equals=false");
			return false;
	}
		logger.info("EmpPojoWithComparable:equals called| equals=true");
		return true;
	}
	@Override
	public int compareTo(Object o) {
		int flag=0;
		
		EmpPojoWithComparable e1=(EmpPojoWithComparable)o;
		flag=this.getName().compareToIgnoreCase((e1.getName()));
		if(flag==0) {
			flag=this.getAge()-e1.getAge();
			if(flag==0) {
				flag=this.getGender().compareToIgnoreCase((e1.getGender()));
			}
		}
		logger.info("EmpPojoWithComparable:compareTo called| flag="+flag);
		return flag;
	}
	
	

}
