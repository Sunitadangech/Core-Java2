//5>WAJP to check whether given character is Vowel.
class Vowel 
{
	public static void main(String[] args) 
	{
		char ch='a';
		if(ch>='A' && ch<='Z')
		{
			ch=(char) (ch+32);
		}
		if(ch=='a' || ch=='e' || ch=='i' || ch=='o' || ch=='u')
		{
			System.out.println("Vowel");
		}
		else
		{
			System.out.println("Not an Vowel");
		}
	}
}
	