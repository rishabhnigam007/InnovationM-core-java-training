import java.util.*;
class JavaTreeSet1
{
	public static void main(String args[])
	{
		TreeSet<Integer> ts=new TreeSet<Integer>();
		ts.add(1);
		ts.add(3);
		ts.add(2);	
		ts.add(4);
		ts.add(0);
		ts.add(9);
		ts.add(2);
		System.out.println("Tree set :"+ts);	
		System.out.println("Decreasing order :");
		Iterator i=ts.descendingIterator();  
         	while(i.hasNext())  
         	{  
             		System.out.println(i.next());  
         	} 
		System.out.println("First element :"+ts.first());
		System.out.println("Last element :"+ts.last());
		System.out.println("Reverse Set :"+ts.descendingSet());
		System.out.println("Head Set :"+ts.headSet(4, true));  
          
         	System.out.println("SubSet :"+ts.subSet(1, false, 4, true));  
           
         	System.out.println("TailSet :"+ts.tailSet(3, false));
		System.out.println("Highest Value :"+ts.pollFirst());  
         	System.out.println("Lowest Value :"+ts.pollLast());
		System.out.println("Tree set :"+ts);		

	}
}