package com.home.Polymorphism;

class SuperClass
{
	int x = 10;
}

class SubClass extends SuperClass {
	int x = 20;
}

public class CanNotOverrideProperty {
	public static void main(String[] args) {
		SuperClass a = new SubClass();
		System.out.println(a.x);
		System.out.println(((SubClass)a).x);
	}
}
