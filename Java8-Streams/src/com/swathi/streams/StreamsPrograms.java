package com.swathi.streams;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;

public class StreamsPrograms {
	public static void main(String args[]) {
		
		Map<String,Integer> map=new HashMap<>();
		map.put("Narsi", 1);
		map.put("Swathi", 2);
		map.put("Karthik", 3);
		map.put("Aryan", 4);
		
		List<Entry<String,Integer>> entries=new ArrayList<>(map.entrySet());
		
		Collections.sort(entries, (o1, o2) -> o1.getKey().compareTo(o2.getKey()));
			
		for(Entry<String, Integer> entry:entries) {
			System.out.println(entry.getKey()+ ": "+entry.getValue());
		}
		
		//System.out.println(entries);
		
		map.entrySet().stream().sorted((o1, o2) -> o1.getKey().compareTo(o2.getKey()))
		.forEach(e->System.out.println(e));
		System.out.println("******************");
		map.entrySet().stream().sorted(Map.Entry.comparingByValue())
		.forEach(e->System.out.println(e));
		System.out.println("******************");
		entries.stream().forEach(System.out::println);
		
		
		
		
		
		
		
	}

}
