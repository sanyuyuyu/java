/*class Test_20221202
{
    public static void main(String[] args)
    {
        int x = div(1,2);
        try
        {

        }
        catch(Exception e)
        {
            System.out.println(e);
        }
        System.out.println(x);
    }
    public static int div(int a,int b)
    {
        return a/b;
    }
    
}*/

class Test_20221202
{
    public static void main(String[] args)
    {
        Dog dog1 = new Dog("xiaohuang");
        Dog dog2 = new Dog("xiaohuang");
        String s1 = dog1.toString();
        String s2 = dog2.toString();
        String s3 = "xiaohuang";
        String s4 = "xiaohuang";
       boolean a =  s3.equals(s4);  //equals用于判断两个数值是否相等
        System.out.println(a);
    }
}

class Dog
{
    public String name;
    Dog(String name)
    {
        this.name = name;
    }

   
}