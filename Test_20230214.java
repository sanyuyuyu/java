
class Test_20230214
{
	public static void main(String[] args)
	{
		char c = 'h';
		System.out.println(c);
		System.out.println(((20+3)-1)*2/3);
		
		
		
		boolean rain = true;
		if(rain == true)
		{
			System.out.println("今天下雨了，记得带伞");
		}
		else
		{
			System.out.println("今天没下雨，好开心");
		}
		
		double num = 92.6;
		if(num < 60)
		{
			System.out.println("不给力啊，你的成绩不及格");
		}
		else if((num>60)&&(num<90))
		{
			System.out.println("恭喜你，成绩及格了");
		}
		else
		{
			System.out.println("你的成绩是优秀");
		}
		
		char ch = '三';
		switch(ch)
		{
			case '一':
		{
			System.out.println("鱼香肉丝");
			break;
		}
			case '二':
			{
				System.out.println("麻婆豆腐");
				break;
			}
			case '三':
			{
				System.out.println("红烧肉");
				break;
			}
			case '四':
			{
				System.out.println("糖醋鱼");
				break;
			}
			case '五':
			{
				System.out.println("火锅");
				break;
			}
		
		
		}
		
	/*	int i = 1;
		int sum = 0;
		int j = 100;
		while(i<100)
		{
			sum = sum + i;
			i++;
		}
		System.out.println(sum);
		
		
		for(i = 0;i < j; i++)
		{
			sum = sum + i * 2;
			
		}
			System.out.println(sum);
	*/		
	 int numm = 1;
	 for(;numm < 20;numm++)
	 {
		 System.out.println(numm);
		 if(numm == 4)
		 {
			 continue;
		 }
	 }
	 

	}
	
}
