class Test_wss
{
    public static void main(String[] args)
    {
        dog dog1 = new dog();
        dog1.name = "秋田犬";
        dog1.male = "男";
        dog1.getInfo();
        dog.dog()
    }
}



class dog
{
    public String name;
    public  String loud = "汪汪汪"; 
    public String male;

    public dog()
    {

    }

    public void dog(String name, String male)
    {
        this.setName(name);
        this.setMale(male);
    }

    public void dog(String name, String loud, String male)
    {
        this.name = name;
        this.male = male;
    }

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
        System.out.println("年龄:"+name+"叫声:"+loud+"性别:"+male);
    }


}


