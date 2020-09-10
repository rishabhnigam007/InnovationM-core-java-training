class Inheritance
{
	public void add(int x,int y)
	{
		System.out.println("sum is :"+(x+y));
	}
}
class Inherit extends Inheritance
{
	public static void main(String a[])
	{
		Inherit in=new Inherit();
		in.add(5,7);
	}
}