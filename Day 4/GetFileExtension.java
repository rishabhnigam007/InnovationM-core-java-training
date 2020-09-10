import java.io.File;
class GetFileExtension
{
	public static void main(String[] args) 
	{
        	String extension = getFileExtension(new File("d:\\innovationm\\java_training\\day 4\\openfile.java"));
        	System.out.println("File Extension :- " + extension);
    	}
	private static String getFileExtension(File file) 
	{
        	String extension = "";
 	        try 
		{
            		if(file != null && file.exists())
			{
		                String name = file.getName();
                		extension = name.substring(name.lastIndexOf("."));
            		}
		}
		catch(Exception e)
	 	{
			extension = "";
		}
	        return extension;
	}
}