//2>WAJP to check whether a given number is Armstrong.
class  armstrong
{
	public static void main(String[] args) 
	{
		int num=123;
		int num1=num;
		int num2=num;
		int count=0;
		int sum=0;
		while(num !=0)
		{
			count++;
			num/=10;
		}
		while(num1 !=0)
		{
			int last=num1%10;
			int res=1;
			for(int i=1;i<=count;i++)
			{
				res*=last;
			}
			sum+=res;
			num1/=10;
		}
		if(sum==num2)
		{
			System.out.println("Armstrong Number");
		}
		else
		{
			System.out.println("Not On Armstrong");
		}
	}
}
