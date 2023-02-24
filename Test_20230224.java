class Test_20230224
{
    public static void main(String[] args)
    {
        Student stu1 = new Student("nana",18,"nv");
        stu1.getInfo();
    }

}

class Person 
{
    private String name;
    private int age;

    public Person()
    {

    }

    public Person(String name, int age)
    {
        this.name = name;
        this.age = age;
    }

    public String getName()
    {
        return name;
    }

    public int getAge()
    {
        return age;
    }

    public void getInfo()
    {
        System.out.println(this.name+this.age);
    }
}

class Student extends Person
{
    public String sex;

    public Student()
    {

    }
    
    public Student(String name,int age,String sex)
    {
        super(name,age);
        this.sex = sex;
    }

    public String getSex()
    {
        return sex;
    }

    public void getInfo()
    {
        System.out.println(getName()+getAge()+sex);
    }
}