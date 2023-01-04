
    
//Thread和Runnable都属于java.lang包，无需手动导入
//java.lang包里面的类太过于重要，所以自动导入



public class Test_20230104 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Mythread t1 = new Mythread("线程1号");
		Mythread t2 = new Mythread("线程2号");
		Mythread t3 = new Mythread("线程3号");
		//多线程还是通过类的实例化对象实现
		//直接调用润方法不能多线程，需要通过start方法调用
//		t1.start();
//		t2.start();
//		t3.start();
		Mythreadmp R1 = new Mythreadmp("卖票线程1号");
		Mythreadmp R2 = new Mythreadmp("卖票线程2号");
		Mythreadmp R3 = new Mythreadmp("卖票线程3号");
		//调用Mythreadmp类，实现多线程，由于Runnable没有start方法
		//不能直接多线程
		//Mythread卖票多线程要通过Thread类构造，调用start
		Thread th1 = new Thread(R1);
		//Thread th2 = new Thread(R2); //new Thread(R2).start();
		//Thread th3 = new Thread(R3);
		
		th1.start();
		//th2.start();
		//th3.start();
		
		new Thread(R2).start();
		new Thread(R3).start();
		
		//Runnable和Thread类的使用区别
		//优先使用Runnable来实现多线程
		//Runnable逻辑上是多线程资源和方法的实现
		//Thread构造调用，是1还是n哥多线程
		//卖同一份票重复的原因：1号卖完还没有来的及ticket--，2号或者3号直接过来卖没有-1的ticket
		//某些类标注的线程不安全的原因，例如Stringbuffer
		
	}

}


class Mythread extends Thread  //单继承
{
	private String title;
	
	public Mythread(String title)
	{
		this.title = title;
	}
	
	public void run()
	{
		System.out.println("我是"+title+",我正在运行!");
	}
	
}

//通过实现Runnable借口，开展多线程
//使用Runnable可以突破多继承的功能

class Mythreadmp implements Runnable
{
	//必须重写run抽象方法 
	private String title;
	private int ticket = 100;
	
	public Mythreadmp(String title)
	{
		this.title = title;
	}
	
	public void run()
	{
		//算法：循环卖票100张，ticket 0 - 100是正常的卖票
		//ticket大于100或者小于0.是不正常的卖票，跳出程序或者不执行
		//算法是编程的核心
		for(;(ticket>0)&&(ticket<=100);)
		{
			System.out.println("我是"+title+"，我正在卖出第"+ticket+"张票");
			ticket--;
			
		}
		if((ticket>100)&&(ticket<=0))
		{
			System.out.println("票已经卖完");
			
		}
		
		
		
	}
	
}