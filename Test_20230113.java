class Test_20230113
{
    
private static String name;
static 
{                     //static代码块只在类的对象创建的时候运行1次，后面再创建对象不会运行
name = "World";
System.out.print (name);
}
public static void main(String[] args)
{  //这里才是程序真正的开始点
System.out.print("Hello");   //第一行运行，第一个显示结果一定是Hello
Test test = new Test();     //虽然无参构造方法什么也没有，但是静态代码块一定会运行一次
Test test2 = new Test();      
}

    
}