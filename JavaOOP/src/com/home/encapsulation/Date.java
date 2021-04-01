package com.home.encapsulation;

public class Date {
	// attributes describing the day, month and year of the Date objective
	private int day;
	private int month;
	private int year;
	
	public Date(int day, int month, int year) // constructor parameter is used to initialize values to attributes
	{
		this.day = day;
		this.month = month;
		this.year = year;
	}
	
	public void setDate(int day, int month, int year) // method is used to change the values of attributes
	{
		this.day = day;
		this.month = month;
		this.year = year;
	}

	public int getDay() {
		return day;
	}

	public void setDay(int day) {
		this.day = day;
	}

	public int getMonth() {
		return month;
	}

	public void setMonth(int month) {
		this.month = month;
	}

	public int getYear() {
		return year;
	}

	public void setYear(int year) {
		this.year = year;
	}
	
	public void display() { //  method displays the time information of objective in the following format "dd/MM/yyyy" (text type)
		String day = this.day + "";
		String month = this.month + "";
		String year = this.year + "";
		if (this.day < 10)
			day = '0' + day;
		if (this.month < 10)
			month = '0' + month;
		System.out.println(day + "/" + month + "/" + year);
	}

}
