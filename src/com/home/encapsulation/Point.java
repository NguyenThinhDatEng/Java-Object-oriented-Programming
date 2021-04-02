package com.home.encapsulation;

import java.math.*;

public class Point { // class stores the information of coordinates of a point in a two-dimensional Cartesian coordinate system
	
	// attributes that describe the abscissa and ordinate of the objective Point class
    private double x;
    private	 double y;
    
    // the no-arg constructor
    public Point() {
    	
    }
    
    //  the constructor parameter which is used to initialize the values to x (abscissa) và y (ordinate)
    public Point(double x,double y){
        super();
        this.x=x;
        this.y=y;
    }
    
    //  the setter and getter
	public double getX() {
		return x;
	}

	public void setX(double x) {
		this.x = x;
	}

	public double getY() {
		return y;
	}

	public void setY(double y) {
		this.y = y;
	}
    
	// the atribute to change the values of x and y
    public void setXY(double x, double y) {
    	this.x = x;
    	this.y = y;
    }
    
    // method returns the distance between the current objective and the point (x, y)
    public double distance(double x, double y) {
    	return Math.sqrt(Math.pow(x - this.x,2) + Math.pow(y - this.y, 2));
    }
    
    
    // method returns the distance between the current objective and another objective (another is also an objective of Point class)
    public double distance(Point another) {
    	return distance(another.x, another.y);
    }
}

