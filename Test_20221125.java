/*class Test_20221125
{
    public static void main(String[] args)
    {
        int[] temp = {22,24,76,12,21,33};  //定义数组
        int max = 0; //定义最大值
        for(int x = 0; x < temp.length-1;x++) 
        {
            if(temp[x]>temp[x+1]) //判断前后大小
            {
                max = temp[x]; 
                temp[x+1] = max; //交换
            }
        }
        System.out.println(max); //输出最大值
    }
}*/
/*
class Test_20221125
{
    public static void main(String[] args)
    {
        int[] temp = {12,23,44,21,12};
        int max = 0;
        for(int x = 0; x < temp.length-1;x++)
        {
            if(temp[x]>temp[x+1])
            {
                max = temp[x];
                temp[x+1] = temp[x];
            }
        }
        System.out.println(max);
    }
}*/


class Test_20221125
{
    public static void main(String[] args)
    {
        /*Student a = new Student(2022,"王小五","男",18,90);
        a.getInfo();*/
        Student s1 = new Student(1, "小a","男" , 18, 95);
        Student s2 = new Student(2,"小b","女",20,90);
        Student s3 = new Student(3,"小c","女",21,65);
        Student s4 = new Student(4, "小d", "男", 18, 100);
        Student s5 = new Student(5, "小e", "男", 15, 85);
        s1.getInfo();
        s2.getInfo();
        s3.getInfo();
        s4.getInfo();
        s5.getInfo();
         

    }
}

class Student
{
    public long sNo;
    public String sName;
    public String sSex;
    public int sAge;
    public double sJava;

    public Student(long sNo,String sName,String sSex,int sAge,double sJava)
    {
        this.sNo = sNo;
        this.sName = sName;
        this.sSex = sSex;
        this.sAge = sAge;
        this.sJava = sJava;
    }

    public void setsNo(long sNo)
    {
        this.sNo = sNo;
    }

    public void setsName(String sName)
    {
        this.sName = sName;
    }

    public void setsSex(String sSex)
    {
        this.sSex = sSex;
    }

    public void setAge(int age)
    {
        this.sAge = sAge;
    }

    public void setJava(double sJava)
    {
        this.sJava = sJava;
    }

    public long getNo()
    {
        return sNo;
    }

    public String getName()
    {
        return sName;
    }

    public String getSex()
    {
        return sSex;
    }

    public int getAge()
    {
        return sAge;
    }

    public double getJava()
    {
        return sJava;
    }

    public void getInfo()
    {
       System.out.println("学号: "+sNo+" 姓名: "+sName+" 性别: "+sSex+" 年龄: "+sAge+" 成绩: "+sJava);
    }
}
