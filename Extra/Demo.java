//1)i/p:AbcD      o/p:dcBa
class Demo 
{
	public static void main(String[] args) 
	{
		String in="AbcD";
		String out="";
		for(int i=in.length()-1;i>=0;i--)
		{
			char ch=in.charAt(i);
			if(ch>='A'&&ch<='Z')
			{
				out +=(char)(ch+32);
			}
			else
			{
				out +=(char)(ch-32);
			}
		}
		System.out.println(out);
	}
}
