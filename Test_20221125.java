/*class Test_20221125
{
    public static void main(String[] args)
    {
        int[] temp = {22,24,76,12,21,33};  //定义数组
        int max = 0; //定义最大值
        for(int x = 0; x < temp.length-1;x++) 
        {
            if(temp[x]>temp[x+1]) //判断前后大小
            {
                max = temp[x]; 
                temp[x+1] = max; //交换
            }
        }
        System.out.println(max); //输出最大值
    }
}*/
/*
class Test_20221125
{
    public static void main(String[] args)
    {
        int[] temp = {12,23,44,21,12};
        int max = 0;
        for(int x = 0; x < temp.length-1;x++)
        {
            if(temp[x]>temp[x+1])
            {
                max = temp[x];
                temp[x+1] = temp[x];
            }
        }
        System.out.println(max);
    }
}*/
/*

class Test_20221125
{
    public static void main(String[] args)
    {
        /*Student a = new Student(2022,"王小五","男",18,90);
        a.getInfo();*/
   /*     Student s1 = new Student(1, "小a","男" , 18, 95);
        Student s2 = new Student(2,"小b","女",20,90);
        Student s3 = new Student(3,"小c","女",21,65);
        Student s4 = new Student(4, "小d", "男", 18, 100);
        Student s5 = new Student(5, "小e", "男", 15, 85);
        s1.getInfo();
        s2.getInfo();
        s3.getInfo();
        s4.getInfo();
        s5.getInfo();
         int sum = 0;
        for(int i = 0; i<stus.length;i++){
            sum += stus[i].getsJava();
        }
        System.out.println("平均成绩："+(sum/5));
    
        
    }
}
*//*
class Student
{
    public long sNo;
    public String sName;
    public String sSex;
    public int sAge;
    public double sJava;

    public Student(long sNo,String sName,String sSex,int sAge,double sJava)
    {
        this.sNo = sNo;
        this.sName = sName;
        this.sSex = sSex;
        this.sAge = sAge;
        this.sJava = sJava;
    }

    public void setsNo(long sNo)
    {
        this.sNo = sNo;
    }

    public void setsName(String sName)
    {
        this.sName = sName;
    }

    public void setsSex(String sSex)
    {
        this.sSex = sSex;
    }

    public void setAge(int age)
    {
        this.sAge = sAge;
    }

    public void setJava(double sJava)
    {
        this.sJava = sJava;
    }

    public long getNo()
    {
        return sNo;
    }

    public String getName()
    {
        return sName;
    }

    public String getSex()
    {
        return sSex;
    }

    public int getAge()
    {
        return sAge;
    }

    public double getJava()
    {
        return sJava;
    }

    public void getInfo()
    {
       System.out.println("学号: "+sNo+" 姓名: "+sName+" 性别: "+sSex+" 年龄: "+sAge+" 成绩: "+sJava);
    }
}/*
public class Test_20221125{

    public static void main(String[] args) {
        // 学员信息
        Student stu1 = new Student(1, "郭靖", "男", 22, 90);
        Student stu2 = new Student(2, "欧阳锋", "男", 61, 91);
        Student stu3 = new Student(3, "杨康", "男", 20, 92);
        Student stu4 = new Student(4, "欧阳克", "男", 23, 93);
        Student stu5 = new Student(5, "穆念慈", "女", 24, 94);
        Student [] stus = new Student[5];
        stus[0] = stu1;
        stus[1] = stu2;
        stus[2] = stu3;
        stus[3] = stu4;
        stus[4] = stu5;
       
        for(int i = 0; i<stus.length;i++){
            System.out.println(stus[i].getsNo()+"\t"
                            +stus[i].getsName()
                            +"\t"+stus[i].getsSex()
                            +"\t"+stus[i].getsAge()
                            +"\t"+stus[i].getsJava());
        }
        
        int sum = 0;
        for(int i = 0; i<stus.length;i++){
            sum += stus[i].getsJava();
        }
        System.out.println("平均成绩："+(sum/5));
    }
}

class Student
{
    private int sNo;
    private String sName;
    private String sSex;
    private int sAge;
    private int sJava;
    public Student(int sNo, String sName, String sSex, int sAge, int sJava) {
        this.sNo = sNo;
        this.sName = sName;
        this.sSex = sSex;
        this.sAge = sAge;
        this.sJava = sJava;
    }
    public int getsNo() {
        return sNo;
    }
    public void setsNo(int sNo) {
        this.sNo = sNo;
    }
    public String getsName() {
        return sName;
    }
    public void setsName(String sName) {
        this.sName = sName;
    }
    public String getsSex() {
        return sSex;
    }
    public void setsSex(String sSex) {
        this.sSex = sSex;
    }
    public int getsAge() {
        return sAge;
    }
    public void setsAge(int sAge) {
        this.sAge = sAge;
    }
    public int getsJava() {
        return sJava;
    }
    public void setsJava(int sJava) {
        this.sJava = sJava;
    }
    
}*/
/*
class Student{
    private int sNo;
    private String sName;
    private String sSex;
    private int sAge;
    private int sJava;
    
    public Student(int sNo, String sName, String sSex, int sAge, int sJava) {
        super();
        this.sNo = sNo;
        this.sName = sName;
        this.sSex = sSex;
        this.sAge = sAge;
        this.sJava = sJava;
    }

    public int getsNo() {
        return sNo;
    }

    public String getsName() {
        return sName;
    }

    public String getsSex() {
        return sSex;
    }

    public int getsAge() {
        return sAge;
    }

    public int getsJava() {
        return sJava;
    }

    @Override
    public String toString() {
        return "student [sNo=" + sNo + ", sName=" + sName + ", sSex=" + sSex + ", sAge=" + sAge + ", sJava=" + sJava
                + "]";
    }    
    
    
}

    
public class Test_20221125 {

    public static void main(String[] args) {
        Student s1 = new Student(1, "小a","男" , 18, 95);
        Student s2 = new Student(2,"小b","女",20,90);
        Student s3 = new Student(3,"小c","女",21,65);
        Student s4 = new Student(4, "小d", "男", 18, 100);
        Student s5 = new Student(5, "小e", "男", 15, 85);
        int [] s = new int[5];
        s[0] = s1.getsJava();
        s[1] = s2.getsJava();
        s[2] = s3.getsJava();
        s[3] = s4.getsJava();
        s[4] = s5.getsJava();
       
        int sum = 0;
        int Max=s[1],Min=s[1];
        for (int i = 0; i < s.length; i++) {
            
            sum = sum+s[i];
            
            if (Max < s[i]) {
                Max = s[i];
            }
            if (Min >s[i]) {
                Min = s[i];
            }
        }
        System.out.println("java的平均成绩为"+sum/5);
        System.out.println("java成绩的最小值"+Min);
        System.out.println("java成绩的最大值"+Max);
        
    }

}*/

    
public class Test_20221125
 {

    public static void main(String[] args) {
        Student s1 = new Student(1, "小a","男" , 18, 95);
        Student s2 = new Student(2,"小b","女",20,90);
        Student s3 = new Student(3,"小c","女",21,65);
        Student s4 = new Student(4, "小d", "男", 18, 100);
        Student s5 = new Student(5, "小e", "男", 15, 85);
        int [] s = new int[5];
        s[0] = s1.getsJava();
        s[1] = s2.getsJava();
        s[2] = s3.getsJava();
        s[3] = s4.getsJava();
        s[4] = s5.getsJava();
        int sum = 0;
        int Max=s[1],Min=s[1];
        for (int i = 0; i < s.length; i++) {
            
            sum = sum+s[i];
            
            if (Max < s[i]) {
                Max = s[i];
            }
            if (Min >s[i]) {
                Min = s[i];
            }
        }
        System.out.println("java的平均成绩为"+sum/5);
        System.out.println("java成绩的最小值"+Min);
        System.out.println("java成绩的最大值"+Max);
        
    }

}

class Student{
    private int sNo;
    private String sName;
    private String sSex;
    private int sAge;
    private int sJava;
    
    public Student(int sNo, String sName, String sSex, int sAge, int sJava) {
        super();
        this.sNo = sNo;
        this.sName = sName;
        this.sSex = sSex;
        this.sAge = sAge;
        this.sJava = sJava;
    }

    public int getsNo() {
        return sNo;
    }

    public String getsName() {
        return sName;
    }

    public String getsSex() {
        return sSex;
    }

    public int getsAge() {
        return sAge;
    }

    public int getsJava() {
        return sJava;
    }

    @Override
    public String toString() {
        return "student [sNo=" + sNo + ", sName=" + sName + ", sSex=" + sSex + ", sAge=" + sAge + ", sJava=" + sJava
                + "]";
    }    
    
    
}

 