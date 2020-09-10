import java.io.FileWriter;  
class FileWrite
{  
	public static void main(String args[])
	{    
         	try
		{
			FileWriter fw=new FileWriter("D:\\InnovationM\\Java_Training\\Day 4\\FileWrite.txt");    
		        fw.write("Welcome to javaTpoint.");    
           		fw.close();    
          	}
		catch(Exception e)
		{
			System.out.println(e);
		}    
	        System.out.println("Success...");    
     }    
} 