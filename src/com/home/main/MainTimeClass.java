package com.home.main;

import com.home.encapsulation.Time;

public class MainTimeClass {
	public static void main(String[] args) {
		Time t = new Time(12, 1, 1);
		t.display();
		t.setTime(23, 59, 59);
		t.display();
		t.nextSecond();
		t.display();
		t.nextSecond();
		t.display();
		t.setTime(7, 0, 0);
		t.display();
		t.previousSecond();
		t.display();
	}
}
