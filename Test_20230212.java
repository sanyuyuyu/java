class Test_20230212
{
    public static void main(String[] args)
    {
        int plan1 = 8888 - 1880;
        double plan2 = 8888 * 0.75;
        if(plan1 > plan2)
        {
            System.out.println("使用以旧换新");
    
        }
        else
        {
            System.out.println("不使用");
        }

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
        int Max = s[1], Min = s[1];
        for(int i = 0; i < s.length; i++)
        {
            sum = sum + s[i];
            if(Max <s[i])
            {
                Max = s[i];
            }
            if(Min > s[i])
            {
                Min = s[i];
            }
        }

        System.out.println(sum/5);
        System.out.println(Min);
        System.out.println(Max);

    }
}

class Student
{
    public int sNo;
    public String sName;
    public String sSex;
    public int sAge;
    public int sJava;
 
   public Student(int sNo,String sName, String sSex,int sAge,int sJava)
   {
        this.sNo = sNo;
        this.sName = sName;
        this.sSex = sSex;
        this.sAge = sAge;
        this.sJava = sJava;
   }



/*
    public void setNo(int sNo)
    {
        this.sNo = sNo;
    }

    public void setname(String sName)
    {
        this.sName = sName;
    }

    public void setSex(String sSex)
    {
        this.sSex = sSex;
    }

    public void setAge(int sAge)
    {
        this.sAge = sAge;
    }

    public void setJava(double sJava)
    {
        this.sJava = sJava;
    }
*/
    public int getNo()
    {
        return sNo;
    }

    public String getName()
    {
        return sName;
    }

    public int getAge()
    {
        return sAge;
    }

    public int getsJava()
    {
        return sJava;
    }

   public String toString() 
   {
        return "student [sNo=" + sNo + ", sName=" + sName + ", sSex=" + sSex + ", sAge=" + sAge + ", sJava=" + sJava
        + "]";
    } 
}