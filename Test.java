public class Test
{
    public static void main(String[] args) throws Exception
    {
       for (float i = 1.5f; i > -1.5f; i -= 0.15f)
       {
            for (float j = -1.5f; j < 1.5f; j += 0.05f)
            {
                float a = i * i + j * j - 1;
                String str = (a * a * a - j * j * i * i * i)
                        <= 0.0f ? "*" : " ";
                System.err.print(str);
            }
            Thread.sleep(120);
            System.err.println("");
           
       } 
         System.out.println("                        刘昌鑫天天开心            ");

    }



}