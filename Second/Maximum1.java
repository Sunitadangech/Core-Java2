//8>WAJP to findout Maximum among given 3 numbers using conditional operator.
class Maximum1
{
	public static void main(String[] args) 
	{
		int a=48;
		int b=26;
		int c=30;
		int max=0;
		max=(a>b)?((a>c)?a:c):((b>c)?b:c);
		System.out.println(max);
	}
}
