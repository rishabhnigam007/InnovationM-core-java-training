import java.io.*;
import java.util.*;
class CreateFile1
{
	public static void main(String args[])
	{
		try
		{
		File f=new File("D:\\InnovationM\\Java_Training\\Day 4\\CreateFile1.txt");
		if(f.createNewFile())
		{
			System.out.println("File is Created !");
		}
		else
		{
			System.out.println("File already exists. !");			
		}
		FileWriter fw=new FileWriter(f);
		Scanner sc=new Scanner(System.in);
		System.out.println("enter content to file :");
		String s=sc.nextLine();
		fw.write(s);
		System.out.println();
		System.out.println("successfully write !!!!");
		fw.close();
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}
	}
}
/*
Use File.createNewFile() method to create new file. This method returns a boolean value –

true if the file is created successfully.
false if the file already exists or the operation failed for some reason.
*/