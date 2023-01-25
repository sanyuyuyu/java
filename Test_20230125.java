/*class Test_20230125
{
    public static void main(String[] args)
    {
        //private String s;
        // String s = null;
        //System.out.println(s.toLowerCase());

        Person p = new Person();
        System.out.println(p.address.city.toLowerCase());

    }
}

class Person
{
    String[] name = new String[2];
    Address address = new Address();
}

class Address
{
    String city;
    String street;
    String zipcode;
}


class Test_20230125
{
    public static void main(String[] args)
    {
        double x = Math.abs(-123.45);
        assert x >= 0;  //x Must >= 0
        System.out.println(x);//Assertion是一种调试程序的方法 assert作为关键字实现断言
        // assert x >= 0即位断言，断言失败，抛出AssertionError
        //断言不能用于可恢复的程序错误，只用于开发和测试阶段

       void sort(int[] arr)
        {
            if(arr == null)
            {
                throw new IllegalArgumentException("array cannot be null");
            }
        }
    }
}
class Test_20230125
{
    public static void main(String[] args)
    {
        int x = -1;
        assert x > 0;
        System.out.println(x);  //没有实现断言 原因：JVM默认关闭断言指令，即遇到assert语句就自动忽略，不执行
                                // 要执行assert语句，必须 给java虚拟机传递-enablessertions(-ea)参数启用断言
    }

}
import java.util.logging.Level;
import java.util.logging.Logger;

class Test_20230125
{
    public static void main(String[] args)
    {
       /* Logger logger = Logger.getGlobal();
        logger.info("start process...");
        logger.warning("memory kid running out...");
        logger.fine("ignored.");
        logger.severe("process will be terminated...");


        Logger logger = Logger.getLogger(Main.class.getName());
        logger.info("Start process...");
        try
        {
            "".getBytes("invalidCharsetName");
        }
        catch(UnsupportedEncodingException e)
        {
            logger.severe(e.toString());
        }
        logger.info("Process end.");
    }
}*/
/*
import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;


class Test_20230125
{
    public static void main(String[] args)
    {   
        Log log = LogFactory.getLog(Test_20230125.class);
        log.info("start...");
        log.warn("end.");


    }
}*/

import java.util.logging.Level;
import java.util.logging.Logger;

class Test_20230125
{
    public static void main(String[] args)
    {
        Logger logger = Logger.getGlobal();
        logger.info("start process...");
        logger.warning("memory kid running out...");
        logger.fine("ignored.");
        logger.severe("process will be terminated...");


        // Logger logger = Logger.getLogger(Main.class.getName());
        // logger.info("Start process...");
        // try
        // {
        //     "".getBytes("invalidCharsetName");
        // }
        // catch(UnsupportedEncodingException e)
        // {
        //     logger.severe(e.toString());
        // }
        // logger.info("Process end.");
    }
}