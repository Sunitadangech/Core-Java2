//3>WAJP to calculate sum of even numbers between the range 100 and 200.
class Sumeven 
{
	public static void main(String[] args) 
	{
		int sum=0;
		for(int num=100;num<=200;num++)
		{
			if(num%2==0)
			{
				sum+=num;
			}
		}
		System.out.println(sum);
	}
}
