class Test_20221114
{
    public static void main(String[] args)
    {
       Occupation temp = new Occupation();
        temp.getInfo();
        String new_name = "zs";
        String new_male = "nv";
        int new_age = 29;
        String new_time = "sd";
        temp.doctor(new_name,new_age,new_male,new_time);
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
    /* public void setName(String name)
    {
        this.name = name;
    }

    public void setAge(int age)
    {
        this.age = age;
    }

    public void setMale(String male)
    {
        this.male = male;
    }

    public void setTime(String time)
    {
        this.time = time;
    }
    */
    public void getInfo()
    {
        System.out.println("name: "+name+"age: "+age+"male: "+male+"time: "+time);
    }
}