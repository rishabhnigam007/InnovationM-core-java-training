import java.io.*;
class CreateFile
{
	public static void main(String args[])
	{	
	try
	{
		File f=new File("D:\\InnovationM\\Java_Training\\Day 4\\CreateFile.txt");
		PrintWriter pw=new PrintWriter(f);
		pw.println("this is my create file !!");
		pw.close(); //closing is important otherwise sometime error occur
	}
	catch(Exception e)
	{
		//System.out.println(e.printStackTrace());//this is not allow
		e.printStackTrace();
	}
		System.out.println("file created successfully !!");
	}
}