package com.home.main;

import com.home.Inheritance.*;

class StudentAndTeacher {
	public static void main(String[] args) {
		Student s = new Student("Khanh", 23, "Ha Noi", 9.0);
		s.display();
		System.out.println();
		Teacher t = new Teacher("Tung", 34, "Ha Noi", 1700);
		t.display();
	}
}
