class Test_method_2
{
    public static void main(String[] args)
    {
    int a = 3;
	int b = 333;
	System.out.println(getIntSum(b, a));
	//System.out.println(getIntSumRe(100));
	}
		public static int getIntSum(int i ,int j)
		{
			int sum = 0;
			for(;j <= i; j++)
			{
				sum = sum + j;
			}
		return sum ;
		}
}