// 定义类
// class Person
// {
//     public String name; // String类型字段
//     public int age;  // public修饰字段 表示字段可以外部访问
// }

public class Person
{
    public static void main(String[] args)
    {
        City zj = new City();
        Pig a = "";
        Sheep b = "";
        zj.name = "zhejiang";
        System.out.println(zj.name);
        // return 10;
    }
}

class City
{
    public String name;
}

/*
class Person 
{
    public String nane;
    public int age;

}
*/
/*
public class Main
{
    public static void main(String[] args)
    {
        Person ming = new Person();
        ming.name = "miss yang ";
        ming.age = 18;

    }

}
class Person
{
    private String name;
    private int age;
}
*/

/*public class Main 
{
    public sratic void main(String[] args)
    {
        Person ming = new Person();
        ming.setName("yanglerong");
        ming.setAge(12);
        System.out.println(ming.getName() + "," ming.getAge());

    }
}

class Person
{
    private String name;
    private int age;
    
    pubilc String getName()
    {
        return this.name;
    }

    public void setName(String name)
    {
        this.name = name;
    }

    public int getAge()
    {
        return this.age;
    }

    public void setAge(int age)
    {
        if (age < 0 || age > 100)
        {
            throw new IllegalArgumentException("invalid age value");

        }
        this.age = age;
    }
}

public void serName(String name)
{
    if (name == null || name.isBlank())
    {
        throw new IllegalArgumentException("invaild name");

    }
    this.name = name.strip();
*/

