//4>WAJP to check whether given string is Palindrome by removing special character from the given string.
class Palindrome 
{
	public static void main(String[] args) 
	{
		String str = "na@ya&n";
		String temp = "";
		String rev = "";
		for(int i =0; i < str.length(); i++)
		{
			char ch = str.charAt(i);
			if(ch>='A' && ch<='Z' || ch>='a' && ch<='z')
			{
				temp += ch;
			}
		}
		for(int i = temp.length()-1; i >= 0; i--)
		{
			rev += temp.charAt(i);
		}
		if(rev.equals(temp))
		{
			System.out.println("Palindrome");
		}
		else
		{
			System.out.println("Not Palindrome");
		}
	}
}


