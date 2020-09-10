interface Abc
{
	void show();// by default this method is public abstract
}
interface Xyz
{
	void display();// by default this method is public abstract
}
interface Pqr
{
	void print();// by default this method is public abstract
}

// implement multiple inheritance

class AbcImp implements Abc,Xyz,Pqr 
{
	public void show()
	{
		System.out.println("interface Abc implementation");
	}
	public void display()
	{
		System.out.println("interface Xyz implementation");
	}
	public void print()
	{
		System.out.println("interface Pqr implementation");
	}
}
public class Interface
{
	public static void main(String a[])
	{
		AbcImp obj=new AbcImp();
		obj.show();
		obj.display();
		obj.print();
	}
}
