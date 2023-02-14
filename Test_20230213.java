package cn.cxy.exec;
import java.util.Scanner;

class Test_20230213
{
    public static void main(String[] args)
    {
           System.out.println("请输入你要判断的数字：");
           double input = new Scanner(System.in).nextDouble();
           double result = getAbsNum(input);
            System.out.println(input+"的绝对值是："+result);
    }

     private static double getAbsNum(double input) 
     {
        if(input >=0)
        {   //如果是非负数
            return input;//返回本身的值
        }
        else
        {//如果是负数
            return -input;//取反
        }
    }

}