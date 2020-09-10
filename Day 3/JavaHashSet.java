import java.util.*;
class JavaHashSet
{
	public static void main(String args[])
	{	
		//Set<String> s=new HashSet<String>();
		HashSet<String> s=new HashSet<String>();
		s.add("2");
		s.add("4");
		s.add("2");
		s.add("6");
		s.add("1");
		System.out.println(s);
		s.remove("4");
		System.out.println("After Remove 4 :"+s);
		HashSet<String> s1=new HashSet<String>();
		s1.add("vijay");
		s1.add("ravi");
		s.addAll(s1);
		System.out.println("After adding new hashset :"+s);
		s.removeAll(s1);
		System.out.println("After removeAll new HashSet :"+s);		
	}
}