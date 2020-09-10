import java.util.*;
class ArrayToArrayList2
{
	public static void main(String args[])
	{
		String s[]={"a","b","c","d"};
		List<String> l=new ArrayList<String>();
		Collections.addAll(l,s);
		System.out.println(l);
	}
}