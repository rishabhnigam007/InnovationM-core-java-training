class BreakandContinue
{
	public static void main(String a[])
	{
		for(int i=0;i<=20;i++)
		{
			if(i%2==0)
			{
				continue;	
			}
			else
			{
				if(i==15)
				{
					break;
				}
				System.out.println(i);	
			}
		}
	}
}
