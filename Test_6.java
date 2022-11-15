class Test_6
{
    public static void main(String[] args)
    {
      Person person1 = new Person();
      person1.SetName("wnagfei");
      person1.SetAge(28);
      person1.getInfo();
      Stu student = new Stu();
      student.name = "zs";
      student.age = 19;
      student.num = "2022";
      student.school = "wz";
      student.classes = "2";
      student.getInfo();
       String new_name = "ls";
       int new_age = 28;
       String new_num = "27";
       String new_school = "wi";
       String new_classes = "wo";
       student.getandName(new_name,new_age,new_num,new_school,new_classes);
      student.getInfo();
      student.getandName(student.name,30,student.num,student.school,student.classes);
      student.getInfo();
    }
}


class Person
{
    public  String name;
    public  int age;

    public Person()
    {
    }

    public void SetName(String name)
    {
        this.name = name;        
    }

    public void SetAge(int age)
    {
        this.age = age;
    }

    public void getInfo()
    {
        System.out.println("姓名:"+name+"年龄:"+age);
    }
}

class Stu extends Person
{
    public  String num;
    public  String school;
    public  String classes;

    public Stu()
    {
        super();
    }

    // 可以一次性修改学生的任何属性
    public void getandName(String name,int age,String num,String school,String classes)
    {
        this.name = name;
        this.age = age;
        this.num = num;
        this.school = school;
        this.classes = classes;
    }


    // 
    public void getInfo()
    {
        System.out.println("姓名:"+this.name+"年龄:"+this.age+"学号： "+this.num+"学校："+school+"班级： "+this.classes);
    }
}


// class Pet
// {
//     private String name;


// }

// Pet pet = new Pet();
// pet. 
