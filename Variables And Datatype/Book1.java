//10)Whenever we have a some variable name inside a class block and amethod block or initializer block,then1st priority given to local variable.
class Book1 
{
	static int a=40;
	public static void main(String[] args) 
	{
	    int a=10;
		System.out.println(a);
	}
}
