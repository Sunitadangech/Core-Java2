//10>WAJP to calculate sum of odd number between 1 and 100.
class  SumOdd
{
	public static void main(String[] args) 
	{
		int sum=0;
		for(int num=1;num<=100;num++)
		{
			if(num%2==1)
			{
				sum +=num;
			}
		}
		System.out.print(sum);
	}
}
