package com.vishal.hashset;

import java.util.HashSet;
import java.util.logging.Logger;

public class HashSetDemo {

	
	private static Logger logger=Logger.getLogger(HashSetDemo.class.toString());
	public static void main(String[] args) {
		
		logger.info("1=====================================================================");
		EmpPojoWithoutHashCodeEquals emp1=new EmpPojoWithoutHashCodeEquals("Vishal", 39, "male");
		EmpPojoWithoutHashCodeEquals emp2=new EmpPojoWithoutHashCodeEquals("Vishal", 39, "male");
		EmpPojoWithoutHashCodeEquals emp3=new EmpPojoWithoutHashCodeEquals("Vishal", 38, "male");
		
		logger.info("emp1="+emp1);
		logger.info("emp2="+emp2);
		logger.info("emp3="+emp3);
		
		HashSet<EmpPojoWithoutHashCodeEquals> set=new HashSet<EmpPojoWithoutHashCodeEquals>();
		
		logger.info("-----------------------");
		logger.info("Before adding emp1");
		set.add(emp1);
		logger.info("After adding emp1");
		logger.info("Before adding emp2");
		set.add(emp2);
		logger.info("After adding emp2");
		logger.info("Before adding emp3");
		set.add(emp3);
		logger.info("After adding emp3");
		logger.info("-----------------------");
		logger.info("CONTENTS OF SET|"+set);
		logger.info("SIZE OF SET="+set.size());
		logger.info("2=====================================================================");
		
		
		EmpPojoWithHashCodeEquals emp11=new EmpPojoWithHashCodeEquals("Vishal", 39, "male");
		EmpPojoWithHashCodeEquals emp22=new EmpPojoWithHashCodeEquals("Vishal", 39, "male");
		EmpPojoWithHashCodeEquals emp33=new EmpPojoWithHashCodeEquals("Vishal", 38, "male");
		
		logger.info("emp11="+emp11);
		logger.info("emp22="+emp22);
		logger.info("emp33="+emp33);
		
		HashSet<EmpPojoWithHashCodeEquals> set1=new HashSet<EmpPojoWithHashCodeEquals>();
		
		logger.info("-----------------------");
		logger.info("Before adding emp11");
		set1.add(emp11);
		logger.info("After adding emp11");
		logger.info("Before adding emp22");
		set1.add(emp22);
		logger.info("After adding emp22");
		logger.info("Before adding emp33");
		set1.add(emp33);
		logger.info("After adding emp33");
		logger.info("-----------------------");
		logger.info("CONTENTS OF SET1|"+set1);
		logger.info("SIZE OF SET1="+set1.size());
		logger.info("2=====================================================================");
		
		
		
	}
}
