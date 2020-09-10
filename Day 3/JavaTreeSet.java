import java.util.*;
class JavaTreeSet
{
	public static void main(String args[])
	{	
		//Set<String> s=new TreeSet<String>();
		TreeSet<String> s=new TreeSet<String>();
		s.add("2");
		s.add("4");
		s.add("2");
		s.add("6");
		s.add("1");
		System.out.println(s);
		s.remove("4");
		System.out.println("After Remove 4 :"+s);
		TreeSet<String> s1=new TreeSet<String>();
		s1.add("vijay");
		s1.add("ravi");
		s.addAll(s1);
		System.out.println("After adding new TreeSet :"+s);
		s.removeAll(s1);
		System.out.println(s);		
	}
}