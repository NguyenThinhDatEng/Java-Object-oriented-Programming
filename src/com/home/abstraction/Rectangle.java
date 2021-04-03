package com.home.abstraction;

public class Rectangle implements IShape{
	
	private double length;
	private double width;
	
	public Rectangle(double length, double witdth) {
		this.length = length;
		this.width = witdth;
	}

	@Override
	public double getArea() {

		return length * width;
	}

	@Override
	public double getPerimeter() {
		return 2 * (length + width);
	}
	
	
	
}
