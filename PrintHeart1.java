/*class getHeart
{
 public static void main(String[] args)
 {

 }
  public static void getHeart() 
   {
		
		for(int i = 0; i < 3; i++)
        {//爱心的上半部分左部分
			for(int j = 6; j > 2 * i; j--) {
				System.out.print(" ");
			}
			for(int j = 0; j < 6 + 4 * i; j++) {
				System.out.print("*");
			}
			
			for(int q = 6; q > 3 * i  ; q--) {//爱心的上半部分右部分
				System.out.print(" ");
			}
			for(int w = 0; w < 6 + 4 * i; w++) {
				System.out.print("*");
			}
			System.out.println();
		}
		
		for(int i = 0; i < 9; i++) 
        {//开始打印心的最下半部分
			for(int q = 0; q < i * 2; q++) {
				System.out.print(" ");
			}
			for(int j = 31; j > 4 * i -1; j--) {
				System.out.print("*");
			}
			System.out.println();
		}
	}

 
}
*/
    /**
    *打印心形
    */
  /* public static void aiXin(){
		public static void main(String[] args)
          for(float y = (float) 1.5;y>-1.5;y -=0.1)  {  
              for(float x= (float) -1.5;x<1.5;x+= 0.05){  
                    float a = x*x+y*y-1;  
                    if((a*a*a-x*x*y*y*y)<=0.0)  {    
                           System.out.print("^");  
                    }  
                    else  
                           System.out.print(" ");  
              }  
              System.out.println();  
       }  
    }
	*/
	 
class PrintHeart1 {

        public static void main(String[] args) {

                System.out.print("\t" + "*" + "\t\t\t\t\t\t\t\t\t\t\t\t" + "*" + "\t" + "\n");

                System.out.print("*" + "\t\t" + "*" + "\t\t\t\t" + "i love " + "\t\t\t\t\t" + "*" + "\t\t" + "*" + "\n");

                System.out.print("\t" + "*" + "\t\t\t\t\t\t\t\t\t\t\t\t" + "*" + "\t" + "\n");

                System.out.print("\t\t" + "*" + "\t\t\t\t\t\t\t\t\t\t" + "*" + "\t\t" + "\n");

                System.out.print("\t\t\t" + "*" + "\t\t\t\t\t\t\t\t" + "*" + "\t" + "\n");

                System.out.print("\t\t\t\t" + "*" + "\t\t\t\t\t\t" + "*" + "" + "\t" + "\n");

                System.out.print("\t\t\t\t\t" + "*" + "\t\t\t\t" + "*" + "" + "\t\t" + "\n");

                System.out.print("\t\t\t\t\t\t" + "*" + "\t\t" + "*" + "" + "\t\t" + "\n");

                System.out.print("\t\t\t\t\t\t\t" + "*" + "\n");

        }

}
