/*
length and width are two attributes that describe the length and width of a rectangle.
getInformation() is a method that inputs data to length and width from the keyboard.
display() is a method that prints the area and perimeter of the rectangle on the screen.
getArea() and getPerimeter() are methods that return the area and perimeter of the rectangle. They are used in display() method
 */
import java.util.Scanner;

class Rectangle{
	double length;
	double width;
	
	public void getInformation()
	{
		Scanner sc = new Scanner(System.in);
		length = sc.nextDouble();
		width = sc.nextDouble();
	}

	public double getArea(){
		return length * width;
	}
	public double getPerimeter(){
		return (length + width) * 2;
	}
	public void display()
	{
		System.out.println("Area: " + getArea());
		System.out.println("Perimeter: " + getPerimeter());
	}
}

public class RectangleClass {
	public static void main(String[]args) {
		Rectangle r = new Rectangle();
		r.getInformation();
		r.display();
	}
}