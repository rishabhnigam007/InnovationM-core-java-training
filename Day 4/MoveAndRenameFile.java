import java.io.*;
class MoveAndRenameFile
{
	public static void main(String args[])
	{
		File f=new File("d:\\innovationm\\java_training\\day 4\\TestScanner.java");
		if(f.renameTo(new File("d:\\innovationm\\java_training\\day 4\\test\\abc.java")))
		{	
			System.out.println("file moved successfully ");
		}
		else
		{
			System.out.println("file moved successfully ");
		}
	}
}