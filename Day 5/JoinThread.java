/* join mathod insure first thread is complete then other start thread */
class JoinThread extends Thread
{
	public void run()
	{	
		for(int i=0;i<4;i++)
		{
			try
			{
				Thread.sleep(1000);	
			}
			catch(Exception e)
			{
				e.printStackTrace();
			}
			System.out.println(i);
		}
		System.out.println("Running");
	}	
	public static void main(String args[])
	{
		JoinThread t1=new JoinThread();
		JoinThread t2=new JoinThread();
		JoinThread t3=new JoinThread();
		t1.start();
		try
		{
			t1.join();
			t2.join();
			
		}
		catch(Exception e){e.printStackTrace();}
		t2.start();
		t3.start();
	}
}