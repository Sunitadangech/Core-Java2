//1>Pattern1
class Pattern 
{
	public static void main(String[] args) 
	{
		for(int i=1;i<5;i++)
		{
			for(int j=1;j<5;j++)
				//if(i==j||i+j==6)
			//if(i==1||j==1||i==5||j==5)
			if(i==j||i+j==5||i==1||i==5)
			{
				System.out.print("* ");
			}
			else
			{
				System.out.print(" ");
			}
		}
		System.out.println();
	}
}
