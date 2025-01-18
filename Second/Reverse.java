//2>WAJP to reverse a given array.
import java.util.Arrays;
class Reverse 
{
	public static void main(String[] args) 
	{
		int [] a={10,20,30,40,50,60};
        System.out.println("Array before reversing");
		System.out.println(Arrays.toString(a));
		int start=0;
		int end=a.length-1;
		while(start<end)
		{
			int temp=a[start];
			a[start]=a[end];
			a[end]=temp;
			start++;
			end--;
		}
		System.out.println("Array after reversing");
		System.out.println(Arrays.toString(a));
			
	}
}
