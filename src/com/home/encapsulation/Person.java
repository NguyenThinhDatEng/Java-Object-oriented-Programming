package com.home.encapsulation;

public class Person{
	private int id;
	private String name;
	private int age;
	private String address;
	private int dob;
	
	public Person(){
	}
	
	public Person(String name, int age, String address)
	{
		this.name = name;
		this.age = age;
		this.address = address;
	}
	
	public Person(String name, int dob)
	{
		this.name = name;
		this.dob = dob;
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

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public int getDob() {
		return dob;
	}

	public void setDob(int dob) {
		this.dob = dob;
	}
	
	public void display()
	{
		System.out.println("Name: " + name);
		System.out.println("Age: " + age);
		System.out.println("Address: " + address);
	}
	
}