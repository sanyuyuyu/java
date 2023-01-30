/*import com.itranswarp.learnjava.Person;

public class Test_20230130
{
       String getFullName(Person p) 
        {
        //传入实例对象
        return p.getFirstName() + " " + p.getLastName();
        }*/
       /* public static void main(String[] args)
        {

        /* 创建一个Class类型的实例，并关联起来
          public final calss Class //Class类型时一个名交Class的class
          {
            private Class()
            {

            }

          }*/

        /*    public String getFirstName()
            {
                return getFirstName;
            }

            public String getLastName()
            {
                return getLastName;
            }
        }

        String getFullName(Object obj)
        {
            
            Person p = (Person) obj;
            return p.getFirstName() + " " + p.getLastName();

        }
}*/

class Test_20230130
{
    public static void main(String[] args)
    {
        printClassInfo("".getClass());
        printClassInfo(Runnable.class);
        printClassInfo(java.time.Month.class);
        printClassInfo(String[].class);
        printClassInfo(int.class);
        

        if(args.length > 0)
        {
            create(args[0]);
        }

        LogFactory factory = null;
        if(isClassPersent("org.apache.logging.log4j.Logger"))
        {
            factory = createLog4j();

        }
        else
        {
            factory = createJdkLog();
        }

        boolean isClassPersent(String name)
        {
            try
            {
                Class.forName(name);
                return true;
            }
            catch(Exception e)
            {
                return false;
            }
        }
    }

    static void create(String name)
    {
        Person p = new Person(name);
    }

    static void printClassInfo(Class cls)
    {
        System.out.println("Class name: " + cls.getName());
        System.out.println("Simple name " + cls.getSimpleName());
        
        if(cls.getPackage() != null)
        {
            System.out.println("Package name: " + cls.isInterface());
            System.out.pritnln("is enum: " + cls.isArray());
            System.out.println("is primitive: " + cls.isPrimitive());
        }
    }


}