package zptc.yjs.221;

class Test_8 
{
    public static void main(String[] args)
    {
        Compu c1 = new Compu("联想",5000);
        Compu.Harddisk d1 = new Compu().new Harddisk("西部数据",500);
        c1.tellC();
        d1.tellH();
    }
}

class Compu
{
    private String name;
    private double price;

    public Compu() //定义一个Compu的框架
    {

    }

    public Compu(String name,double price)
    {
        this.name = name;
        this.price = price;
    }

    public void SetName(String name)
    {
        Compu.this.name = name;
    }

    public String getName()
    {
        return name;
    }

    public void SetPrice(double price)
    {
        Compu.this.price = price;
    }

    public double getPrice()
    {
        return price;
    }

    public void tellC()
    {
        System.out.println("品牌: "+name+" 价格: "+price);
    }

    class Harddisk //定义一个Harddisk的内部类
    {
        private String name;
        private double storage;

        public Harddisk() //定义无参框架
        {

        }

        public Harddisk(String name,double storage)
        {
            this.name = name;
            this.storage = storage;
        }

        public void setName(String name)
        {
            this.name = name;
        }

        public String getName()
        {
            return name;
        }

        public void setStorage(double storage)
        {
            this.storage = storage;
        }

        public double getStorage()
        {
            return storage;
        }

        public void tellH()
        {
            System.out.println("品牌: "+Harddisk.this.name+" 价格: "+Harddisk.this.storage);
        }

    }
}