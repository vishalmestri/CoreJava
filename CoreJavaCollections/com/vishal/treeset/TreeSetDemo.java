package com.vishal.treeset;

import java.util.HashSet;
import java.util.TreeSet;
import java.util.logging.Logger;

public class TreeSetDemo {

	
	private static Logger logger=Logger.getLogger(TreeSetDemo.class.toString());
	public static void main(String[] args) {
		
		TreeSet<EmpPojoWithoutComparable> set=new TreeSet<EmpPojoWithoutComparable>();
		try {
		logger.info("1=====================================================================");
		EmpPojoWithoutComparable emp1=new EmpPojoWithoutComparable("Vishal", 39, "male");
		EmpPojoWithoutComparable emp2=new EmpPojoWithoutComparable("Vishal", 39, "male");
		EmpPojoWithoutComparable emp3=new EmpPojoWithoutComparable("Vishal", 38, "male");
		
		logger.info("emp1="+emp1);
		logger.info("emp2="+emp2);
		logger.info("emp3="+emp3);
		
		
		
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
		
		
		}catch (Exception e) {
			logger.info(e.getMessage());
		}
		logger.info("CONTENTS OF SET|"+set);
		logger.info("SIZE OF SET="+set.size());
		logger.info("2=====================================================================");
		
		
		EmpPojoWithComparable emp11=new EmpPojoWithComparable("Vishal", 39, "male");
		EmpPojoWithComparable emp22=new EmpPojoWithComparable("Vishal", 39, "male");
		EmpPojoWithComparable emp33=new EmpPojoWithComparable("Vishal", 38, "male");
		
		logger.info("emp11="+emp11);
		logger.info("emp22="+emp22);
		logger.info("emp33="+emp33);
		
		TreeSet<EmpPojoWithComparable> set1=new TreeSet<EmpPojoWithComparable>();
		
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
