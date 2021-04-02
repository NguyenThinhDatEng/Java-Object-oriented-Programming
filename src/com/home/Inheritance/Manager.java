package com.home.Inheritance;

import com.home.encapsulation.*;

public class Manager extends Employee {
	
	private int bonus;
	
	public Manager(String name, int Salary, int bonus)
	{
		super(name, Salary);
		this.bonus = bonus;
	}

	public int getBonus() {
		return bonus;
	}

	public void setBonus(int bonus) {
		this.bonus = bonus;
	}
	
	@Override
	public void display()
	{
		super.setSalary(bonus + super.getSalary());
		super.display();
	}
}
