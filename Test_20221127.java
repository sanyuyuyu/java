class Test_20221127
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

    public Employee(String name,String date) //
    {
        this.name = name;
        this.date = date;
    }

    public void setName(String name)
    {
        this.name = name;
    }

    public String getName()
    {
        return name;
    }

    public String getDate()
    {
        return date;
    }

    public void getSalary(int month)
    {
        this.month = month;
    }
}

class SalariedEmployee extends Employee
{
    private double salary;

    public SalariedEmployee()
    {

    }

    public void setSalary(String salary)
    {

    }

    public double getSalary()
    {
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
