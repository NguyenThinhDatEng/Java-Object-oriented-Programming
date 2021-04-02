package com.home.main;

import com.home.Inheritance.Student;

public class Super {
	public static void main(String[] args) {
		Student s = new Student("Hai", 1999, 8.8);
		System.out.println("Name: " + s.getName());
		System.out.println("Date of birth: " + s.getDob());
		System.out.println("GPA: " + s.getGpa());
	}
}