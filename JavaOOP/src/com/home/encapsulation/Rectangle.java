package com.home.encapsulation;

class Rectangle{
    private double length; // length and width are the attributes that describe the length and width of a rectangle
    private double width;
    
    public Rectangle(){ // Rectangle() is the no-arg constructor.
    }
    
    public Rectangle(double length, double width){ // Rectangle(length: double, width: double) is the constructor parameter used to initialize values to length and width
        this.length = length;
        this.width = width;
    }
    
    // setLength(length: double), getLength(), setWidth(width: double), getWidth()are setter and getter
    public void setLength(double length){
        this.length = length;
    }
    
    public double getLength(){
        return length;
    }
    
    public void setWidth(double width){
        this.width = width;
    }
    
    public double getWidth(){
        return width;
    }
    
    public double getArea(){ // getArea() method returns the area of a rectangle.
        return width * length;
    }
    
    public double getPerimeter(){ // getPerimeter() method returns the perimater of a rectangle.
        return 2 * (width + length);
    }
}
