package com.swathi.streams;

import java.util.List;

public class Student {

	private int id;
	private String name;
	private List<Integer> phonenumbers;
	private String dept;
	private String email;
	

	public Student(int id, String name, List<Integer> phonenumbers, String dept, String email) {
		super();
		this.id = id;
		this.name = name;
		this.phonenumbers = phonenumbers;
		this.dept = dept;
		this.email = email;
	}


	public int getId() {
		return id;
	}


	public void setId(int id) {
		this.id = id;
	}


	public String getName() {
		return name;
	}


	public void setName(String name) {
		this.name = name;
	}


	public List<Integer> getPhonenumbers() {
		return phonenumbers;
	}


	public void setPhonenumbers(List<Integer> phonenumbers) {
		this.phonenumbers = phonenumbers;
	}


	public String getDept() {
		return dept;
	}


	public void setDept(String dept) {
		this.dept = dept;
	}


	public String getEmail() {
		return email;
	}


	public void setEmail(String email) {
		this.email = email;
	}
	

	@Override
	public String toString() {
		return "Student [id=" + id + ", name=" + name + ", phonenumbers=" + phonenumbers + ", dept=" + dept + ", email="
				+ email + "]";
	}



}
