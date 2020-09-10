import java.util.*;
class JavaSortedMap
{
	public static void main(String args[])
	{
		SortedMap<Integer,String> sm=new TreeMap<Integer,String>();
		sm.put(new Integer(2),"perl");
		sm.put(new Integer(3),"php");
		sm.put(new Integer(5),"c");
		sm.put(new Integer(4),"python");
		sm.put(new Integer(1),"java");
		System.out.println(sm);
		Set s=sm.entrySet();
		Iterator itr=s.iterator();
		while (itr.hasNext()) 
        	{ 
            		Map.Entry m = (Map.Entry)itr.next(); 
			int key = (Integer)m.getKey(); 
            		String value = (String)m.getValue(); 
  	            	System.out.println("Key :"+key+" value :"+value); 
        	}
		System.out.println("contains value php :"+sm.containsValue("php"));
		System.out.println("contains key 2 :"+sm.containsKey(2));
	}
}