//5>WAJP to Display days in week whos length is divisible by 3.
class Days 
{
	public static void main(String[] args) 
	{
		String [] days={"Sunday","Monday","Tuesday","Thuresday","Friday","Saturday"};
		for(int i=0;i<days.length;i++)
		{
			if(days[i].length()%3==0)
			{
				System.out.println(days[i]);
			}
		}
	}
}
