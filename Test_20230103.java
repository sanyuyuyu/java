class Test_20230103
{
    public static void main(String[] args)
    {


        Mythreadmp R1 = new Mythreadmp("卖票线程1号");
        Mythreadmp R2 = new Mythreadmp("卖票线程2号");
        Mythreadmp R3 = new Mythreadmp("卖票线程3号");
        Thread t1 = new Thread(R1,"卖票线程1号");
        Thread t2 = new Thread(R2,"卖票线程1号");
        Thread t3 = new Thread(R3,"卖票线程1号");
        t1.start();
        t2.start();
        t3.start();
	}

}

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

    }
}