
// import java.lang.ClassNotFoundException;
// import java.lang.IOException;
// class Test_20230122
// {
//     public static void main(String[] args)
//     {
//             // try 
//             // {
//             // process1();
//             // process2();
//             // process3();
//             // } 
//             // catch (IOException e) 
//             // {
//             //     System.out.println(e);
//             // } 
//             // catch (NumberFormatException e) 
//             // {
//             //     System.out.println(e);
//             // }
//             // try {
//             // process1();
//             // process2();
//             // process3();
//             // } 
//             // catch (IOException e) 
//             // {
//             //     System.out.println("IO error");
//             // } 
//             // catch (UnsupportedEncodingException e)   //UnsupportedEncodingException异常是永远捕获不到的
//             // {                                        //因为他是IOException的子类，当抛出UnsupportEncodingException异常时，会被catch (IOException e) { ... }捕获并执行。


//             //     System.out.println("Bad encoding");
//             // }
//             try 
//             {
//                 process1();
//                 process2();
//                 process3();
//             }
//              catch (UnsupportedEncodingException e)
//             {
//                 System.out.println("Bad encoding");
//             } 
//             catch (IOException e) 
//             {
//                 System.out.println("IO error");
//             }
//     }
// }
// class Test_20230122
// {
//     public static void main(String[] args)
//      {

//         // try 
//         // {
//         //     process1();
//         //     process2();
//         //     process3();
//         //     System.out.println("END");
//         // } 
//         // catch (UnsupportedEncodingException e)
//         // {
//         //     System.out.println("Bad encoding");
//         //     System.out.println("END");
//         // } 
//         // catch (IOException e) 
//         // {
//         //     System.out.println("IO error");
//         //     System.out.println("END");
//         // }



//     }
// }

class Test_20230122
{
    public static void main(String[] args)
    {
        System.out.print(getNumber(0));
        System.out.print(getNumber(1));
        System.out.print(getNumber(2));
        System.out.print(getNumber(4));
    }

    public static int getNumber(int num)
    {
        try
        {
            int result = 2 / num;
            return result;
        }
        catch(Exception exception)
        {
            return 0;
        }
        finally
        {
            if(num == 0)
            {
                return -1;
            }
            if(num == 1)
            {
                return 1;
            }
        }
    }
}