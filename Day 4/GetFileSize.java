import java.io.*;
class GetFileSize
{
	public static void main(String args[])
	{
//		File f=new File("d:\\innovationm\\java_training\\day 4\\OpenFile.java");
		File f=new File("d:\\software\\pycharm-community-2019.3.4.exe");

		if(f.exists())
		{
			double d=f.length();
			
			System.out.println("Size in Bytes :"+d);
			System.out.println("Size in Kb :"+(int)d/(1024));
			System.out.println("Size in Mb :"+((int)d/(1024*1024)));
		}
		else
		{
			System.out.println("file not exist ");
		}
	}
}