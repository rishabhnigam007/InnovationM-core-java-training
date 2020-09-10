import java.util.Date;
import java.util.concurrent.Executors;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.ScheduledExecutorService;
class RunnableTask implements Runnable
{
	private String taskName;
	RunnableTask(String s)
	{
		this.taskName=s;
	}
	@Override
	public void run()
	{
		System.out.println(Thread.currentThread().getName()+" Start Time for "+taskName+" "+new Date());
		try
		{Thread.sleep(2000);}
		catch(Exception e){e.printStackTrace();}
		System.out.println(Thread.currentThread().getName()+" End Time for "+taskName+" "+new Date());
	}
	@Override
	public String toString()
	{
		return this.taskName;
	}
}
class ScheduledThreadPoolMain
{
	public static void main(String args[])	throws InterruptedException
	{
		System.out.println("Current Time :"+new Date());
		ScheduledExecutorService ses=Executors.newScheduledThreadPool(3);
		for(int i=1;i<=3;i++)
		{
			Thread.sleep(2000);
			RunnableTask r=new RunnableTask("task "+i);
			ses.schedule(r,5,TimeUnit.SECONDS);
		}
		Thread.sleep(10000);
		ses.shutdown();
		System.out.println("completed all threads");
	}
}