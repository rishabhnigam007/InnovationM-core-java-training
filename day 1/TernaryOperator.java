import java.util.*;
class TernaryOperator
{
	public static void main(String a[])
	{
		Scanner sc=new Scanner(System.in);
		int x=5;
		int y=6;
		System.out.println("enter number :");
		int n=sc.nextInt();
		int z=(n<=5?x:y);	
		System.out.println(z);
	}
}