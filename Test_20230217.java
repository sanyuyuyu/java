
public class Test_20230217
{

	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
		Stu myself = new Stu();
		myself.name = "zhangsan";
		myself.age = 18;
		myself.male = "nv";
		myself.num = "2222";
		myself.getInfo();
		
		Stu stu1 = new Stu();
		stu1.setName("lisi");
		stu1.setAge(18);
		stu1.setMale("nan");
		stu1.setNum("2022");
		stu1.getInfo();
		
		Stu stu2 = new Stu();
		stu2.setName("lisi");
		stu2.setAge(18);
		stu2.setMale("nan");
		stu2.setNum("20222222");
		stu2.getInfo();
		
		stu2 = stu1;
		stu2.getInfo();
		
	}

}

class Stu
{
	public String name;
	public int age;
	public String male;
	public String num;
	
	
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
	
	public void setNum(String num)
	{
		this.num = num;
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
	
	public String getNum()
	{
		return num;
	}
	
	public void getInfo()
	{
		System.out.println("姓名："+name+" 年龄："+age+" 性别："+male+"学号+"+num);
	}
}







