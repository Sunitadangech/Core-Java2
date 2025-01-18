//7>WAJP to print occurance of each character in a given string.
class  Occurance
{
	public static void main(String[] args) 
	{
		String str="Hello World";
		String str2="";
		for(int i=0;i<str.length();i++)
		{
			boolean flag=true;
			for(int j=0;j<str2.length();j++)
			{
				if(str2.charAt(j)==str.charAt(i))
				{
					flag=false;
				}
			}
			if(flag)
			{
				str2+=str.charAt(i);
			}
		}
		for(int i=0;i<str.length();i++)
		{
			int count=0;
			for(int j=0;j<str.length();j++)
			{
				if(str.charAt(j)==str2.charAt(i))
				{
					count++;
				}
			}
			System.out.println(str2.charAt(i)+"("+count+")");
		}
	}
}
