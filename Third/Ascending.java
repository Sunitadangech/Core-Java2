//5>WAJP to sort a given array in ascending order.
import java.util.Arrays;
class Ascending 
{
	public static void main(String[] args) 
	{
		int [] a={20,30,50,40,60};
		for(int i=0;i<a.length;i++)
		{
			for(int j=i+1;j<a.length;j++)
			{
				if(a[i]>a[j])
				{
					int temp=a[i];
					a[i]=a[j];
					a[j]=temp;
				}
			}
		}
		System.out.println(Arrays.toString(a));
	}
}
