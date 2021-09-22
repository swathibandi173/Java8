package com.swathi.streams;

import java.util.ArrayList;
import java.util.List;

public class EmployeeDAOData {
	
	public static List<Employee> getEmployees() {
	List<Employee> employees=new ArrayList<>();
	employees.add(new Employee(1,"Swathi","A",1000000.0));
	employees.add(new Employee(2,"Aryan","B",300000.0));
	employees.add(new Employee(3,"Narsi","A",1200000.0));
	employees.add(new Employee(4,"Garthik","B",600000.0));
	return employees;
	}

}
