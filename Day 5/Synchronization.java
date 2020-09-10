class Example
{
	synchronized public void print(int n)
	{
		for(int i=1;i<=4;i++)
		{
			try
			{
				Thread.sleep(1500);	
			}
			catch(Exception e)
			{
				e.printStackTrace();
			}
			System.out.println(n*i);
		}
		System.out.println("completed..");
	}
}
class Synchronization
{
	public static void main(String args[])	
	{
		Example e1=new Example();
		Thread t1=new Thread(){public void run(){e1.print(2);}};
		Thread t2=new Thread(){public void run(){e1.print(5);}};
		t1.start();
		t2.start();
	}
}