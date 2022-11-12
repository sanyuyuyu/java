class Test_5
{
    public static void main(String[]args)
    {
        Stu myself = new Stu();
        myself.name = "wss";
        myself.age = 18;
        myself.male = "女";
        myself.num = 2022018133l;
        myself.getInfo();

        Stu stu1 = new Stu();
        stu1.setName("张三");
        stu1.setAge(18);
        stu1.setMale("男");
        stu1.setNum(202200000001l);
        stu1.getInfo();

        Stu stu2 = new Stu(); //初始化
        stu2.name = "李四";
        stu2.age = 19;
        stu2.male = "女";
        stu2.num = 202100000002l;
        stu2.getInfo();

        stu2 = stu1;
        stu2.getInfo();

    }
}

class Stu 
{
    public String name;
    public int age;
    public String male;
    public long num;

    

    public void setName(String outName)
    {
        name = outName;
    }

    public void setAge(int outAge)
    {
        age = outAge;
    }

    public void setMale(String outMale)
    {
        male = outMale;
    }

    public void setNum(Long outNum)
    {
        num = outNum;
    }
    
    public String getName()
    {
        return name;
    }

    public int getAge()
    {
        return age;
    }

    public String getMale()
    {
        return male;
    }

    public long getNum()
    {
        return num;
    }

    public void getInfo()
    {
        System.out.println("姓名:"+name+"年龄:"+age+"性别:"+male+"学号:"+num);
    }

}

class human
{
    private String name = "无名氏";
    private int age = -1;
    private String male = "未知";
    private String hobby = "未知";

    public human(String outName,int outAge)
    {
        name = outName;
        age = outAge;
    }  

     public void setName(String outName)
    {
        name = outName;
    }

    public void setAge(int outAge)
    {
        age = outAge;
    }

    public void setMale(String outMale)
    {
        male = outMale;
    }

    public void setHobby(String outHobby)
    {
         hobby = outHobby;
    }
    
    public String getName()
    {
        return name;
    }

    public int getAge()
    {
        return age;
    }

    public String getMale()
    {
        return male;
    }

    public String getHobby()
    {
        return hobby;
    }

    public void getInfo()
    {
        System.out.println("姓名:"+name+"年龄:"+age+"性别:"+male+"爱好:"+hobby);
    }
}




class emp
{
    private String name;
    private double sal;
    public String entp;




    
}