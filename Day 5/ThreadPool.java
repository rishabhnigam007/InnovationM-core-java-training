import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
class WorkerThread implements Runnable
{
	private String message;
	public WorkerThread(String s)
	{
		this.message=s;
	}
	public void run()
	{	
		System.out.println(Thread.currentThread().getName()+"(start) message ="+message);
		processmessage();
		System.out.println(Thread.currentThread().getName()+"(end)");
	}
	private void processmessage()
	{
		try
		{
			Thread.sleep(2000);
		}
		catch(Exception e){e.printStackTrace();}
	}
}
class ThreadPool
{
	public static void main(String args[])
	{
		ExecutorService e=Executors.newFixedThreadPool(2);
		for(int i=0;i<5;i++)
		{
			Runnable r=new WorkerThread(" "+i);
			e.execute(r);
		}
		e.shutdown();
		while(!e.isTerminated())
		{
			System.out.println("finished all threads");	
		}
	}
}