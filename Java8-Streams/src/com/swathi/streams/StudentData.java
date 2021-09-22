package com.swathi.streams;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class StudentData {
	
	public static List<Student> getAllStudents(){
	 return Stream.of(
			 new Student(1,"Swathi",List.of(234567,345678),"IT","swathi@gmail.com"),
			 new Student(2,"Narsi",List.of(4567,345678),"CSE","narsi@gmail.com"),
			new Student(3,"Karthik",List.of(35465656,345678),"EEE","karthik@gmail.com"),
			new Student(4,"Aryan",List.of(565767,6767676),"ECE","aryan@gmail.com")
			).collect(Collectors.toList());
	 
		
	}
	

}
