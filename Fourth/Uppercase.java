//4>WAJP to convert first character of each word to upper case and remaining character to lower case in a given string.
class Uppercase 
{
	public static void main(String[] args) 
	{
		String str="jAVA iS a pROGRAmmING lANGUAGE";
		String str2="";
		String str3=str.toLowerCase();
		String[] arr=str3.split(" ");
		for(int i=0;i<arr.length;i++)
		{
			String word=arr[i];
			String temp="";
			temp +=(char)(word.charAt(0)-32);
			for(int j=1;j<word.length();j++)
			{
				temp +=word.charAt(j);
			}
			str2+=temp+"";
		}
		System.out.println(str2);
	}
}
