import java.io.*;
class GetExtension
{
	public static void main(String args[]) throws Exception
	{
		File f=new File("D:\\innovationm\\java_training\\day 4\\openfile");
		System.out.println("absolute path :"+f.getAbsolutePath());
		System.out.println("path :"+f.getPath());
		System.out.println("canonical path :"+f.getCanonicalPath());
	}
}

/* getPath() and getAbsolutePath() are work almost same but getCanonicalPath() work different

example :- D:\\InnovationM\\Java_training\\Day 4\\OpenFile.java this is a path

if getPath() and getAbsolutePath() use then result:- d:\\innovationm\\java_training\\day 4\\open.java
but if use getCanonicalPath() then:- D:\\InnovationM\\Java_training\\Day 4\\OpenFile.java same as it is path.
it return actual save name
*/