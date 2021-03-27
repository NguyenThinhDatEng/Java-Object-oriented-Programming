/*
class <class_name> {
	// Declare the list of attributes
	<data_type> <attribute_name>;
	...
	// Declare the list of methods
	public <return_value_name> <method_name>(<parameter_type> <parameter_name>, ...) {
		...
	}
	...
}
 */
import java.util.Scanner;

class Student{
	String name;
	int age;

	public void getInformation()
	{
		Scanner sc = new Scanner(System.in);
		name = sc.next();
		age = sc.nextInt();
	}
	public void display()
	{
		System.out.println("Name: " + name);
		System.out.println("Age: " + age);
	}
}


public class StudentClass {
	public static void main(String[]args) {
		Student s1 = new Student();
		s1.getInformation();
		s1.display();
	}
}
