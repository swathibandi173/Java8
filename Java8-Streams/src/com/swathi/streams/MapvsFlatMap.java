package com.swathi.streams;

import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class MapvsFlatMap {
	public static void main(String args[]) {
		
		List<Student> students=StudentData.getAllStudents();
		
		//map -->one to one mapping
		
		List<String> depts = students.stream()
				.map(student->student.getDept())
				.collect(Collectors.toList());
		System.out.println(depts);
		
		//map -->student->student.getPhonenumbers() ->one to one mapping it 
		//gives stream of sream data

		List<List<Integer>> collect = students.stream()
				.map(student->student.getPhonenumbers())
				.collect(Collectors.toList());
		System.out.println(collect);
		
		//flatmap -> student->student.getPhonenumbers() one to many flatters data 
		//into single list
		//the list into stream
		List<Integer> collect2 = students.stream()
				.flatMap(student->student.getPhonenumbers().stream())
				.collect(Collectors.toList());
		
		System.out.println(collect2);
	}

}
