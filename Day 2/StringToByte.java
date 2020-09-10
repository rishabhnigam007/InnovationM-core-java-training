class StringToByte
{
	public static void main(String a[])
	{
		String s="converting string to byte array";
		byte b[]=s.getBytes();
		// it will print object code (hex code)
		// in jdk 6 or lower define like byte b[]=new byte[1024]
		// it will produce memory leak problem
		System.out.println(b);
	}
}