//3>WAJP to combine two arrays and then remove the duplicate values.
class Combine 
{
	public static void main(String[] args) 
	{
		int [] a={10,20,30,20,40};
		int [] b={30,40,30,50,60};
		int [] c=new int[10];
		int index=0;
		for(int i=0;i<a.length;i++)
		{
			c[index]=a[i];
			index++;
		}
		for(int i=0;i<b.length;i++)
		{
			c[index]=b[i];
			index++;
		}
		for(int i=0;i<c.length;i++)
		{
			for(int j=i+1;j<c.length;j++)
			{
				if(c[j]==c[i])
				{
					c[j]=-1;
				}
			}
		}
	}
}
