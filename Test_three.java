/*class Test_three
{
    public static void main(String[] args)
    {
        Person ming = new Person();
        ming.setName("wss");
        ming.setAge(18);
        System.out.println(ming.getName() + "," + ming.getAge());
    }
}
*/

/*public void setName(String name)
{
    if (name == null || name.isBlank())
    {
        throw new IllegalArgumentException("invalid name");
    }
    this.name = name.strip();
}*/
class Test_three
{
    public static void main(String[] args)
    {
        double[] d = new double[]{1,23,42,46,243,43,12};
        System.out.print(getMax(d));
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