//1>WAJP to remove a given character from a string.
class Character 
{
	public static void main(String[] args) 
	{
		String str="Hello World";
		char ch='l';
		String temp=" ";
		for(int i=0;i<str.length();i++)
		{
			if(str.charAt(i)!=ch)
			{
				temp +=str.charAt(i);
			}
		}
		str=temp;
		System.out.println(str);
	}
}
