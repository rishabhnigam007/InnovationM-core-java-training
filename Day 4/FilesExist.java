import java.util.*;
import java.io.*;
class FilesExist
{
	public static void main(String args[]) throws Exception
	{
		File f=new File("D:\\InnovationM\\Java_Training\\day 4\\TestScanner.java");		
		File f1=new File("D:\\InnovationM\\Java_Training\\day 4");
		//if(f.exists()) //both are same exist for both file and directory
		if(f.isFile())
			System.out.println("file exists ");
		else
			System.out.println("file not exists ");
		if(f1.isDirectory())		
			System.out.println("Directory exists ");
		else
			System.out.println("Directory not exists ");
	}
}