class Example2 
{
	public static void test()
	{
		System.out.println("I am From Test Method");
	}
	public static void main(String[] args) 
	{
		System.out.println("I am From Main Method");
		demo();
		System.out.println("Royal");
		test();
	}
	public static void demo()
	{
		test();
		System.out.println("I am From Demo Method");
	}
}
