package com.vishal.stream;

import java.util.Arrays;
import java.util.Calendar;
import java.util.List;
import java.util.stream.Collectors;

public class Stream001 {
	
	public static void main(String[] args) {
		
		Employee e1=new Employee("Vishal", (byte)40, (short)30000);
		Employee e2=new Employee("Faiyaz", (byte)30, (short)40000);
		Employee e3=new Employee("Kedar", (byte)40, (short)50000);
		Employee e4=new Employee("Saourav", (byte)40, (short)20000);
		Employee e5=new Employee("Atul", (byte)40, (short)90000);
		
		
		Employee e6=new Employee("Vishal1", (byte)45, (short)36000);
		Employee e7=new Employee("Faiyaz1", (byte)30, (short)45000);
		Employee e8=new Employee("Kedar1", (byte)50, (short)60000);
		Employee e9=new Employee("Saourav1", (byte)40, (short)90000);
		Employee e10=new Employee("Atul1", (byte)50, (short)20000);
		
		
		List<Employee> list_1=Arrays.asList(e1,e2,e3,e4,e5);
		List<Employee> list_2=Arrays.asList(e6,e7,e8,e9,e10);
		List<Employee> list_3=Arrays.asList(e1,e3,e5,e7,e9);
		List<Employee> list_4=Arrays.asList(e2,e4,e6,e8,e10);
		Calendar c1=Calendar.getInstance();
		
		List<Employee> list2=list_2.stream().filter(x->x.getSalary()>35000).collect(Collectors.toList());
		
		Calendar c2=Calendar.getInstance();
		List<Employee> list1=list_1.parallelStream().filter(x->x.getSalary()>35000).collect(Collectors.toList());
		Calendar c3=Calendar.getInstance();
		List<Employee> list3=list_3.parallelStream().filter(x->x.getSalary()>35000).collect(Collectors.toList());
		Calendar c4=Calendar.getInstance();
		List<Employee> list4=list_4.stream().filter(x->x.getSalary()>35000).collect(Collectors.toList());
		Calendar c5=Calendar.getInstance();
		System.out.println("Time required to process with Normal stream:"+(c2.getTimeInMillis()-c1.getTimeInMillis()));
		
		System.out.println("Time required to process with Parallel stream:"+(c3.getTimeInMillis()-c2.getTimeInMillis()));
		System.out.println("Time required to process with Parallel stream:"+(c4.getTimeInMillis()-c3.getTimeInMillis()));
		System.out.println("Time required to process with Normal stream:"+(c5.getTimeInMillis()-c4.getTimeInMillis()));
		
	}

}
