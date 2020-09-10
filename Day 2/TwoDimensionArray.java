import java.util.Scanner;
class TwoDimensionArray
{
	public static void main(String args[])	
	{
		Scanner sc=new Scanner(System.in);
		int arr[][]=new int[3][3];
		/*
		int arr[][]={{1,2,3},{4,5,6},{7,8,9}};
		*/

		System.out.println("enter double dimension array :");
		for(int i=0;i<3;i++)
		{
			for(int j=0;j<3;j++)
			{
				arr[i][j]=sc.nextInt();
			}
		}
		System.out.println("Double dimension array is :");
		for(int i=0;i<3;i++)
		{
			for(int j=0;j<3;j++)
			{
				System.out.print(arr[i][j]+" ");
				if(j==2)
					System.out.println();
			}
		}
				

	}
}