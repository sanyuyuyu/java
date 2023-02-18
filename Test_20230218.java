

import java.util.Scanner;

public class Test_20230218 {
   public static void main(String[] args) {
      System.out.println("输入两个整数：");
      int a = new Scanner(System.in).nextInt();
      int b = new Scanner(System.in).nextInt();

      int d = zdgys(a,b);//调用求最大公约数的方法
      long x = zxgbs(a,b);//调用求最小公倍数的方法
      System.out.println("最大公约数："+d);
      System.out.println("最小公倍数："+x);
   }

   private static int zdgys(int a, int b) {
      int min = a<b ? a : b;
      for(int i=min; i>=1; i--) {
         //i能把a和b同时整除
         if(a%i==0 && b%i==0) {
            return i;
         }
      }
      //这句代码根本不会执行，
      //让编译可以通过
      return 0;
   }

   private static long zxgbs(int a, int b) {
      int max = a>b? a : b;
      for(long i=max; ;i+=max) {
         //i能同时被a和b整除
         if(i%a==0 && i%b==0) {
            return i;
         }
      }
   }

}
