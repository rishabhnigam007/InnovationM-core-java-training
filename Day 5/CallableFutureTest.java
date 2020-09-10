import java.util.Random;
import java.util.concurrent.Callable;
import java.util.concurrent.FutureTask;
class CallableAndFutureTestExample  implements Callable
{
	public Object call() throws Exception  //call() generate exception
	{
		Random r=new Random();
		Integer randomNumber=r.nextInt(5);
		Thread.sleep(randomNumber*1000);
		return randomNumber;//callable return but runnable doesn't
	}
}
class CallableFutureTest
{
	public static void main(String args[]) throws Exception
	{
		FutureTask ft[]=new FutureTask[5];
		for(int i=0;i<5;i++)
		{
			Callable c=new CallableAndFutureTestExample();
			ft[i]=new FutureTask(c);
			Thread t=new Thread(ft[i]);
			t.start();
		}
		for(int i=0;i<5;i++)
			System.out.println(ft[i].get());
	}
}

/* create future[0] and call thread and receive random number then again create future[1] and call thread and receive random number and so on  */