//3>WAJP to calculate the sum of diagonal element in given 2 Diamansional Array.
class Sum 
{
	public static void main(String[] args) 
	{
		int [] [] a={{10,40,60},{80,40,75},{90,60,30}};
		int sum=0;
		for(int i=0;i<3;i++)
		{
			for(int j=0;j<3;j++)
			{
				if(i==j)
				{sum +=a[i][j];;
				}
			}
		}
		System.out.println(sum);
	}
}
