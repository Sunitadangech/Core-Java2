//6>WAJP to count Vowel in a given string.
class Vowel 
{
	public static void main(String[] args) 
	{
		String str="Hello World";
		int count=0;
		for(int i=0;i<str.length();i++)
		{
			char ch=str.charAt(i);
			if(ch=='A'||ch=='E'||ch=='I'||ch=='O'||ch=='U'||ch=='a'||ch=='e'||ch=='i'||ch=='o'||ch=='u')
			{
				count ++;
			}
		}
		System.out.println(count);
	}
}
