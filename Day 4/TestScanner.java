import java.util.Scanner;
class TestScanner
{
	public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in);
		/*System.out.println("enter name :");
		String name=sc.nextLine();
		System.out.println("enter number :");
		int n=sc.nextInt();
		System.out.println("number ="+n+" name :"+name);		
		*/
		System.out.println("Enter an integer"); 
	        int a = sc.nextInt(); 
         	System.out.println("Enter a String");
	        String b = sc.nextLine(); 
         	System.out.printf("You have entered :-"+a+" " + "and name as :" + b);
	}
}

/*  name will not print because it create buffer for pressing enter  */
/*  so reduce this error we use bufferreader class */