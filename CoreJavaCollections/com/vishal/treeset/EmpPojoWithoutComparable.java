package com.vishal.treeset;

import java.util.logging.Logger;

public class EmpPojoWithoutComparable {
	private static Logger logger=Logger.getLogger(EmpPojoWithoutComparable.class.toString());
	
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
	public EmpPojoWithoutComparable(String name, int age, String gender) {
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
		logger.info("EmpPojoWithoutComparable:hashCode called| result="+result);
		return result;
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj) {
			logger.info("EmpPojoWithoutComparable:equals called| equals=true");
			return true;
		}
		if (obj == null) {
			logger.info("EmpPojoWithoutComparable:equals called| equals=false");
			return false;
	}
		if (getClass() != obj.getClass()) {
			logger.info("EmpPojoWithoutComparable:equals called| equals=false");
			return false;
	}
		EmpPojoWithComparable other = (EmpPojoWithComparable) obj;
		if (age != other.getAge()) {
			logger.info("EmpPojoWithoutComparable:equals called| equals=false");
			return false;
	}
		if (gender == null) {
			if (other.getGender() != null) {
				logger.info("EmpPojoWithoutComparable:equals called| equals=false");
				return false;
		}
		} else if (!gender.equals(other.getGender())) {
			logger.info("EmpPojoWithoutComparable:equals called| equals=false");
			return false;
	}
		if (name == null) {
			if (other.getName() != null) {
				logger.info("EmpPojoWithoutComparable:equals called| equals=false");
				return false;
		}
		} else if (!name.equals(other.getName())) {
			logger.info("EmpPojoWithoutComparable:equals called| equals=false");
			return false;
	}
		logger.info("EmpPojoWithoutComparable:equals called| equals=true");
		return true;
	}

}
