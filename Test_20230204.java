import java.lang.reflect.Method;
class Test_20230204
{
    public static void main(String[] args) throws Exception
    {
        //获取继承关系：
       /* Class cls = String.class;  // 获取到String的Class
        String s = " ";
        Class cls = s.getClass(); // s是String，因此获取到的String的Class
        Class s = Class.forName("java.lang.String");  // 获取Class的方法通过CLass.forName("")，传入Class的完整类名获取
        */
        // 三种方式获取的Class实例都是同一个实例，因为JVM对每个加载的Class只创建一个CLass实例来表示他的类型
        Class i = Integer.class;
        Class n = i.getSuperclass();
        System.out.println(n);
        Class o = n.getSuperclass();
        System.out.println(o);
        System.out.println(o.getSuperclass());

        // integer的副父类类型事Number，Number的父类是Object,Object的fu类是null，
        //出Object外，其他任何非interface的Class都必定存在一个父类类型


        //获取interdace:
        //查询Integer实现的接口
        Class s = Integer.class;
        Class[] is = s.getInterfaces();
        for(Class b : is)
        {
            System.out.println(b);
        }
        
        //  Integer实现的接口有：
        //java.lang.Comparable
        //java.lang.constant.Constable
        //java.lang.constant.ConstantDesc

        Class c = Integer.class.getSuperclass();
        Class[] cd = c.getInterfaces();  //getInterfaces()只返回当前类直接实现的接口类型，并不包括其父类实现的接口类型
        for(Class cde : is)
        {
            System.out.println(cde);
        }

        //Number实现的接口是java.io.Serializable
        //如果一个类没有实现任何interf，那么getInterfaces()返回空数组

        Object gg = Integer.valueOf(123);
        boolean isDouble = gg instanceof Double;
        boolean isInteger = gg instanceof Integer;
        boolean isNumber = gg instanceof Number;
        boolean isSerializable = gg instanceof java.io.Serializable;

        //Class getSuperclass():获取父亲类型
        //Class[] getInterfaces(): 获取当前类实现的所有接口
        //通过Class对象的isAssignableFrom()方法可以判断一个向上转型是否可以实现



        //动态代理
        //class：可以实例化（非abstrac）
        //interfa：不能实例化

        //所有interface类型的变量总是通过某个实例向上转型并复制给接口类型变量的
        CharSequence cs = new StringBuilder();
        

    }
}

public interface Hello
{
    void morning(String name);
}

public class HelloWorld implements Hello 
{
    public void morning(String name)
    {
        System.out.println("Good morning, " + name);

        Hello hello = new HelloWorld();
        hello.morning("Bob");
        
    }
}
