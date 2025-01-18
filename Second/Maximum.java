//1>WAJP to findout the maximum value among given four numbers.
class Maximum 
{
	public static void main(String[] args) 
	{
		int a=10;
		int b=-20;
		int c=30;
		int d=40;
		if(a>b)
		{
			if(a>c)
			{
				if(a>d)
				{
					System.out.println(a+"is greatest");
				}
				else
				{
					System.out.println(d+"is greatest");
				}
			}
			else
			{
				if(c>d)
				{
					System.out.println(c+"is greatest");
				}
				else
				{
					System.out.println(d+"is greatestr");
				}
			}
		}
		else
		{
			if(b>c)
			{
				if(b>d)
				{
					System.out.println(b+"is greatest");
				}
				else
				{
					System.out.println(d+"is greatest");
				}
			}
			else
			{
				if(c>d)
				{
					System.out.println(c+"is greatest");
				}
				else
				{
					System.out.println(d+"is greatest");
				}
			}
		}
    }
}	

