import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Proxy;


class Test_20230205
{
    public static void main(String[] args)
    {
        this.handler = handler;
    }
    public void morning(String name) {
        handler.invoke(
           this,
           Hello.class.getMethod("morning", String.class),
           new Object[] { name });
           // 小韭菜学生类        Student ordinaryStudents = new OrdinaryStudents();  
    }
}

