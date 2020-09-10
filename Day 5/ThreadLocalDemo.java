class ThreadLocalDemo
{
	public static void main(String[] args) 
	{
		ThreadLocal<Integer> t = new ThreadLocal<Integer>();
		t.set(100);
		// returns the current thread's value
		System.out.println("value = " + t.get());
		t.set(90);
		// returns the current thread's value of 
		System.out.println("set value = " + t.get());
		t.remove();		
		System.out.println("remove value = " + t.get());
	}
} 