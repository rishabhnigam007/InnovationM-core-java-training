import java.util.*;
class JavaList
{
	public static void main(String args[])
	{
		List<Integer> l=new ArrayList<Integer>();
		l.add(4);
		l.add(2);
		l.add(6);
		l.add(1);
		//System.out.println(l.get(2));//for index value
		System.out.println(l);
		System.out.println(l.hashCode());
		// print using iterator
		Iterator itr=l.iterator();
		while(itr.hasNext())
		{
			System.out.println(itr.next());
		}
	}
}