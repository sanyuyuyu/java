// package com.itranswarp.sample;
// class Test_20230123
// {

//         public static void main(String[] args)
//         {
//             String a = "12";
//             String b = "x9";
//         try
//         {
//             int c = stringToInt(a);
//             int d = stringToInt(b);
//             System.out.println(c * d);
//         }
//         catch(NumberFormatException e)
//         {
//             System.out.println(e);
//         }

//         }

//         static int stringToInt(String s)
//         {
//             return Integer.parseInt(s);
//         }

        
// }

// class Test_20230123
// {
//     public static void main(String[] args) 
//     {
//         try 
//         {
//             process1();
//         } 
//         catch (Exception e) 
//         {
//             e.printStackTrace();
//         }
        
//     }

//     static void process1() 
//     {
//         process2();
//     }

//     static void process2() 
//     {
//         Integer.parseInt(null); // 会抛出NumberFormatException
//     }

// }
// /*
// public static int parseInt(String s, int radix) throws NumberFormatException
// {
//     if(s == null)
//     {
//         throw new NumberFormatException("null");
//     }
// }*/

// void process2(String s)
// {
//     if(s == null)
//     {
//         NullPointException e = new NullPointException();
//         throw e;;
//     }
// }

// void process2(String s)
// {
//     if(s == null)
//     {
//         throw new NullPointException();
//     }
// }
// void process1(String s)
// {
//     try
//     {
//         process2();

//     }
//     catch(NullPointException e)
//     {
//         throw new IllegalArgumentException();
//     }
// }
// void process2(String s)
// {
//     if(s == null)
//     {
//         throw new NullPointException();
//     }
// }

// class Test_20230123
// {
//     public static void main(String[] args)
//     {
//         try
//         {
//             process1();
//         }
//         catch(Exception e)
//         {
//             e.printStackTrace();
//         }
//     }
    
//     static void process1()
//     {
//         try
//         {
//             process2();
//         }
//         catch(NullPointException e)
//         {
//             throw new IllegalArgumentException();
//         }
//     }
    
//     static void process2()
//     {
//         throw new NullPointException();
//     }
// }

class Test_20230123
{
    public static void main(String[] args)
    {
        try
        {
            Integer.parseInt("abc");
        }
        catch(Exception e)
        {
            System.out.println("catched");
            throw new RuntimeException(e);
        }
        finally
        {
            System.out.println("finally");
        }
    }
}