class Test_20230221
{
    public static void main(String[] args)
    {

    }
}
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