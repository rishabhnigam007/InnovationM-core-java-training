class ThreadRunMethod extends Thread
{
	public void run()
	{
		for(int i=0;i<3;i++)
			System.out.print(i+" ");
		System.out.println();
		
	}
	public static void main(String args[])
	{
		ThreadRunMethod t1=new ThreadRunMethod();
		ThreadRunMethod t2=new ThreadRunMethod();
		t1.run();
		t2.run();
		/* simply run as normal method no threading invlove */
	}
}