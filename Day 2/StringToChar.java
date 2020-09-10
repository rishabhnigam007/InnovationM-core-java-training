class StringToChar
{
	public static void main(String a[])
	{
		String s="this is string to char conversion";
		char c[]=s.toCharArray();
		for(char ch :c )
		{
			System.out.print(ch+".");
		}
		System.out.println();
		System.out.println(s.substring(8,14));
	}
}