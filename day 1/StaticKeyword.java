class StaticDemo
{
	public static void main(String a[])
	{
		StaticKeyword.show();
	}
}
class StaticKeyword
{
	//int i=7; 
	//this is error non static variable can not use in static method
	static int i=7;
	public static void show()
	{
		System.out.println("hii");
		System.out.println(i);
	}
}