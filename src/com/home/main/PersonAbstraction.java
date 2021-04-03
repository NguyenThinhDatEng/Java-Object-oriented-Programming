package com.home.main;

import com.home.abstraction.*;

public class PersonAbstraction {
	public static void main(String[] args) {
		Person person1 = new EmployeeExtendsPerson("Trung", "HN", 3300);
		Person person2 = new Customer("Linh", "BN", 10400);
		person1.display();
		person2.display();
	}
}
