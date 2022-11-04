	class Test_two
    {

         public static void main(String[] args)
         {
            double[] a = new double[]{12,45,23,56,24};
            System.out.print(getMax(a));
         }
    public static double  getMax(double[] temp)
	{	
			for(int i = 0;i<temp.length-1;i++)
			{
				double max = 0;
				if(temp[i]>temp[i+1])
				{
					max = temp[i];
					temp[i+1] = max;
					
				}
			
			}		
			return temp[temp.length-1];
		}

    }
    
   