class Test_20221121_2
{
    public static void main(String[] args)
    {
        int j = 100;
        System.out.println(getIntSum(j));
    }

    public static int getIntSum(int j)
    {
        int sum = 0;
        for(int i = 0; i <= j; i++)
        {
            sum = sum + i;
           
        }
       return sum;
    }
}