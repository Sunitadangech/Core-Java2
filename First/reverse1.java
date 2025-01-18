//4>WAJP to reverse words in given statement.
class  reverse1
{
	public static void main(String[] args) 
	{
	String str="Java is a Programmimg Language";
	String rev=" ";
	String[] words=str.split(" ");
	for(int i=0;i<words.length;i++)
		{
		String word=words[i];
		String temp=" ";
		for(int j=word.length()-1;j>=0;j--)
			{
			temp += word.charAt(j);
			}
			rev +=temp+" ";
		}
		System.out.println(rev);
	}
}
