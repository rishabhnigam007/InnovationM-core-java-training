import java.io.*;
import java.util.*;
class TryWithResource
{
	public static void main(String args[])
	{
		try(Scanner sc=new Scanner(System.in);)  // this parameter automatically close sc connection
		{
			String str="";
			System.out.println("input string :");
			str=sc.nextLine();
			System.out.println("this is your string :"+str);
			// no need to do this sc.close();
		}		
	}
}