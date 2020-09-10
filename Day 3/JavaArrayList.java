import java.util.*;
class JavaArrayList
{
	public static void main(String args[])
	{
		ArrayList<String> arr=new ArrayList<String>();
		arr.add("rishabh");
		arr.add("abhishek");
		arr.add("neeraj");
		arr.add("chatur");
		//System.out.println(arr.get(2));//for index value
		//System.out.println(arr);
		//print using iterator
		Iterator itr=arr.iterator();
		while(itr.hasNext())
		{
			System.out.println(itr.next());
		}
	}
}