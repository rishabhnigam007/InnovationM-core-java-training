import java.util.*;
class JavaTreeMap
{
	public static void main(String args[])
	{
		TreeMap<Integer,String> sm=new TreeMap<Integer,String>();
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
		System.out.println("The greatest key-value less than 6 is :"+sm.floorEntry(6));
		System.out.println("The greatest key less than 6 is : "+sm.floorKey(6));
		System.out.println("The maximum place you can reach with given petrol :"+sm.floorEntry(6));
	}
}