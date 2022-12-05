class Test_20221205
{
    public static void main(String[] args)
    {

        Stu stu00 = new Stu("文文",22,"浙江邮电职业技术学院","20211117676");
        stu00.getInfo();
    }
}

class Person
{
		
    private String name;
    private int age;
    
		public Person()
		{
			
		}
		
		public Person(String name)
		{
			this.name = name;
		}
		public Person(String name,int age)
		{
			this.name = name;
			this.age = age;
		}
		
    
    public String getName()
    {
    	return name;
    }
    
    public int getAge()
    {
    	return age;
    }
    
    public void SetName(String name)
    {
        this.name = name;
    }

    public void SetAge(int age)
    {
        this.age = age;
    }

    public void getInfo()
    {
        System.out.println("姓名： "+name+"年龄： "+age);
    }
}

class Stu extends Person
{
		private  String school;
		private String num;
		public int name;
		//public String name = "文文";
		
		public Stu()
		{
			
		}
		
		
		public Stu(int name,int age,String school,String num,String name)
		{
			super(name,age);
			this.school = school;
			this.num = num;
			//this.name = name;
			
		}
			

		
		public void SetSchool(String school)
		{
			this.school = school;
		}
		
		public void SetNum(String num)
		{
			this.num = num;
		}
		
		
		
		public String getSchool()
		{
			return school;
		}
		
		public String getNum()
		{
			return num;
		}
		
		
		public void getInfo()
		{
           // System.out.println(name);
			//super.getInfo();
			System.out.println(" 姓名: "+super.getName()+" 年龄: "+super.getAge()+" 学校: "+school+" 学号: "+num);
		}
		
		
	
}
