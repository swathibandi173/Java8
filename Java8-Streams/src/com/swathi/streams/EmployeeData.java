package com.swathi.streams;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

import com.sun.jdi.DoubleValue;
import com.sun.jdi.Type;
import com.sun.jdi.VirtualMachine;

public class EmployeeData {
	
	public static List<Employee> getEmployees(){
	List<Employee> employees=new ArrayList<>();
	
	for(int i=1;i<=1000;i++) {
		employees.add(new Employee(i,"Emp"+1,"A",Double.valueOf(new Random().nextInt(1000*100))));
		
	
	}
	return employees;
	}
	
}


