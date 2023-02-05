import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;


class Test_20230204_2
{
    public static void main(String[] args)
    {
        InvocationHandler handler = new InvocationHandler()
        {
            public Object invoke(Object proxy,Method method,Object[] args) throws Throwable
            {
                System.out.println(method);
                if (method.getName().equals("morning"))
                {
                    System.out.println("Good morning," + args[0]);
                }
                return null;
            }
        };
        Hello hello = (Hello) Proxy.newProxyInstance (
            Hello.class.getClassLoader(), //传入ClassLoader
            new Class[] {Hello.class}, //传入要实现的接口
            handler); //传入处理调用方法的InvocationHandler
            hello.morning("Bob");


        
    }
}

interface Hello
{
    void morning(String name);
}