package com.home.main;

class Student00{
	
	private String name;
	private String address;
	private double gpa;
	
	public Student00() {
		
	}
	
	public Student00(String name, String address, double gpa)
	{
		this.name = name;
		this.address = address;
		this.gpa = gpa;
	}
	
	@Override
	public String toString() {
		return "Name: " + name + ", Address: " + address + ", GPA: " + gpa;
	}
}

public class ToString {
	public static void main(String[] args) {
		Student00 s = new Student00("Kien", "Ha Noi", 6.6);
		System.out.println(s);
	}
}
