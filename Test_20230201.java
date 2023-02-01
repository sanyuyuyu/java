class Test_20230201
{
    //先获取Student的Class实例，分别获取public方法，继承的public方法以及private方法，打印出的method类似：
    //public int Student.getScore(java.lang.String)
    //public java.lang.String Person.getName()
    //private int Student.getGrade(int)
    public static void main(String[] args) throws Exception
    {
        //Method getMethod(name, Class...):获取某个public的Method
        
        Class stdClass = Student.class;
        //获取public方法getScore，参数为String：
        System.out.println(stdClass.getMethod("getScore",String.class));
        //获取继承的public方法getName，无参数：
        System.out.println(stdClass.getMethod("getName"));
        //获取private方法getGrade，参数为int：
        System.out.println(stdClass.getDeclaredMethod("getGrade",int.class));

        //String对象
        String s = "Hello";
        //获取String substirng(int)方法，参数为int
        Method m = Stirng.class.getMethod("substirng",int.class);
        //在s对象上调用该方法并获取结果
        Stirng r = (Stirng) m.invoke(s,6);
        //打印
        System.out.println(r);

    }
}

//一个Method对象包含一个方法的所有信息
//  Stirng s = "Hello world";
//  Stirng r = s.substirng(6);  //"world"

class Student extends Person
{
    public int getScore(String type)
    {
        return 99;
    }

    private int getGrade(int year)
    {
        return 1;
    }

}

class Person
{
    public String getName()
    {
        return "Person";
    }
}

