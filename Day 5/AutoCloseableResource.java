class Abc implements AutoCloseable
{
	@Override
	public void close() throws Exception
	{
		System.out.println("Resource automatically close thats why this called !!");
	}
}
class AutoCloseableResource
{
	public static void main(String args[])
	{
		try(Abc obj=new Abc();)
		{
			System.out.println("this is try with resource ");
		}
	}
}
