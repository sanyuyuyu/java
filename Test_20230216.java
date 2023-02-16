class Test_20230216
{
    public static void main(String[] args)
    {
        System.out.println("我喜欢学习 java");
        System.out.println("*************************************");
        System.out.println("*********   Java 程序设计	 *********");
        System.out.println("*************************************");

          final int  a ;
        a = 1;
        
        final  int b =3;

        for (int i = 100; i < 1000; i++){
            int dd = (int)(Math.pow(i/100, 3) + Math.pow(i%100/10, 3) + Math.pow(i%10, 3));
            if (dd == i){
                System.out.println(i);
            }
        }

    }

    static int add(int a, int b){
        return  a + b;
    }

    static int add(int a, int b, int c){
        return  a + b + c;
    }

    static double add(double a, double b){
        return  a + b;
    }

}