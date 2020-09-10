import java.util.*;
class ArrayToArrayList3
{
	public static void main(String args[])
	{
		String s[]={"a","b","c","d"};
		List<String> l=new ArrayList<String>();
		for(int i=0;i<s.length;i++)
			l.add(s[i]);
		System.out.println(l);
	}
}