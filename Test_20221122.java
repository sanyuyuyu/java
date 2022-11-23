class Test_20221122
{
    public static void main(String[] args)
    {
        Cherry c0 = new Cherry("奇瑞",2870,"15万");
        c0.getInfo();
    }
}

abstract class Car
{
    private String name;
    private int len;

    public void SetName(String name)
    {
        this.name = name;
    }

     public String getName()
    {
        return name;
    }

    public  void SetLen(int len)
    {
        this.len = len;
    }

    public int getLen()
    {
        return len;
    }

    abstract public void getInfo();

    public Car(String name,int len)
    {
        this.name = name;
        this.len = len;
    }
}
 class Cherry extends Car
{
    private String price;


    public void SetPrice(String price)
    {
        this.price = price;
    }

    public String price()
    {
        return price;
    }


    public Cherry(String name, int len, String price)
    {
        super(name,len);
        this.price = price;
    }

    public void getInfo()
    {
        System.out.println("品牌: "+super.getName()+"轴承: "+super.getLen()+"价格: "+price);
    }

}