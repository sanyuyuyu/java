/*
import java.io.UnsupportedEncodingException;
import java.util.Arrays;
class Test_20230121
{
    public static void main(String[] args)
    {
        int code = processFile("C:\\test.txt");
        if(code == 0)
        {   
             System.out.println("OK");
        }   
        else
        {
            //error;
            switch(code)
            {
                case 1:
                System.out.println("file not found");
                case 2:
                System.out.println("no read permission");
                default:
                System.out.println("unknown error");
            
            }

        }
    }
}*/
 
/*
import java.io.UnsupportedEncodingException;
import java.util.Arrays;
class Test_20230121
{
    public static void main(String[] args)
    {
        byte[] bs = toGBK("中文");
        System.out.println(Arrays.toString(bs));

    }
   static byte[] toGBK(String s) 
   {
        try 
        {
            // 用指定编码转换String为byte[]:
            return s.getBytes("GBK");
        } 
        catch (UnsupportedEncodingException e)
         {
            // 如果系统不支持GBK编码，会捕获到UnsupportedEncodingException:
            System.out.println(e); // 打印异常信息
            return s.getBytes(); // 尝试使用用默认编码
         }
    }
}*/
import java.io.UnsupportedEncodingException;
import java.util.Arrays;
class Test_20230121 
{
    public static void main(String[] args)
     {
        try
        {
            byte[] bs = toGBK("中文");
            System.out.println(Arrays.toString(bs));
        } 
        catch (UnsupportedEncodingException e) 
        {
            System.out.println(e);
        }
    }

        // static byte[] toGBK(String s) throws UnsupportedEncodingException 
        // {
        // // 用指定编码转换String为byte[]:
        // return s.getBytes("GBK");
        // }
        // static byte[] toGBK(String s)
        // {
        // try
        // {
        //       return s.getBytes("GBK");
        // } catch (UnsupportedEncodingException e) 
        // {
        //         // 什么也不干
        // }
        //   return null;
        // }
}
