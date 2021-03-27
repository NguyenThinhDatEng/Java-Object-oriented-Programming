class Counter {
	static int count = 0;
	public Counter() {
		count++;
		System.out.println(count);
	}
}

class StaticVariable {
	public static void main(String[] args)
	{
		Counter c1 = new Counter();
		Counter c2 = new Counter();
		Counter c3 = new Counter();
	}
}
// result
// 1
// 2
// 3
// static variable can be refer to the common property of all object