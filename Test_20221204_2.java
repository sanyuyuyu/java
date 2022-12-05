class Test_20221204_2
{
    public static void main(String[] args)
    {
        Stu stu00 = new Stu("文文",25,"浙江邮电职业技术学院",202111165656l);
        stu00.getInfo();

       // Stu stu00 = new Stu();
        stu00.name = 1000;
        stu00.suepr.getInfo();

    }
}

class Person
{
    public String name;
    public int age;
   // public int name = 1000;

    public Person()
    {

    }

    public Person(String name,int age)
    {
        this.name = name;
        this.age = age;
    }

    public void SetName(String name)
    {
        this.name = name;
    }

    public String getName()
    {
        return name;
    }

    public void SetAge(int age)
    {
        this.age = age;
    }

    public int getAge()
    {
        return age;
    }

    public void getInfo()
    {
       
        System.out.print(name+age);
    }

}

class Stu extends Person
{
    private String school;
    private long num;
    public int name;

    public Stu()
    {

    }

    public Stu(String  name,int age, String school, long num)
    {
        super(name,age);
        this.school = school;
        this.num = num;
    }

    public void SetSchool(String school)
    {
        this.school = school;
    }

    public String getSchool()
    {
        return school;
    }

    public void SetNum(long num)
    {
        this.num = num;
    }

    public long getNum()
    {
        return num;
    }

    public void getInfo()
    {
         System.out.println(name);
        super.getInfo();
        System.out.print(super.getName()+super.getAge()+school+num);
    }


}