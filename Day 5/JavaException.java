//import java.util.*;
import java.io.*;
class JavaException
{
	public static void main(String args[])
	{
		int i,j,k;
		int arr[]={1,3,5,7,6};
		i=8;
		j=2; // if this is zero then arithmatic exception occur
		k=0;
		File f=new File("d:\\abc.txt");
		try
		{
			k=i/j;
			System.out.println(arr[5]);
			FileReader fr=new FileReader(f);
		}
		catch(ArrayIndexOutOfBoundsException e1)
		{
			//e.printStackTrace();
			System.out.println("Exception :"+e1);
		}
		catch(FileNotFoundException e2)
		{
			//e.printStackTrace();
			System.out.println("Exception :"+e2);
		}
		catch(Exception e)
		{
			System.out.println(e);
		}
	}
}