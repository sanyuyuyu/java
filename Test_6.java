class Test_6
{
    public static void main(String[] args)
    {
        Person stu = new Person("文文",22,"浙江邮电职业技术学院","20211117676",1000);
        stu.getInfo();
    }
}




class Person
{
		
    public String name;
    public int age;

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
		public  String school;
		public String num;
		public int name = 1000;
		//public String name = "文文";
		
		public Stu()
		{
			
		}
		
		
		public Stu(String name,int age,String school,String num,int name)
		{
			super(name,age);
			this.school = school;
			this.num = num;
			this.name = name;
			
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
			super.getInfo();
			System.out.println(" 姓名: "+name+" 年龄: "+age+" 学校: "+school+" 学号: "+num+" name: "+name);
		}
		
		
	
}
