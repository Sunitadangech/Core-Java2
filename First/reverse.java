//1>WAJP to reverse given string.
class reverse 
{
	public static void main(String[] args) 
	{
	String str="Hello World";
	String rev="";
	for(int i=str.length()-1;i>=0;i--)
		{
		rev=rev+str.charAt(i);
		}
		System.out.println(rev);
	}
}







