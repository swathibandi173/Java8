package com.swathi.streams;

import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;
import java.util.stream.Collectors;

public class Lambda {

	public static void main(String[] args) {
		
		String s="Sathi Sang Ram Sgrt Samp Sathi Ram";
		String[] strs=s.split(" ");
		List<String> list=Arrays.asList(strs);
		System.out.println(list);
		
		List<String> collect = list.stream()
				.filter(t->t.startsWith("S"))
				.collect(Collectors.toList());
		System.out.println(collect);
		
		list.stream()
		.filter(t->t.startsWith("S"))
		.forEach(System.out::println);
		
		Map<String, Integer> map=new HashMap<>();
		for(String str:strs) {
			Integer integer=map.get(str);
			if(integer==null) {
				map.put(str, 1);
			}else {
				map.put(str, integer+1);
			}
			
		}
		Set<Entry<String, Integer>> entrySet = map.entrySet();
	
		System.out.println(map);
		
		
		

	}

}
