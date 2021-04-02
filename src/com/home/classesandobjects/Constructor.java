package com.home.classesandobjects;
/*
Constructor
A Java method and Java constructor can be differentiated by its name and return type. A constructor has the same name as that of class and it does not return any value
 */
class Student{
	String name;
	int age;

	public Student()
	{
		name = "Thinh";
		age = 19;
	}
	
	public void display()
	{
		System.out.println("Name: " + name);
		System.out.println("Age: " + age);
	}
}

public class Constructor {
	public static void main(String[]args) {
		Student st = new Student();
		st.display();
	}
}