class Test_20221113
{
    public static void main(String[] args)
    {
        Emp emp1 = new Emp();
        emp1.name = "刘备";
        emp1.sal = 4000;
        emp1.getInfo();
        
        Emp emp2 = new Emp();
        emp2.name = "张飞";
        emp2.sal = 3500;
        emp2.getInfo();

        Emp emp3 = new Emp();
        emp3.name = "关羽";
        emp3.sal = 3500;
        emp3.getInfo();
    }
}


class Emp
{
    public String name;
    public double sal;
    public String entp = "哪儿都通公司";

    public void emp()
    {

    }
    public void emp(String outName,double outSal)
    {
        name = outName;
        sal = outSal;
        {
            System.out.println("我是普通代码块");
        }
    }

    public void setName(String outName)
    {
       name = outName; 
    }

    public void setSal(double outSal)
    {
        sal = outSal;
    }


    public void getInfo()
    {
        System.out.println("年龄:"+name+" sal:"+sal+" entp:"+entp);
       {
         System.out.println("我是普通代码块");
       }
    }

    static
    {
        System.out.println("我是静态代码块");
    }
}