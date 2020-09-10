class StringConcatination
{
	public static void main(String args[])
	{
		String s1="rishabh";
		String s2=" nigam";
		String s3=s1+s2;
			// or
		String s4=s1.concat(s2);
		System.out.println("using + operator :"+s3);
		System.out.println("using concatination function :"+s4);
		System.out.println(2+0+1+6+"GeeksforGeeks"); 
	        System.out.println("GeeksforGeeks"+2+0+1+6); 
        	System.out.println(2+0+1+5+"GeeksforGeeks"+2+0+1+6); 
	        System.out.println(2+0+1+5+"GeeksforGeeks"+(2+0+1+6));
	}
}