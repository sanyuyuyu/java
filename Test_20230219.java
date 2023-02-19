class Test_20230219
{
    public static void main(String[] args)
    {
        for (int i = 100; i < 1000; i++)
        {
             int dd = (int)(Math.pow(i/100, 3) + Math.pow(i%100/10, 3) + Math.pow(i%10, 3));
             if (dd == i)
            {
                System.out.println(i);
             }
       	}
    }
}