class A
{
	public void showData()
	{
		System.out.println("A class");
	}
}
class B extends A
{
	@Override
	// if you write wrote function name bymistake then this produce error
	public void showData()
	{
		System.out.println("B class");
	}
}
class Annotation
{
	public static void main(String args[])
	{
		B b=new B();
		b.showData();		
	}
}