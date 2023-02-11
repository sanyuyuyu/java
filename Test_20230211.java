class Test_20230211
{
    public static void main(String[] args)
    {
        int red = 25;
        int blue = 30;
        red = red * 2 + 10;
        blue *= 2;
        System.out.println(red==blue);

        double money1= 24 + 8 + 3;
        money1 = (money1 <= 30 ?money1 : money1 * 0.8);
        double money2 = 16 + 8 + 3;
        double money = money1 < money2 ? money1 : money2;
        System.out.println(money);

        

    }
}