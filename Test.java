class Test
{
    public static void main(String[] args)
    {
       Occupation temp = new Occupation();
       temp.getInfo();
        

       
    }
}
class Occupation
{
    String name = "wangfei";
    int age = 30;
    String male = "nan";
    String time = "12";
    public void doctor(String name,int age,String male,String time)
    {
        this.name = name;
        this.age = age;
        this.male = male;
        this.time = time;
    }
    public void getInfo()
    {
        System.out.println("name: "+name+"age: "+age+"male: "+male+"time: "+time);
    }
}