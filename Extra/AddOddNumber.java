//3)1 to 20 Odd Number Addition.
class AddOddNumber 
{
	public static void main(String[] args) 
	{
		int sum=0;
		for(int i=1;i<=20;i++)
		{
			if(i%2!=0)
			{
				sum +=i;
			}
		}
		System.out.println(sum);
	}
}
