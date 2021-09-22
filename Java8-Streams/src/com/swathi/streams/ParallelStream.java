package com.swathi.streams;

import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class ParallelStream {
	public static void main(String args[]) {
		
		long start=0,end=0;
		
		/*
		 start=System.currentTimeMillis();
		
		IntStream.range(1, 100).forEach(System.out::println);
		end=System.currentTimeMillis();
		System.out.println("Normal stream took:"+(end-start));
		
		start=System.currentTimeMillis();
		IntStream.range(1, 100).parallel().forEach(System.out::println);
		end=System.currentTimeMillis();
		System.out.println("parallel stream took:"+(end-start));
		
		*/
		/*
		IntStream.range(1, 10)
		.forEach(s->System.out.println(Thread.currentThread().getName()+":"+s));
		System.out.println("***********************");
		IntStream.range(1, 10)
		.parallel()
		.forEach(s->System.out.println(Thread.currentThread().getName()+":"+s));
		
		*/
		
		List<Employee> employees = EmployeeData.getEmployees();
		
		//normal stream
		 start=System.currentTimeMillis();
		double normalStream = employees.stream().map(Employee::getSalary)
				.mapToDouble(i->i).average().getAsDouble();
		end=System.currentTimeMillis();
		System.out.println(normalStream);
		System.out.println("Normal stream execution time : "+(end-start));
		
		//parallel stream
		 start=System.currentTimeMillis();
		double parallelStream = employees.parallelStream().map(Employee::getSalary)
				.mapToDouble(i->i).average().getAsDouble();
		end=System.currentTimeMillis();
		System.out.println(parallelStream);
		System.out.println("Parllel stream execution time : "+(end-start));
		
		
		
		
		
		
	}
	

}
