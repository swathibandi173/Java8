package com.swathi.functioninterface;

import java.net.Socket;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.function.Function;

public class FunctionInterfaceDemo {

	public static void main(String[] args) {
		
		Function<String, Integer> function = t-> t.length();
		System.out.println(function.apply("Swathi"));
		
		List<String> strs=new ArrayList<>(List.of("Swathi","Narsi","Karthik","Aryan"));
			Map<String,Integer> map=convertToMap(strs,s->s.length());
			System.out.println(map);
			
	}

	private static <T, R> Map<T, R> convertToMap(List<T> strs, 
			Function<T,R> func ) {
		Map<T,R> result = new HashMap<>();
		for(T s:strs) {
			result.put(s, func.apply(s));
		}
		
		return result;
	}

	
	
	
}
