//13>WAJP to print fibbonacci series.
class Fibbonacci 
{
	public static void main(String[] args) 
	{
		int a=0;
		int b=1;
		System.out.println(a+"");
		System.out.println(b+"");
		for(int i=1;i<=18;i++)
		{
			int c=a+b;
			System.out.println(c+"");
			a=b;
			b=c;
		}
	}
}
