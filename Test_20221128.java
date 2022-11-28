class Test_20221128
{
    public static void main(String[] args)
    {

    }
}

class Employee //定义一个Employee的父类
{
    private String name;  //定义name参数
    private int month;  //定义date参数

    public Employee() //构造Employee的无参方法
    {

    }

    public Employee(String name,int month) //
    {
        this.name = name;
        this.month = month;
    }

    public void setName(String name)
    {
        this.name = name;
    }

    public String getName()
    {
        return name;
    }

    public void setMonth(int month)
    {
        this.month = month;
    }

    public int getMonth()
    {
        return month;
    }

    public double  getSalary(int month)
    {
        double salary = 0;
        if(this.month == month)
        {
            salary = salary + 100;
        }
        return salary;
    }
}

class SalariedEmployee extends Employee
{
    private double monthsalary;

    public SalariedEmployee()
    {

    }

    public SalariedEmployee(String name,int month,double monthsalary)
    {
        super(name,month);
        this.monthsalary = monthsalary;
    }

    public void setSalary(double monthsalary)
    {
        this.monthsalary = monthsalary;
    }

    public double getSalary()
    {
        return monthsalary;
    }

    public double getSalary(int month)
    {
       double salary = monthsalary+super.getSalary(month);
       return salary;
        
    }
    
}

class HourlyEmployee extends Employee
{
    private double hoursalary;
    private double hourmonth;

    public HourlyEmployee()
    {

    }

    public HourlyEmployee(String name,int month,double months,double hoursalary,double hourmonth)
    {
        super(name,month);
        this.hoursalary = hoursalary;
        this.hourmonth = hourmonth;
    }

    public HourlyEmployee(double hoursalary,double hourmonth)
    {
        this.hoursalary = hoursalary;
        this.hourmonth = hourmonth;
    }

    public void setHoursalary(double hoursalary)
    {
        this.hoursalary = hoursalary;
    }

    public double getHoursarlary()
    {
        return hoursalary;
    }

    public void setHourmonth(double hourmonth)
    {
        this.hourmonth = hourmonth;
    }

    public double getHourmonth()
    {
        return hourmonth;
    }

    public double getSalary(int month)
    {
        if(hourmonth<0)
        {
            System.out.println("无月薪");
            return 0;
        }
        else if(hourmonth<=160)
             return hoursalary*hourmonth + super.getSalary(month); //每月小于160小时的按每月工作的小时数乘以每小时的工资
        else return hoursalary*160 + hoursalary*1.5*(hourmonth-160) + super.getSalary(month); //超出160小时的部分按照1.5 倍工资发放。
    }

}

class SalesEmployee extends Employee
{
    private double monthsalesvolumes; //定义月销额的参数
    private String royaltyrate;  //定义提成率的参数

    public SalesEmployee()
    {

    }

    public SalesEmployee(double monthsalesvolumes,String royaltyrate)
    {
        this.monthsalesvolumes = monthsalesvolumes;
        this.royaltyrate = royaltyrate;
    }

    public void setMontnsalesvolumes(double monthsalesvolumes)
    {
        this.monthsalesvolumes = monthsalesvolumes;
    }

    public double getMonthsalesvolumes()
    {
        return monthsalesvolumes;
    }

    public void setRoyaltyrate(String royaltyrate)
    {
        this.royaltyrate = royaltyrate;
    }

    public String getRoyaltyrate()
    {
        return royaltyrate;
    }
}

class BasePlusSalesEmployee extends SalesEmployee
{
    private double basesalary;

    public BasePlusSalesEmployee()
    {

    }

    public void setBasesalary(double basesalary)
    {
        this.basesalary = basesalary;
    }

    public double getBasesalary()
    {
        return basesalary;
    }
}
