/*class Test_20221126
{
    private static String name;
    static
    {
        name = "world";
        System.out.println(name);
    }
    public static void main(String[] args)
    {
        System.out.println("hello");
        Test test = new Test();
    }
}*/

class Test_20221126
{
    public static void main(String[] args)
    {
        count count1 = new count(0,100);
        count1.Chucount(0,100);
    }
}

class count
{
    private double chushu;
    private double beichushu;
    public count(double chushu, double beichushu)
    {
        this.chushu = chushu;
        this.beichushu = beichushu;
    }
    public void Chucount(double chushu, double beichushu)
    {
        System.out.println(beichushu/chushu);
        
    }
}

