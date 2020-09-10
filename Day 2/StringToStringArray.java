class StringToStringArray
{
	public static void main(String args[])
	{
		String s="hello world";
		String arr[]=s.split(" ");
		for(String s1:arr)
			System.out.println(s1);
	}
}