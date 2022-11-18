// 时间： 2022年10月12日
// 地点：浙江邮电职业技术学院信通楼

/*

class Test_cho
{
	  public static void main(String[] args)
	    {
	    	
	    	for(int x = 1;x<=9;x++)
	    	{
	    	//	System.out.println("第"+i+"行乘法：");

	    		for(int y = 1;y <= x;y++)
	    		{
	    				System.out.print(y+"*"+x+"="+y*x);
							System.out.print("\t");
	    		}
	  			
	     	  	System.out.print("\n");

	    	}
	    	

	    }
	
	
}
*/
class Test_6_2
{
		public static void main(String[] args)
		{
			 JingmMao jm = new JingmMao();
			 jm.shout();
			 
		}
}
/*
class Person
{
		private String name;
		private int age;
		
		public void Person()
		{
			
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
		
		System.out.println("name"+name+age);
		}
		
		
}
*/
class dog
{
		private String name;
		private int age;
		
		public dog()
		{
			
		}
		
		public void shout()
		{
			  System.out.println("汪汪汪，我是狗类。");
		}
}

class QiuTian extends dog
{
		public QiuTian()
		{
			
		}
		
		public void shout() //重写shout方法
		{
				 System.out.println("汪汪汪，我是秋田狗类。");
		}
}

class JingmMao extends dog
{
		public JingmMao()
		{
			
		}
		public void shout()
		{
			 System.out.println("汪汪汪，我是金毛狗类。");
		}
		
		public void Maimeng()
		{
			 System.out.println("金毛卖萌");
		}
}