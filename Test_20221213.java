// 时间：2022年12月13日
// 地点：信通楼
// 编写人： 王珊珊
/* 目的：学习多线程和图形化
*/
//package Test_9;
//import java.lang.Thread;

public class Test_20221213 
{
 
	public static void main(String[] args) throws Exception
	{
		Mythreadmp R1 = new Mythreadmp("卖票线程1号");  //Runnable（内部有run，但没有start）实现的对象不能直接使用多线程，要用Thread
		Thread t1 = new Thread(R1,"卖票线程1号");
		Mythreadmp R2 = new Mythreadmp("卖票线程2号");  //Runnable对象还是要传递给Thread对象调用
		Thread t2 = new Thread(R2,"卖票线程2号");
		Mythreadmp R3 = new Mythreadmp("卖票线程3号");
		Thread t3 = new Thread(R3,"卖票线程3号");
		t3.setName("云计算票务员3号");
		t3.setPriority(10);
		t1.start();  //调用run方法，不可以直接调用，要用start（）方法简介润（）
		
		t2.start();  //run()作为多线程方法的实现，需要使用操作系统的核心代码，每个操作系统不一样，start方法会自动调用系统多线程
		
		t3.start();
//		System.out.println(t1.getName()+","+t1.getPriority());  //主线程名字稍微高一些，并没有那么高，甚至有些版本
//		System.out.println(t2.getName()+","+t2.getPriority());
//		System.out.println(t3.getName()+","+t3.getPriority());
//		Thread tt = Thread.currentThread(); //返回主方法所在的线程对象给tt
//		System.out.println(tt.getName()+","+tt.getPriority()); //主线程的运行也是和其他线程，多线程一起在运行，由系统调度
		//if(tt1.getName()="云计算票务员3号")
		
			
		
		//直接用两个类的对象方法买票能否有实现多线程
		//new Mythread("Test_12").start();
		//多线程的调用是由操作系统分配的，分配的cpu时间以及优先级可能不一样，有可能每次跑的结果不一样
		//Thread和Runnable的区别：
		/*1.单继承Runnable胜利
		2.使用复杂度Thread稍微优势，但是多一点代码
		3.重要优势：有利于实现数据的共享*/
		
//		Thread R1 = new Thread(new Mythreadmp("卖票线程1号"));
//		Thread R2 = new Thread(new Mythreadmp("卖票线程2号"));
//		Thread R3 = new Thread(new Mythreadmp("卖票线程3号"));
//		R1.start();
//		R2.start();
//		R3.start();
	}

}
//
//class Mythread extends Thread  //实现多线程方法1，继承Thread类
//{
//	private String title = "Test_12";
	//private int ticket = 10;
//	
//	public Mythread(String title)
//	{
//		//super();
//		this.title = title;
//	}
//	//类里面要么是成员属性，要么是方法
////	public void run()  //重写原来
////	{	
////		for(;ticket>0;ticket--)
////		{
////			System.out.println("我是"+title+",我正在运行!");
////		}
////	}
//	
//	public void run()
//	{
//		System.out.println("我是"++",我正在运行!");
//	}
//}

class Mythreadmp implements Runnable 
{
	private String title;
	private int ticket = 10000;
	
	public Mythreadmp(String title)
	{
		this.title = title;
	}
	
	public void run()
	{
//		synchronized(this)  //这个位置加锁，一个位置，一个线程必须卖10000张票一周才能解锁出来
//		{
		if(ticket<=10000)
		{
			for(;ticket>0;ticket--)
			{
				synchronized(this)  //加锁的位置很关键,锁定操作以及资源即可,不要锁定整个循环操作
				{
			    Thread th = Thread.currentThread();
				System.out.println("我是"+th.getName()+"，我正在卖出第"+ticket+"张票");
//				try
//				{
//					Thread.sleep(200); //线程休眠阻塞的方法，
//				}
//				catch(Exception e)
//				{
//					System.out.println(e);
//				}
				}
			}
		}
		else if(ticket<=10)
		{
			System.out.println("票已经卖完");
		}
		else
		{
			System.out.println("程序出错");
		}
		
	}
//	}
}









