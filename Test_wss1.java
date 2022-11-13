class Test_wss1
{
    public static void main(String[] args)
    {
        Dog dog1 = new Dog();
        dog1.name = "秋田犬";
        dog1.male = "男";
        dog1.age = 18;
        dog1.getInfo();
        // String name1 = "zs";
        // String loud1 = "mowo";
        // String male1 = "famale";
        // dog1.changeProperty(name1, loud1, male1);
        
        dog1.getInfo();
    }
}



class Dog
{
    public String name;
    public String loud = "汪汪汪"; 
    public String male; // male/female
    public int age;

    // public void dog()
    // {

    // }

    public int func(String arg1, String arg2,String arg3)
    {
        return 10;
    }

    public void dog(String name, String male)
    {
        this.setName(name);
        this.setMale(male);
    }

    // public void changeProperty(String name, String loud, String male)
    // {
    //     this.name = name;
    //     this.loud = loud;
    //     this.male = male;
    // }

    public void setName(String outName)
    {
        name = outName;
    }

    public void setMale(String outMale)
    {
        male = outMale;
    }

    public String getName()
    {
        return name;
    }

    public String getMale()
    {
        return male;
    }

   /* public static void main(String[] args)
    {
        dog dog1 = new dog();
        dog1.name = "秋田犬";
        dog1.male = "男";
        dog1.getInfo();
    }
*/
    public void getInfo()
    {
        System.out.println("年龄:"+name+"叫声:"+loud+"性别:"+male+"性别:"+age);
    }

   public String func1(int arg1, int arg2)
    {
        return "1";
    }
}


