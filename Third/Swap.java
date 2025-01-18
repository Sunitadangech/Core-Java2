//2>WAJP to swap Adjacent character in a given string.
class Swap 
{
	public static void main(String[] args) 
	{
		String str="123456";
		String temp=" ";
		for(int i=1;i<str.length();i+=2)
		{
			temp +=str.charAt(i);
			temp +=str.charAt(i-1);
		}
		str=temp;
		System.out.println(str);
	}
}
