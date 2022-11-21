class Test_20221121
{
    public static void main(String[] args)
    {
        QiuTian q1 = new QiuTian("秋秋",3);
        JinMao j1 = new JinMao("金金",4);
        q1.Lingou();
        j1.Liugou();

    }
}

class dog
{
    private String name;
    private int age;
    
    public void shout()
    {
        System.out.println("汪汪汪、我是狗类");
    }


}

class QiuTian extends dog
{
    public void shout()
    {
        System.out.println("汪汪汪、我是秋田狗类");
    }
    
}

class JinMao extends dog
{
    public void shout()
    {
        System.out.println("汪汪汪、我是金毛狗类");
    }

    public void Maimeng()
    {
        System.out.println("金毛卖萌");
    }

}

class Train
{
     private String name;

     static public void Liugou()
     {
        dog dog1 = new dog();
        dog1.shout();
     }
}