import java.awt.Desktop;
import java.util.*;
import java.io.*;
class OpenFile
{
	public static void main(String args[]) throws Exception
	{
		File f=new File("D:\\InnovationM\\Java_Training\\Day 4\\CreateFile1.txt");
		System.out.println("this is using Scanner class :");
		Scanner sc=new Scanner(f);
		while(sc.hasNextLine())
		{
			System.out.println(sc.nextLine());
		}
		System.out.println();
		System.out.println("this is using BufferedReader class :");
		BufferedReader br=new BufferedReader(new FileReader(f));
		int r=0;
		while((r=br.read())!=-1)
		{
			System.out.print((char)r);
		}
		System.out.println();
		System.out.println();
		System.out.println("this is using FileInputStream class :");
		FileInputStream fis=new FileInputStream(f);
		while((r=fis.read())!=-1)
			System.out.print((char)r);			
		/*  same as FileReader class */
		System.out.println();
		System.out.println("this is for desktop class");
		if(!Desktop.isDesktopSupported())
		//check if Desktop is supported by Platform or not  
		{  
			System.out.println("not supported");  
			return;  
		}  
		Desktop desktop = Desktop.getDesktop();  
		if(f.exists())//checks file exists or not  
		desktop.open(f); 
	}
}