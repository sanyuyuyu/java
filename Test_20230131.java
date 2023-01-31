/*class Test_20230131
{
    public static void main(String[] args) throws Exception
    {
        //Number n = new Double(123.334); // OK
        //String s = new Double(123.334); // compile error
        
        //获取class的Class实例:

        // 通过一个class的静态变量class获取
        Class cls1 = String.class; 
        //通过实例变量提供的getClass()方法获取
        String s = "Hello";
        Class cls2 = s.getClass(); 
        //如果知道一个class的完整类名，通过静态方法class.forName()获取
        Class cls3 = Class.forName("java.lang.String");

        
        //Class实例在JVM中是唯一的，上诉方法获取的Class实例都是同一个实例
        boolean sameClass = cls1 == cls2; //True

        Integer n = new Integer(123);
        boolean b1 = n instanceof Integer; // true,因为n是Integer类型
        boolean b2 = n instanceof Number;  // true,因为n是Number类型
        boolean b3 = n.getClass() == Integer.class; //true,因为n.getclass()返沪Integer.class
        boolean b4 = n.getClass() == NUmber.class; // true,因为Integer.class!= Number.class

        //通过反射获取该Object的class信息
       /* void printObjectInfo(Object obj)
        {
            Class cls = obj.getClass();
        }
        

        //获取String的Class实例
        Class cls = String.class;
        //创建一个String实例
        String s = (String) cls.newInstance();

    }
}*/

class Test_20230131
{
    public static void main(String[] args)
    {
        if(args.length > 0)
        {
            create(args[0]);
        }

        Object p = new Person("xiao ming");
        Class c = p.getClass();
        Field f = c.getDeclaredField("name");
        Object value = f.get(p);
        System.out.println(value);
    
    }

    static void create(String name)
    {
        Person p = new Person(name);
    }

    Field f = String.class.getDeclaredField("vaule");

    f.getName(); //"value"
    
    f.getType(); // class [B 表示byte[] 类型
    int m = f.getModifiers();
    Modifier.isFinal(); //true
    Modifier.isPublic(m); //false
    Modifier.isProtected(m); //false
    Modifier.isPrivate(m); //true
    Modifier.isStatic(m); //false

    
}

class Person
{
    public String name;

    public Person()
    {
        
    }

    public void setName(String name)
    {
        this.name = name;
    }

    public String getName()
    {
        return name;
    }
}

