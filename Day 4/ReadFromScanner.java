import java.util.*;
import java.io.*;
class ReadFromScanner
{
	public static void main(String args[]) throws Exception
	{
		//File f=new File("D:\\InnovationM\\Java_Training\\day 4\\TestScanner.java");		
		//Scanner sc=new Scanner(f);
				// or
		Scanner sc=new Scanner(new File("D:\\InnovationM\\Java_Training\\day 4\\TestScanner.java"));
		while(sc.hasNextLine())
			System.out.println(sc.nextLine());
		
	}
}