public class Test_20230222
{
    public static void main(String[] args)
    {
        Student stu1 = new Student("1","lili","nan",19,232);
        Student stu2 = new Student("2","nana","nv",23,231);
        stu1.run();
        stu2.run();
        int average = (stu1.getJava()+stu2.getJava())/2;
     //   System.out.println(average+getMax(arr)+getMin(arr));
        int[] arr = {stu1.getJava(),stu2.getJava()};
        System.out.println(average+getMax(arr)+getMin(arr));

    }

    public static int getMax(int[] arr)
    {
        int max = arr[0];
        for(int i = 1;i<arr.length;i++)
        {
            if(arr[i]>max)
            {
                max = arr[i];
            }
        }
        return max;
    }
    public static int getMin(int[] arr)
    {

        int min = arr[0];
        for(int i = 1;i < arr.length;i++)
        {
            if(arr[i]<min)
            {
                min = arr[i];
            }
        }
        return min;

    }



}

class Student 
{
    private String name;
    private String sex;
    private String num;
    private int age;
    private int java;

    public Student(String name,String sex,String num,int age,int java)
    {
        this.name = name;
        this.sex = sex;
        this.num = num;
        this.age = age;
        this.java = java;
    }

    public String getName()
    {
        return name;
    }

    public String getSex()
    {
        return sex;
    }

    public String getNum()
    {
        return num;
    }

    public int getAge()
    {
        return age;
    }

    public int getJava()
    {
        return java;
    }

    public void run()
    {
        System.out.println(this.name+this.sex+this.num+this.age+this.java);
    }
}