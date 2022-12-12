
import  java.lang.Runtime;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.Duration;

class Test_20221212
{
    public static void main(String[] args) throws Exception
    {
         long start = System.currentTimeMillis();
        for (int i = 0; i < 100; i++) 
        {
            Thread.sleep(100);
        }
        long end = System.currentTimeMillis();
        System.out.println("for循环耗时" + (end - start) + "毫秒");

        
        Runtime run = Runtime.getRuntime();
		System.out.println("虚拟机的内存容量:"+run.maxMemory());
		
		System.out.println("5的平方:"+Math.pow(5,2));
		System.out.println("8开平方	:"+Math.sqrt(89));
		
		System.out.println("生成5个200的随机数:"+(int)(Math.random()*195+5));
		System.out.println("生成5个200的随机数:"+(int)(Math.random()*195+5));
		System.out.println("生成5个200的随机数:"+(int)(Math.random()*195+5));
		System.out.println("生成5个200的随机数:"+(int)(Math.random()*195+5));
		System.out.println("生成5个200的随机数:"+(int)(Math.random()*195+5));
		

		LocalDate n =  LocalDate.now();
		System.out.println("当前的日期是:"+n);
		
		System.out.println( LocalDate.of(2022, 01, 01));
		System.out.println(LocalDate.parse("2022-01-01"));
		
	    	LocalDateTime today = LocalDateTime.now();
		    System.out.println(today);
		    LocalDateTime yuanDate = LocalDateTime.of(2023,1,1,00,00,0);
		    System.out.println(yuanDate);
		    Duration duration = Duration.between(today,yuanDate);	
		    System.out.println(duration.toMillis());
    }
}