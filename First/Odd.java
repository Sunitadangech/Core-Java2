//6>WAJP to print first 10 odd number.
class  Odd
{
	public static void main(String[] args) 
	{
		int count=0;
		int num=0;
		while(count<10)
		{
			if(num%2==1)
			{
            System.out.println(num);
			count++;
			}
			num++;
		}
	}
}
