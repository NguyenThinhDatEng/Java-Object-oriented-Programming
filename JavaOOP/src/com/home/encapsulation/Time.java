package com.home.encapsulation;

public class Time { // class stores the information about hours, minutes and seconds
	
	// attributes that describe the hours, minutes and seconds of Time class
	private int hour;
	private int minute;
	private int second;
	
	//  constructor parameter is used to initialize values to attributes
	public Time (int hour, int minute, int second)
	{
		this.hour = hour;
		this.minute = minute;
		this.second = second;
	}
	
	// method changes the values of the following attributes hour, minute, second
	public void setTime(int hour, int minute, int second)
	{
		this.hour = hour;
		this.minute = minute;
		this.second = second;
	}

	public int getHour() {
		return hour;
	}

	public void setHour(int hour) {
		this.hour = hour;
	}

	public int getMinute() {
		return minute;
	}

	public void setMinute(int minute) {
		this.minute = minute;
	}

	public int getSecond() {
		return second;
	}

	public void setSecond(int second) {
		this.second = second;
	}
	
	public void nextSecond() // method increases the time of objective by 1 second
	{
		if (second < 59) second += 1;
		else
		{
			second = 0;
			if (minute == 59)
			{
				minute = 0;
				if(hour == 23)
				{
					hour = 0;
				}
				else
				{
					hour += 1;
				}
			}
			else
				minute++;
		}
	}
	
	public void previousSecond() // method decreases the time of object by 1 second
	{
		if (second > 0) second -= 1;
		else
		{
			second = 59;
			if (minute == 0)
			{
			
				minute = 59;
				if (hour == 0)
				{
					hour = 23;
				}
				else
					hour--;
			}
			else
				minute -= 1;
		}
	}
	
	public void display()
	{
		String hour = this.hour + "";
		String minute = this.minute + "";
		String second = this.second + "";
		
		if (this.hour < 10) hour = '0' + hour;
		if (this.minute < 10) minute = '0' + minute;
		if (this.second < 10) second = '0' + second;
		
		System.out.println(hour + ":" + minute + ":" + second);
	}

}
