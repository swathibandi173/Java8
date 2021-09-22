package com.swathi.streams;

import java.util.Comparator;
import java.util.stream.Stream;

public class OfMethodDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Stream.of(1,111,1111,11111).forEach(System.out::println);
		String[] names= {"Swathi","Narsi","Karthik","Aryan"};
		Stream.of(names).filter(f->f.length()>5).forEach(System.out::println);
		
		Stream.of(names).map(f->f.length()).sorted().forEach(System.out::println);
		
		Stream.of(names).sorted((s1,s2)->s1.compareTo(s2)).forEach(System.out::println);
		System.out.println("************");
		Stream.of(names).sorted((s1,s2)->Integer.compare(s1.length(),s2.length())).forEach(System.out::println);
	}

}
