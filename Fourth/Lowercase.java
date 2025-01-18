//5>WAJP to convert lower case character to upper case and wise varsa in a given string.
class Lowercase 
{
	public static void main(String[] args) 
	{
		String str="aBCd";
		String temp="";
		for(int i=0;i<str.length();i++)
		{
			char ch=str.charAt(i);
			if(ch>='A'&&ch<='Z')
			{
				temp +=(char)(ch+32);
			}
			else
			{
				temp+=(char)(ch-32);
			}
		}
		System.out.println(temp);
	}
}
