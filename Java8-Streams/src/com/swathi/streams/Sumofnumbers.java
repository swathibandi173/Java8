package com.swathi.streams;

public class Sumofnumbers {
	
	public static void main(String args[]) {
		
		Integer i=345678945;
		int sum=0;
		
		while(i!=0) {
			sum=sum+i%10;
			i=i/10;
		}
		
		System.out.println(sum);
	}

}
