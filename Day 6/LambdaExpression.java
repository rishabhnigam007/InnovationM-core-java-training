interface sum
{
	void sum(int a,int b);
}
class LambdaExpression
{
	public static void main(String args[])
	{
		sum s=(int x,int y)->System.out.println(x+y);
		s.sum(4,6);
	}
}