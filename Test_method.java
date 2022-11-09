/*class Test_method
{ 
 public static void main(String[] args)
    {
        getprintname();
        getprintname();
        getprintname();

    }
        public static void getprintname()
        { 
            String a = "your name is so handsome";
            for(int x = 1; x < 4; x++)

            System.out.println(a);

        }

}*/


/*
class Test_method
{
	 public static void main(String[] args)
	 {
	 	/*int a = 3;
        int b = 333;	 	
		System.out.println(getIntSum(b,a));
	 }*/
	/*public static int getIntSum(int i)
	{
		
		int sum = 0;
		for(int j = 1; j <= i; j++)
		{
			sum = sum + j;
		}
		return sum;
	}*/
/*	public static int getIntSum(int i,int j)
	{
        int sum = 0;
        for(; j <= i;j++)
        {
            sum = sum + j;
        }
		return sum;
	}
	*/
   /* System.out.println(getIntSumRe(100));
     }
     public static int getIntSumRe(int i)
        {
            int sum = 0;
            if(i == 1 )
            {
                return 1;
            }
            else
            {
                sum = i + getIntSumRe(i-1);
            }
            return sum;
        }

}*/
/*class Test_method
{
    public static void main(String[] args)
    {
        int[] data1 = new int[]{1,3,5,7,9,11}; //静态方法创建int类型
        double[] data2 = new double[6];      //动态方法创建double类型 
        data2[0] = 1.1;
        data2[1] = 2.2;
        data2[2] = 3.3;
        data2[3] = 4.4;
        data2[4] = 5.5;
        data2[5] = 6.6;
        int[] temp1 = data1; 把data1的地址传递给temp
        double[] temp2 = data2; 把data2的地址传递给temp
        for(int x = 0; x < data1.length;x++)
        {
            System.out.println("temp1数组第"+(x+1)+"个数是:"+temp1[x]);

        } 
        for(int y = 0; y < data2.length;y++)
        {
             System.out.println("temp2数组第"+(y+1)+"个数是:"+temp2[y]);
        }      
    }

}*/
/*class Test_method
{
    public static void main(String[] args)
    {
        int[][] data1 = new int[][]{{1,2},{2,3,4},{3,4,5,6}};
        double[][] data2 = new double[5][6];
        data2[1][1] = 2.22;
        data2[2][2] = 3.33;  
        data2[3][3] = 4.44;
        data2[4][4] = 5.55;
        int[][] temp3 = data1;
        double[][] temp4 = data2;
        for(int x = 0; x <  data1.length;x++)
        {
            for(int y = 0; y < data1[x].length; y++)
            {
                System.out.println("temp3数组第"+(x+1)+"行:"+(y+1)+"列数是:"+temp3[x][y]+"\t");
            }
                System.out.println("\n");
        } 
        for(int x = 0; x < temp4.length;x++)
        {
            for(int y = 0; y < temp4[x].length; y++)
            {
                System.out.println("temp4数组第"+(x+1)+"行:"+(y+1)+"列数是:"+temp4[x][y]+"\t");
            }
                System.out.println("\n");
        } 
           
    }
}*/
/*class Test_method
{
    public static void main(String[] args)
    {





      //  int[] a = new int[]{1,2,3,4,5,6,7};
      //  printArrayInt(a);
        double[] temp = new double[]{1.1,2.2,3.3,4.4,5.5};
        System.out.println("temp="+getMax(temp));
    }*/
   /* public static void printArrayInt(int[] temp)
    {
        for(int i = 0; i < temp.length; i++)
        {          
            System.out.println("temp["+i+"]"+"="+temp[i]+"\t");
        }
        
    }*/
    /* public static double getMax(double[] temp)
    {
        double max = 0;
        for(int i = 0; i<temp.length-1; i++)
        {
            if(temp[i]>temp[i+1])
            {
                max = temp[i];
                temp[i+1] = max;
            }
        }
        return temp[temp.length-1];
    }*/
      /*  public static double getMax(double[] temp)
        {
            for(int i = 0; i < temp.length; i++)
            {
                for(int j=i+1;j<temp.length;j++)
                {
                    if(a[j]>a[i])
                    {
                        int t = a[i];
                        a[i] = a[j];
                        a[j] = t;
                    }
                }
            }

        }*/


import java.util.Arrays;
class Test_method
{
    public static void main(String args[])
    {

      //  int[] a = new int[]{1,2,3,4,5,6,7};
      //  printArrayInt(a);
        double[] temp = {2.2,4.4,5.5,1.1,3.3};
        Arrays.sort(temp);
        for(int i = 0; i < temp.length; i++)
        {
            System.out.println(temp[i]+"");
        }
    }
}
 class