class StringIsImmutable
{
	public static void main(String a[])
	{
		String s1="hii";
		String s2=s1;
		String s3="hello";
		System.out.println(s1);
		System.out.println(s2);
		System.out.println(s3);
		System.out.println(s1==s2);
		s2="hey";
		System.out.println(s1==s2);
		System.out.println(s1==s3);
		System.out.println(s2==s3);
		System.out.println(s1);
		System.out.println(s2);
		System.out.println(s3);
	}
}