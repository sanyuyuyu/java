class Test_5_1
{
    public static void main(String[] args)
    {  

        stu4.getIno(); 
        human man1 = new human();
        man1.setName("王小二");
        man1.setAge(23);
        man1.setHobby("钢琴");
        man1.setMale("女");
        man1.getInfo();
      /* 
        //human man1 = new human();
        //human man2 = new human();
        human man4 = new human();
        System.out.println(man4.getName()+man4.getAge()+man4.getMale()+man4.getHobby());
        //human man5 = new human();

        //man2.getInfo();
       man4.getInfo();
        man5.setName("王菲");
        System.out.println("man5:"+man5);

        */
        
        
    }
}

class human
{

    private String name = "大壮";
    private int age = 18;
    private String male = "男";
    private String hobby = "健身";

    public human()
    {

    }

    public human(String outname,int outage,String outmale, String  outhobby)
    {
        this.name = outname;
        age = outage;
        male = outmale;
        hobby = outhobby;

    }
    public void  setName(String name)
    {
        this.name = name;
        this.getInfo();
    }
    public String getName()
    {
        return name;
    }
    public int getAge()
    {
        return age;
    }
     public String getMale()
    {
        return male;
    }
    public String getHobby()
    {
        return hobby;
    }

    public void getInfo()
    {
      // System.out.println("姓名:"+name+","+"年龄："+age+"性别："+male+"爱好："+hobby);  
       System.out.println(this);
    }
}
class Test_5
{
	 public static void main(String[] args)
	 {
	 		/*Stu myself = new Stu();
	 		myself.name = "wss";
	 		myself.age = 18;
	 		myself.male = "女";
	 		myself.num = 20220118133l;
	 		myself.getInfo();
	 		*/
	 		Stu stu1 = new Stu();
	 		stu1.setName("张三");
	 		stu1.setAge(18);
	 		stu1.setMale("男");
	 		stu1.setNum(202100000001l);
	 		stu1.getInfo();
	 		
	 		Stu stu2 = new Stu();
	 		stu2.name = "李四";
	 		stu2.age = 19;
	 		stu2.male = "女";
	 		stu2.num = 202100000002l;
	 		stu2.getInfo();
	 		
	 	//	stu2 = stu1;
	 	//	stu2.getInfo();
	 	
	 }
}

class Stu
{
		public String name;
		public int age;
		public String male;
		public long num;
		
	  public void setName(String name)
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
	  
	  public void setNum(long num)
	  {
	  	this.num = num;
	  }
	  
		public void Stu(String name,int age,String male,int num)
		{
			this.name = name;
			this.age = age;
			this.male = male;
			this.num = num;
		}
		
		public void getInfo()
		{
				
				System.out.println(" 姓名: "+name+" 年龄: "+age+" 性别: "+male);
				System.out.println(age);
		}
}