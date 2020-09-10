import java.util.*;
class JavaHashMap
{
	public static void main(String args[])
	{
		Map<Integer,Integer> m=new HashMap<Integer,Integer>();
		m.put(1,10);		
		m.put(4,13);
		m.put(3,20);
		m.put(2,15);
		m.put(5,11);
		System.out.println(m);
		//Iterator itr=m.iterator();//this is error
		//because map directly cant traverse
		//we need to convert into set then we can traverse
		//and get the key and value separetely
		//Set s=m.keySet();
		//Iterator itr=s.iterator();
		for(Map.Entry e:m.entrySet())
			System.out.println(e.getKey()+" "+e.getValue());
		/*
		m.entrySet();
		m.sorted(Map.Entry.comparingByKey());
		m.forEach(System.out::println);*/
	}
}