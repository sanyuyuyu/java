
class Student{
   private String sNO;      //学号
   private String sName;    //姓名
   private String sSex;     //性别
   private int sAge;        //年龄
   private int sJava;       //Java课程成绩
    //构造方法
    public Student(String sNO,String sName,String sSex,int sAge,int sJava){
        //对成员变量的赋值
        this.sNO=sNO;
        this.sName=sName;
        this.sSex=sSex;
        this.sAge=sAge;
        this.sJava=sJava;
    }
    public void run(){  //成员方法
        //输出每个学生的信息
        System.out.println("学号:"+this.sNO+" 姓名:"+sName+" 性别："+sSex+" 年龄："+sAge+" Java课成绩:"+sJava);
    }
    //类Student的成员方法(获得学号)
    public String  getNO(){
        return sNO;
    }
    //类Student的成员方法(获得姓名)
    public String  getName(){
        return sName;
    }
    //类Student的成员方法(获得性别)
    public String  getsex(){
        return sSex;
    }
    //类Student的成员方法(获得年龄)
    public int getAge(){
        return sAge;
    }
    //类Student的成员方法(获得Java课程成绩)
    public int  getJava(){
     return sJava;
    }

}
public class Test_20230215{
    public static void main(String[] args) {
        //实例化5个Student对象
        Student stu1 = new Student("1","学生1","男",15,60);
        Student stu2 = new Student("2","学生2","女",16,70);
        Student stu3 = new Student("3","学生3","男",17,80);
        Student stu4 = new Student("4","学生4","女",18,90);
        Student stu5 = new Student("5","学生5","男",19,100);
        //调用run()方法打印每个学生的信息
        stu1.run();
        stu2.run();
        stu3.run();
        stu4.run();
        stu5.run();
        //求五个学生Java语言成绩的平均值
                                                                             int avg=(stu1.getJava()+stu2.getJava()+stu3.getJava()+stu4.getJava()+stu5.getJava())/5;
        //把五个学生Java语言成绩放进数组，然后调用getMax方法和getMin方法求最大最小值
                                                                             int [] arr={stu1.getJava(),stu2.getJava(),stu3.getJava(),stu4.getJava(),stu5.getJava()};
        System.out.println("Java语言成绩的平均值:"+avg+"\nJava语言成绩的最大值:"+getMax(arr)+"\nJava语言成绩的最小值:"+getMix(arr));
    }
         //获取最大值方法
        public static int getMax(int[] arr){
            int max =arr[0];
            for (int i = 1;i<arr.length;i++){
                if(arr[i]>max){
                    max=arr[i];
                }
            }
            return max;
        }
        //获取最小值方法
        public static int getMix(int[] arr){
            int mix = arr[0];
            for (int i = 1;i<arr.length;i++){
                if(arr[i]<mix){
                    mix=arr[i];
                }
            }
            return mix;
        }
}



    }
}