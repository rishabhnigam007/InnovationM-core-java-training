class WrapperClass
{
	public static void main(String a[])
	{
		String s="123";
		//int n=s; this is error beacuse string cannot convert into integer
		int n=Integer.parseInt(s);
		System.out.println(n);
	}
}