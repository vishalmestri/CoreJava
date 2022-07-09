package com.vishal.hashset;

import java.util.logging.Logger;

public class EmpPojoWithHashCodeEquals {
	
	private static Logger logger=Logger.getLogger(EmpPojoWithHashCodeEquals.class.toString());
	
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
	public EmpPojoWithHashCodeEquals(String name, int age, String gender) {
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
		logger.info("EmpPojoWithHashCodeEquals:hashCode called| result="+result);
		return result;
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj) {
			logger.info("EmpPojoWithHashCodeEquals:equals called| equals=true");
			return true;
		}
		if (obj == null) {
			logger.info("EmpPojoWithHashCodeEquals:equals called| equals=false");
			return false;
	}
		if (getClass() != obj.getClass()) {
			logger.info("EmpPojoWithHashCodeEquals:equals called| equals=false");
			return false;
	}
		EmpPojoWithHashCodeEquals other = (EmpPojoWithHashCodeEquals) obj;
		if (age != other.age) {
			logger.info("EmpPojoWithHashCodeEquals:equals called| equals=false");
			return false;
	}
		if (gender == null) {
			if (other.gender != null) {
				logger.info("EmpPojoWithHashCodeEquals:equals called| equals=false");
				return false;
		}
		} else if (!gender.equals(other.gender)) {
			logger.info("EmpPojoWithHashCodeEquals:equals called| equals=false");
			return false;
	}
		if (name == null) {
			if (other.name != null) {
				logger.info("EmpPojoWithHashCodeEquals:equals called| equals=false");
				return false;
		}
		} else if (!name.equals(other.name)) {
			logger.info("EmpPojoWithHashCodeEquals:equals called| equals=false");
			return false;
	}
		logger.info("EmpPojoWithHashCodeEquals:equals called| equals=true");
		return true;
	}
	
	

}
