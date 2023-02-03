
import java.lang.reflect.Constructor;
class Test_20230203
{
    public static void main(String[] args) throws Exception
    {
        // 获取构造方法Integer(int)
        Constructor cons1 = Integer.class.getConstructor(int.class);
        // 调用构造方法
        Integer n1 = (Integer) cons1.newInstance(123);
        System.out.println(n1);

        //获取构造方法Integer(String)
        Constructor cons2 = Integer.class.getConstructor(String.class);
        Integer n2 = (Integer) cons2.newInstance("456");
        System.out.println(n2);        

        Class i = Integer.class;
        Class n = i.getSuperclass();
        System.out.println(n);
        Class o = n.getSuperclass();
        System.out.println(o);
        System.out.println(o.getSuperclass());

        Object n = Integer.valueOf(123);
        boolean isDouble = n instanceof Double; // false
        boolean isInteger = n instanceof Integer; // true
        boolean isNumber = n instanceof Number; // true
        boolean isSerializable = n instanceof java.io.Serializable; // true

        Class s = Integer.class;
        Class[] is = s.getInterfaces();
        for (Class i : is) 
        {
            System.out.println(i);
        }


        Class s = Integer.class.getSuperclass();
        Class[] is = s.getInterfaces();
        for (Class i : is) 
        {
            System.out.println(i);
        }

        // Integer i = ?
        Integer.class.isAssignableFrom(Integer.class); // true，因为Integer可以赋值给Integer
        // Number n = ?
        Number.class.isAssignableFrom(Integer.class); // true，因为Integer可以赋值给Number
        // Object o = ?
        Object.class.isAssignableFrom(Integer.class); // true，因为Integer可以赋值给Object
        // Integer i = ?
        Integer.class.isAssignableFrom(Number.class); // false，因为Number不能赋值给Integer


        System.out.println(java.io.DataInputStream.class.getSuperclass()); // java.io.FilterInputStream，因为DataInputStream继承自FilterInputStream
    }
}
//通过反射来创建新的实例，可以调用Class提供的newlnstance()方法
Person p = new Person();
Person p = Person.class.newInstance();
//getConstructor(Class...):获取某个public的Constructor
//getDeclaredConstructor(Class...):获取某个COnstructor
//getConstructors():获取所有public的Constructor

class Test_20230203
{
    public static void main(String[] args)
    {
        Class[] is = s.getInterfaces();
        
        for(Class i : is)
        {
            System.out.println(i)
        }
    }
}