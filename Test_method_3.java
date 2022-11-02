class Test_method_3
{
	public static void main(String[] args)
	{
	
	int[] data1 = new int[]{1,3,5,7,9};
	double[] data2 = new double[]{1.1,2.2,3.3,4.4,5.5,6.6};
	int[] temp1 = data1;
	double[] temp2 = data2;
	
	 for(int i = 0; i < temp1.length; i++)
		{
			
			for(int a = 0; a < temp2.length; a++)
			{
			System.out.print("temp2数组第"+(a+1)+"个数是："+temp2[a]);
					 System.out.print("\n");
			}
				System.out.print("temp1数组第"+(i+1)+"个数是："+temp1[i]);
					 System.out.print("\n");
		}
	 
  }
	
	
	
	
}