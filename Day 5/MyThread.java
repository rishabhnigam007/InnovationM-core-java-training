class RunThread implements Runnable  // usin implementing thread interface
{
	public void run()
	{
		System.out.println(" !! Runnable Thread !! ");
	}
}
class MyThread extends Thread     // using extend thread class
{
	public void run()
	{
		System.out.println(" !! Extend Thread !! ");
	}
	public static void main(String args[])
	{
		RunThread rt=new RunThread();
		Thread t=new Thread(rt);
		t.start();
		MyThread mt=new MyThread();
		mt.start();
	}
}