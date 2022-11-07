/*class Test_four
{
    public static void main(String[] args)
    {
      Person ming = new Person();
      ming.setBirth(2022);
      System.out.println(ming.getAgr());


    }

}
class Person
{
    private String name;
    private int birth;
    
    public void setBirth(int birth)
    {
        this.birth = birth;
    }
    
    public int getAge()
    {
        return calcAge(2022);
    }

     private int calcAge(int currentYear);
     {
        return currentYear - this.birth;
     }
}
*/


class Test_four
{
    public static void main(String[] args)
    {
        int i = 10;
        int j = 1;
        int total = getIntSum(i, j);
        System.out.println(total);
    }

    public static int getIntSum(int i , int j)
    {
        int sum = 0;
        for(; j<i;j++)
        {
            // System.out.println(j);
            System.out.println(i+","+j);
            sum = sum + j;
            // if (j == 4)
            // {
            //     continue;
            // }      
            // System.out.println("abcde");
        }
        return sum;
    }
}
