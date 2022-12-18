package testa;

public class test_55 
//
{   public static void main(String[] args) {
	

	Mythread t1 =new Mythread("线程1号");
	Mythread t2 =new Mythread("线程2号");
	Mythread t3 =new Mythread("线程3号");
	//不能直接调用run方法，需要通过start方法调用
	//t1.start();
	//t2.start();
	//t3.start();
	//任务02
	Mythreadmp R1 =new Mythreadmp("卖票线程1号");
	Mythreadmp R2 =new Mythreadmp("卖票线程2号");
	Mythreadmp R3 =new Mythreadmp("卖票线程3号");
	
	Theread th1 =new Thread(R1);
	th1.start();
	new Theread (R2).start();
	new Theread (R3).start();
	//
	th1.getName();
	Theread th1 =new Thread(R1);
	th1.start();
	new Theread (R1,"R2").start();
	new Theread (R1,"R3").start();
   }
}
class Mythread extends Thread
{
  private String title;
  public Mythread(String titleW)
  {
	  this.title=title;
	  
  }
  public void run()
  {
	System.out.printf("我是+title+","我正在运行!");  
  }
}
class Mythreadmp implements Runnable
{
	//重写run方法
	private String title;
	private int ticket =100;
	public Mythreadmp()
	{
		this.title=title;
	}
	//5 03
	public synchronized void sale()
	{
		Thread temp =Thread.currentThread();
		System.out.printf("我是"+temp.getName(),"我正在卖出第"+ticket+"张票");
		ticket--;
	}
	public void run() 
	{
		for(;(ticket>0)&&(ticket<=100);ticket--) 
		{
			System.out.printf("我是"+title+"我正在卖出第"+ticket+"张票");
			ticket--;
			//01
			Thread temp =Thread.currentThread();
			if(temp.getName()=="R1")
			{
				temp.setName("R11");
				try 
				{
				temp.sleep(200);
				}
				catch(Exception e) 
				{
						System.out.println("sleep方法出现异常");
				}
			}
			
			else if(temp.getName()=="R2")
			{
				temp.setName("R22");
			}
			else if(temp.getName()=="R3"&&(ticket>51))
			{
				temp.setName("云计算票务员3号");
				temp.setPriority(10);// 数字越高
				Thread.yield();//放弃cpu1次 03
				//04
				try 
				{
				 temp.join();
				 //等别的程序运行完再运行
				}
				catch(Exception e) 
				{
						System.out.println("join异常");
				}
			}  
			else
			{
				//sale(); 5 03o
			}
			//突然加入
			synchronized(th
