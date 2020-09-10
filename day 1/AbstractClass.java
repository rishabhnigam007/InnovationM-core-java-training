abstract class AbstractClass
{
	public void show()
	{
		System.out.println("this is abstract class");
	}	
	abstract void display();
	abstract void print();
}
abstract class AbstractImplimentMethod extends AbstractClass
{
	void display()
	{
		System.out.println("this is display method");
	}
	void print()
	{
		System.out.println("this is print method");
	}
}
class Abstract extends AbstractImplimentMethod
{	
	public static void main(String a[])
	{
		AbstractImplimentMethod abc=new Abstract();
		abc.show();
		abc.display();
		abc.print();	
	}		
	
}
