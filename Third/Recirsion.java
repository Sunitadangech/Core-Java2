//4>WAJP to print the number from 1 ti 10 using method recursion.
class Recursion 
{
	public static void main(String[] args) 
	{
		printNumber(1);
	}
	public static void printNumber(int num);
	{
		if(num<=20)
		{
			System,out,println(num);
			printNumber(++num);
		}
	}
}
