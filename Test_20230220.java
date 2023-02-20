class Test_20230220
{
    public static void main(String[] args)
    {
        //清除字符串里面的0
           String str="Java技术学习班20150628";
    	   String sr=str.replaceAll("0", "");
    	   System.out.println(sr);

        //提取字符串
           String str1="612325199502048542";
		   System.out.println(str1.substring(6, 14));

        //统计次数
        String str2="want you to know one thing";
		String[] st=str2.split("n");
		int a=0;
		for(int x=0;x<st.length;x++)
        {
			a++;
		}
		System.out.println(a-1);


        //method one 不用额外的变量来交换，不过可能回溢出
		int i = 23;
		int j = 55;
		System.out.println("i,j:"+i+","+j);
		i = i + j;//右边为i和j之和  可能回溢出
		j = i - j;//右边为为i的值
		i = i - j;//右边为j的值
		System.out.println("i,j:"+i+","+j);
		
		//method two 用额外的变量来临时存储交换，不会发生溢出
		int x = 44;
		int y = 77;
		System.out.println("x,y:" + x + "," + y);
		int tmp = 0;
		tmp = x;
		x = y;
		y = tmp;
		tmp = 0;
		System.out.println("x,y:" + x + "," + y);
		System.out.println(tmp);
    }
}