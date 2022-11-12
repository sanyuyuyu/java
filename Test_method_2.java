class Test_method_2
{
    public static void main(String[] args)
    {
   /* int a = 3;
	int b = 333;
	System.out.println(getIntSum(b, a));
	//System.out.println(getIntSumRe(100));
	}
		public static int getIntSum(int i ,int j)
		{
			int sum = 0;
			for(;j <= i; j++)
			{
				sum = sum + j;
			}
		return sum ;
		}*/
		Stu stu2 = null; //初始化
        stu2.name = "李四";
        stu2.age = 19;
        stu2.male = "女";
        stu2.num = 202100000002l;
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