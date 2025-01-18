//3>WAJP to remove duplicate character from a given string.
class Character 
{
	public static void main(String[] args) 
	{
		String str="Hello World";
		String temp="";
		for(int i=0;i<str.length();i++)
		{
			boolean flag=true;
			for(int j=0;j<temp.length();j++)
			{
				if(temp.charAt(j)==str.charAt(i))
				{
					flag=false;
				}
			}
			if(flag)
			{
				temp +=str.charAt(i);
			}
		}
		System.out.println(temp);
	}
}
