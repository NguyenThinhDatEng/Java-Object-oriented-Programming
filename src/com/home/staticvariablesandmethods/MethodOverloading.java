class MethodOverloading {
	public static int max(int a, int b) // is the function that returns the greater of 2 numbers
	{
		return (a > b) ? a : b;
	}
	
	public static int max (int a, int b, int c) // is the function that returns the greater of 3 numbers
	{
		return max(max(a,b), c);
	}
	
	public static int sum(int a, int b) // is the function that returns the sum of a and b;
	{
		return a + b;
	}
	
	public static double sum (double a, double b)
	{
		return a + b;
	}
}