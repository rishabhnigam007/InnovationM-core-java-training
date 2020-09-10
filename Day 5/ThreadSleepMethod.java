class ThreadSleepMethod extends Thread
{
	public void run()
	{
		for(int i=1;i<=10;i++)
		{
			System.out.println(i*2);
			try
			{
				Thread.sleep(1000);
			}
			catch(Exception e)
			{
				e.printStackTrace();
			}
		}
	}
	public static void main(String args[])
	{
		ThreadSleepMethod t1=new ThreadSleepMethod();
		ThreadSleepMethod t2=new ThreadSleepMethod();
		t1.start();
		//t1.start();  //we cant start a thread twice it will throw exception "java.lang.IllegalThreadStateException"
		t2.start();
	}
}
