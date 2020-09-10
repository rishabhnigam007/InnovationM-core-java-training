import java.io.*;
class JavaDeleteFile
{
	public static void main(String args[])
	{
		File f=new File("D:\\InnovationM\\Java_Training\\Day 4\\JavaFileWrite.class");
		if(f.delete()) 
	        { 
        	  	System.out.println("File deleted successfully"); 
        	} 
        	else
        	{ 
            		System.out.println("Failed to delete the file"); 
            		System.out.println("or file not found !!"); 
	        }
	}
}

/*  create file deletefile and them delete or provide exist file name  */