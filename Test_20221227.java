class Test_20221227
{
    public static void main(String[] args)
    {
        //new Mythead("Test_12").start();
       /* Mythead t1 = new Mythead("线程1号");
        Mythead t2 = new Mythead("线程2号");
        Mythead t3 = new Mythead("线程3号");
        t1.start();
        t2.start();
        t3.start();*/
    }
}
/*
class Mythead extends Thread 
{
    private String title;

    public Mythead(String title)
    {
        this.title = title;
    }

    public void run()
    {
        System.out.println("我是"+title+"，我整运行!");
    }


}*/

class Mythreadmp implements Runnable
{
    private String title;
    private int ticket = 100;

    public Mythreadmp(String title)
    {
        this.title = title;
    }

    public void run()
    {
        if(ticket<=100)
        {
             System.out.println("我是"+title+"，我正在卖出第"+ticket+"张票");
             ticket--;
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
}