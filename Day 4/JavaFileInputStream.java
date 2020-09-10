import java.io.*;
class JavaFileInputStream
{
	public static void main(String args[])
	{
		try
		{
			FileInputStream fis=new FileInputStream("d:\\innovationm\\java_training\\day 4\\abc.txt");
			int i=0;
			while((i=fis.read())!=-1)
			{
				System.out.print((char)i);
			}
			fis.close();
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}
	}
}