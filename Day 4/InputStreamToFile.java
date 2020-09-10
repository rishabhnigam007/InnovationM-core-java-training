import java.io.*;
import java.net.URI;
class InputStreamToFile
{
	private static final String FILE_TO = "d:\\innovationm\\java_training\\day 4\\abc.txt";
	public static void main(String[] args) throws IOException 
	{
		URI u = URI.create("https://www.google.com/");
		try(InputStream inputStream = u.toURL().openStream()) 
		{
			File file = new File(FILE_TO);
			copyInputStreamToFile(inputStream, file);
		}
	}
	private static void copyInputStreamToFile(InputStream inputStream, File file)throws IOException
	{
		try(FileOutputStream outputStream = new FileOutputStream(file))
		{
			int read;
			byte[] bytes = new byte[1024];
			while ((read = inputStream.read(bytes)) != -1)
			{
				outputStream.write(bytes, 0, read);
			}
		// commons-io
		//IOUtils.copy(inputStream, outputStream);
		}
	}
}