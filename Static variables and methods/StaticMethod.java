class Toan {
	public static int max(int a, int b) // is the function that returns the bigger of 2 numbers
	{
		return (a > b) ? a : b;
	}
}

class StaticMethod {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(Toan.max(3, 2));
	}

}
