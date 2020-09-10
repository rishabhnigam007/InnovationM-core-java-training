class Test
{
	int amount=10000;
	synchronized void withdraw(int amount)
	{
		System.out.println("Going to Withdraw..");
		if(this.amount<amount)
		{
			System.out.println("less balance,waiting for deposit");
			try
			{
				wait();
			}
			catch(Exception e)
			{
				e.printStackTrace();
			}
		}
		this.amount=this.amount-amount;
		System.out.println("withdraw completed...");
	}
	synchronized void deposit(int amount)
	{
		System.out.println("Going to deposit...");
		this.amount=this.amount+amount;
		System.out.println("deposit completed...");
		notify();
	}
}
class WaitNotifyAndNotifyAll
{
	public static void main(String args[])
	{
		final Test c=new Test();
		new Thread()
		{	
			public void run()
			{
				c.withdraw(15000);
			}
		}.start();
		new Thread()
		{
			public void run()
			{
				c.deposit(10000);
			}
		}.start();
	}
}