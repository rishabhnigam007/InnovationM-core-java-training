import java.io.*;
import java.util.*;
class CreateFile2
{
	public static void main(String args[])
	{
		try
		{
			FileOutputStream f=new FileOutputStream("D:\\InnovationM\\Java_Training\\Day 4\\CreateFile2.txt");
			Scanner sc=new Scanner(System.in);
			System.out.println("enter content to file :");
			String s=sc.nextLine();
			f.write(s.getBytes());
			System.out.println();
			System.out.println("successfully write !!!!");
			f.close();
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}
	}
}
/*

using FileOutputStream class create file and method obj.write(data.getBytes()) to write data in a file

*/