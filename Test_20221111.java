/*
class Test_method_1
{
    public static void main(String[] args)
    {
        System.out.println(getIntSumRe(100));
    }
    public static int getIntSumRe(int i)
    {
       int sum=0;
       if(i==1) 

       {
         return 1; 
       }
       else
       {
        sum=i+getIntSumRe(i-1);

       }
       return sum;
    }

    public static int getIntSum(int i,int j)
    {
        int sum = 0;
        for(int a = j ; a<=i;a++)
        {
            sum =sum +a;
        }
        return sum; 
    }

   
  }
    */ 
    

 class Test_method_1
{
    public static void main(String[] args)
    {  
        double[] temp={2.2,1.1,5.5,4.4,3.3};
        Arrays.sort(temp);
        for(int i=0;i<temp.length;i++)
        {
            System.out.println(temp[i]+"");
        }
    }
   /* public static void main(String[] args)
    {  
        double[] temp={1.1,2.2,3.3,4.4,5.5};
        System.out.println("temp的值是"+getMax(temp));
    }
    public static double getMax(double[] temp)
    {  
        double max=0;
        for(int i =0;i<temp.length;i++)
        {
            if(temp[i]>max)
            {
                max=temp[i];
            }
        }
        return max;
    }*/


    /*public static void printArrayInt(int[] temp)
    {

    }*/
   /*public static void main(String[] args)
    {  
        int [] data1 =new int[]{1,3,5,7,9,11};
        int[] temp1=data1;
        for(int x =0;x<data1.length;x++)
        {
            
            System.out.println("temp1数组第"+(x+1)+"个数是："+temp1[x]);
        }
        double[] data2= new double[6];
        double[] temp2 =data2;
        data2[0]=1.1;
        data2[1]=2.2; 
        data2[2]=3.3;
        data2[3]=4.4;
        data2[4]=5.5;
        data2[5]=6.6;
        for (int y =0; y< data2.length;y++)
        {
           System.out.println("temp2数组第"+(y+1)+"个数是："+temp2[y]); 
        }
    } */

   /*
        int [][] data1 =new int[][]{{1,2},{2,3,4},{3,4,5,6}};
        double[][] data2= new double[6][6];
        data2[2][2] =2.22;
        data2[3][3]=3.33;
        data2[4][4]=4.44; 
        data2[5][5]=5.55;
        int[][] temp3=data1;
        double[][] temp4 = data2;
        for(int k=0;k<temp3.length;k++)
         {
            for(int a=0;a<temp4[k].length;a++)
            {
              System.out.println("temp3数组第"+temp3[k][a]+"\t");  
            }
            System.out.print("\n");
         }
        
        
       
         for(int x =0;x<temp4.length;x++)
         {
            for(int y=0;y<temp4[x].length;y++)
            {
              System.out.print(""+temp4[x][y]+"\t");  
            }
            System.out.print("\n");
         }
         
    }*/

}