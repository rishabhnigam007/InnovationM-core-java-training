interface Abc
{
	void show();
}
public class Interface_using_AnonymousClass
{
	public static void main(String a[])	
	{
		Abc a1=new Abc()
		{
			public void show()
			{
				System.out.println("using anonymous class");
			}
		};
		/*
		this is lambda function
		Abc a1=()->System.out.println("hii");
		*/
		a1.show();
	}
}