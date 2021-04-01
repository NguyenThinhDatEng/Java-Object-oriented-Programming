package com.home.main;

import com.home.encapsulation.Date;

public class MainDateClass {
	public static void main(String[] args) {
		Date d = new Date(1, 1, 1997);
		d.display();
		d.setDate(12, 12, 2004);
		d.display();
		d.setMonth(3);
		d.display();
	}
}
