package yjs;
import java.util.Random;



class Test_20221211
{
    public static void main(String[] args)
    {
        	int[] arr1 = new int[] {11,22,33,44,55};
			int[] arr2 = new int[] {1,2,3,4,5,6,7};
			System.out.println("替换前的arr2:");
			for(int i = 0;i<arr2.length;i++)
			{
			System.out.print(arr2[i]+",");
			}
			System.arraycopy(arr1, 2, arr2, 4, 3);
			System.out.println();
			System.out.println("替换前的arr2:");
			for(int i = 0;i<arr2.length;i++)
			{
			System.out.print(arr2[i]+",");			
			}
			
			System.out.println("当前的时间是:："+System.currentTimeMillis());//电脑开机运行持续到现在的时间持续段
			
			//使用currentTimeMillis()计算程序运行时间
			//运行后的时间-运行的时间点 = 持续的时间
			long start = System.currentTimeMillis();
			long sum = 0;
			for(int x = 1; x <= 100000000;x++)
			{
				sum = sum + x;
			}
			long end = System.currentTimeMillis();
			System.out.println("花费的时间："+(end-start));
			
			Runtime rr = Runtime.getRuntime();//getruntime获取了Test_9_3程序对象
			System.out.println("Test_9_3运行获得的cpu数量："+rr.availableProcessors());
			
			System.out.println( "89开平方::"+Math.sqrt(89));
			
			Random r1 = new Random();
			System.out.println("2002以内的第一个随机inr数值:"+r1.nextInt(100));
			
			LocalDate n =  LocalDate.now();
			System.out.println("当前的日期是:"+n);
			
    }
}


