import java.lang.reflect.Method;
import java.lang.reflect.Method;
class Test_20230202
{
    public static void main(String[] args) throws Exception
    {
        //调用静态方法
        //对Method实例调用invoke就相当于调用该方法，invoke的第一个参数是对象实例，后面的可变参数要与方法参数一致，否则报错
        //获取Integer.parseInt(String)方法，参数为String
        Method m = Integer.class.getMethod("parseInt",String.class);
        //调用该静态方法并获取结果
        Integer n = (Integer) m.invoke(null,"12345");  // 如果获取的Method表示一个静态方法，调用静态方法时，由于无需指定实例对象，所以incoke方法传入的第一个参数永远为null
        System.out.println(n);


        //调用非public方法
        //可以通过Class.getDeclaredMethod()获取该方法实例，但直接对其调用将得到一个illegalAccessExceptio.
        /*
        Person p = new Person();
        Method m = p.getClass().getDeclaredMethod("setName",String.class);
        m.setAccessible(true);
        m.invoke(p,"Bob");
        System.out.println(p.name);
*/

        //获取Person的hello方法
        Method h = Person.class.getMethod("hello");
        //对Student实例调用hello方法
        h.invoke(new Student());

    }
}
/*
class Person
{
    String name;


    private void setName(Stirng name)
    {
        this.name = name;
    }
}*/

class Person
{
    public void hello()
    {
        System.out.println("Person:hello");
    }
}

class Student extends Person
{
    public void hello()
    {
        System.out.println("Student:hello");
    }
}

class Test_20230202
{
    public static void main(String[] args) throws Exception
    {
        MyPerson std = new MyStuden();
        Method m = MyPerson.class.getDeclaredMethod("sayHello");
        m.setAccessible(true);
        m.invoke(std);
    }
}

class MyPerson
{
    private void sayHello()
    {
        System.out.println("Person:hello");
    }
}

class MyStuden extends MyPerson
{
    public void sayHello()
    {
        System.out.println("Student:hello");
    }
}