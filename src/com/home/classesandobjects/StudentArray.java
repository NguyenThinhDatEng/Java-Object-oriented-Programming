package com.home.classesandobjects;

class Student01 {
	String name;
	int age;

	public Student01(String name, int age) {
		this.name = name;
		this.age = age;
	}

	public void display() {
		System.out.println("Name: " + name);
		System.out.println("Age: " + age);
	}
}

class Student01Array {
	public static void main(String[] args) {
		Student01[] Students = new Student01[3];
		Students[0] = new Student01("Tuan", 24);
		Students[1] = new Student01("Cuong", 25);
		Students[2] = new Student01("Duc", 24);
		for (int i = 0; i < 3; i++) {
			Students[i].display();
		}
	}
}
