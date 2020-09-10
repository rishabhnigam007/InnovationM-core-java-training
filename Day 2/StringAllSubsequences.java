class StringAllSubsequences
{
	public static void stringAllSubsequences(String input,String output)
	{
		if(input.length()==0)
		{
			System.out.println(output);
			return;
		}
		stringAllSubsequences(input.substring(1),output);
		stringAllSubsequences(input.substring(1),output+input.charAt(0));
	}
	public static void printSubsequences(String input)
	{
		stringAllSubsequences(input, "/");
	}

	public static void main(String a[])
	{
		String s="xyz";
		StringAllSubsequences.printSubsequences(s);
	}
}