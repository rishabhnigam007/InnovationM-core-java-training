class Split
{
	public static void main(String a[])
	{
		String s="hello how are you";
		String sr[]=s.split(" ");
		String c="word1, word2 word3@word4?word5.word6";
		String cr[]=c.split("[, ?.@]+");
		for(String x:sr)
		{
			System.out.println(x);
		}
		System.out.println();
		for(String y:cr)
		{
			System.out.println(y);
		}
	}
}