package com.swathi.streams;

import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class ForEachAndFilter {

	public static void main(String[] args) {
		
		Map<String,Integer> map=new HashMap<>();
		map.put("Narsi", 1);
		map.put("Swathi", 2);
		map.put("Karthik", 3);
		map.put("Aryan", 4);
		
		//map.forEach((key,value)-> System.out.println(key+":"+value));
		//map.entrySet().stream().forEach(System.out::println);
		//map.entrySet().stream().filter(k->k.getKey().endsWith("i")).forEach(System.out::println);
		
		//map.entrySet().stream().map(k->k.getKey().length()).forEach(System.out::println);

		//map.entrySet().stream().map(k->k.getKey()).forEach(System.out::println);
		
		List<Employee> employees=EmployeeDAOData.getEmployees();
		employees.stream().forEach(System.out::println);
		System.out.println("************");
		employees.stream().filter(e->e.getSalary()>500000.0).forEach(System.out::println);
		System.out.println("************");
		List<Employee> collect = employees.stream()
				.filter(e->e.getSalary()>500000.0)
				.filter(e->e.getGrade().equalsIgnoreCase("A"))
				.collect(Collectors.toList());
		List<Employee> list = employees.stream()
				.filter(e->e.getName().startsWith("G"))
				.filter(e->e.getSalary()>400000.0)				
				.collect(Collectors.toList());
			
		System.out.println(list);
		
        List<Double> collect2 = employees.stream().map(e->e.getSalary()).collect(Collectors.toList());
        
        System.out.println(collect2);
      
        
        
	}
    
	

}
