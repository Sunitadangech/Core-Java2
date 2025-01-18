//2>WAJP to reverse a Given number.
class Reverse1 
{
	public static void main(String[] args) 
	{
		int num=12765;
		int rev=0;
		while(num>0)
		{
			rev=rev*10+num%10;
			num/=10;
		}
		System.out.println(rev);
	}
}
