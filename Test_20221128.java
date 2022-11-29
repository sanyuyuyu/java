class Test_20221128
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        int a;
        Employee[] employee;
        employee = new Employee[100];
        employee[0]=new SalariedEmployee("张三", 1, 6000);
        employee[1]=new HourlyEmployee("李四", 2, 50, 180);
        employee[2]=new SalesEmployee("王五", 3, 6500, 0.15);
        employee[3]=new BasePlusSalesEmployee("赵六", 4, 5000, 0.15, 2000);
        employee[4]=new BasePlusSalesEmployee("qz",5,6000,0.1,3000);

        System.out.println("--------------欢迎来到员工管理系统---------------");
        System.out.println("1.办理员工入职");
        System.out.println("2.辞退员工");
        System.out.println("3.修改员工信息");
        System.out.println("4.查询员工信息");
        System.out.println("0.退出");
        System.out.println("-----------------------------");
        System.out.println("请选择您想办理的业务");

        while(true){
            a = sc.nextInt();
            switch(a){
                case 1:
                    addEmployee(employee);
                    break;
                case 2:
                    deleteEmployee(employee);
                    break;
                case 3:
                    updateEmployee(employee);
                    break;
                case 4:
                    searchEmployee(employee);
                    break;
                case 0:
                    System.exit(0);
                    break;
                default:
                    System.out.println("您的输入有误，请重新输入！");
                    break;
            }
        }

    }
    private static void searchEmployee(Employee[] employee){
        int i,m,k;
        for(k=0;k<employee.length;k++){
            if(employee[k]!=null)
                System.out.println(employee[k].getName());
        }
        System.out.println("请输入您想要查询的员工的姓名");
        Scanner sc=new Scanner(System.in);
        String name=sc.next();
        for(i=0;i<employee.length;i++){
            if(name.equals(employee[i].getName())){
                System.out.println("姓名："+employee[i].getName()+"\n出生月份:"+employee[i].getMonth());
                System.out.println("请随机输入一个月份：");
                m=sc.nextInt();
                System.out.println(employee[i].getName()+"在"+m+"月的工资为："+employee[i].getSalary(m));
                break;
            }else{
                if(i==employee.length){
                    System.out.println("查无此人");
                    break;
                }else{
                    continue;
                }
            }
        }
        show();
    }
    private static void deleteEmployee(Employee[] employee){
        int k;
        for(k=0;k<employee.length;k++){
            if(employee[k]!=null)
                System.out.println(employee[k].getName());
        }
        System.out.println("请输入您想要辞退的员工的姓名");
        Scanner sc=new Scanner(System.in);
        String name=sc.next();
        int i;
        for(i=0;i<employee.length;i++){
            if(name.equals(employee[i].getName())){
                break;
            }
        }
        for(int j=i;j<employee.length-1;j++){
            employee[j]=employee[j+1];
        }
        show();
    }
    private static void addEmployee(Employee[] employee){
        Scanner sc=new Scanner(System.in);
        int n,month;
        String name;
        System.out.println("请选择员工类型：");
        System.out.println("1) 拿固定工资的员工\n2) 按小时拿工资的员工\n3) 销售人员\n4) 有固定底薪的销售人员\n0) 退出");
        int flag=1;
        int i;
        for(i=0;i<employee.length;i++){
            if(employee[i]==null){
                break;
            }
        }
        while(flag==1){
            n=sc.nextInt();
            switch (n){
                case 1:

                    double monthSalary;
                    employee[i]=new SalariedEmployee();
                    SalariedEmployee se=(SalariedEmployee)employee[i];
                    System.out.println("请输入员工姓名");
                    name=sc.next();
                    System.out.println("出生月份");
                    month=sc.nextInt();
                    System.out.println("月薪");
                    monthSalary=sc.nextDouble();
                    se.setName(name);
                    se.setMonth(month);
                    se.setMonthSalary(monthSalary);
                    System.out.println("新入职员工姓名："+name+"\n出生月份："+month+"\n月薪："+monthSalary);
                    System.out.println("--------------------------=");
                    System.out.println("若还要添加，请选择：\n否则摁0退出\n1) 拿固定工资的员工\n2) 按小时拿工资的员工\n3) 销售人员\n4) 有固定底薪的销售人员\n0) 退出");
                    break;
                case 2:
                    double hourSalary;
                    int hours;
                    System.out.println("请输入员工姓名");
                    name=sc.next();
                    System.out.println("出生月份");
                    month=sc.nextInt();
                    System.out.println("时薪");
                    hourSalary=sc.nextDouble();
                    System.out.println("每月工作小时数");
                    hours=sc.nextInt();
                    employee[i]=new HourlyEmployee(name,month,hourSalary,hours);
                    HourlyEmployee he = (HourlyEmployee)employee[i];
                    System.out.println("新入职员工姓名："+name+"\n出生月份："+month+"\n时薪："+hourSalary+"\n每月工作小时数："+hours);
                    System.out.println("--------------------------=");
                    System.out.println("若还要添加，请选择：\n否则摁0退出\n1) 拿固定工资的员工\n2) 按小时拿工资的员工\n3) 销售人员\n4) 有固定底薪的销售人员\n0) 退出");
                    break;
                case 3:
                    double monthlySales;
                    double rate;
                    System.out.println("请输入员工姓名");
                    name=sc.next();
                    System.out.println("出生月份");
                    month=sc.nextInt();
                    System.out.println("月销售额");
                    monthlySales=sc.nextDouble();
                    System.out.println("提成率");
                    rate=sc.nextDouble();
                    employee[i]=new SalesEmployee(name,month,monthlySales,rate);
                    SalesEmployee see=(SalesEmployee)employee[i];
                    System.out.println("新入职员工姓名："+name+"\n出生月份："+month+"\n月销售额："+monthlySales+"\n提成率："+rate);
                    System.out.println("--------------------------=");
                    System.out.println("若还要添加，请选择：\n否则摁0退出\n1) 拿固定工资的员工\n2) 按小时拿工资的员工\n3) 销售人员\n4) 有固定底薪的销售人员\n0) 退出");
                    break;
                case 4:
                    double basePay;
                    double monthlyS;
                    double royalty;
                    System.out.println("请输入员工姓名");
                    name=sc.next();
                    System.out.println("出生月份");
                    month=sc.nextInt();
                    System.out.println("月销售额");
                    monthlyS=sc.nextDouble();
                    System.out.println("提成率");
                    royalty=sc.nextDouble();
                    System.out.println("底薪");
                    basePay=sc.nextDouble();
                    employee[i]=new BasePlusSalesEmployee(name,month,monthlyS,royalty,basePay);
                    BasePlusSalesEmployee bpse=(BasePlusSalesEmployee)employee[i];
                    System.out.println("新入职员工姓名："+name+"\n出生月份："+month+"\n月销售额："+monthlyS+"\n提成率："+royalty+"\n底薪："+basePay);
                    System.out.println("----------------------------");
                    System.out.println("若还要添加，请选择：\n否则摁0退出\n1) 拿固定工资的员工\n2) 按小时拿工资的员工\n3) 销售人员\n4) 有固定底薪的销售人员\n0) 退出");
                    break;
                case 0:
                    flag=0;
                    continue;
                default:
                    System.out.println("没有此选项，请重新输入！");
                    break;
            }
        }
        show();
    }
    private static void updateEmployee(Employee[] employee){
        int k,i,n,flag;
        String name;
        Scanner sc=new Scanner(System.in);
        System.out.println("员工名单：");
        for(k=0;k<employee.length;k++){
            if(employee[k]!=null)
                System.out.println(employee[k].getName());
        }
        System.out.println("请输入你想要操作的员工姓名");
        name=sc.next();
        //1.根据名字找到员工
        for(i=0;i<employee.length;i++){
            if(name.equals(employee[i].getName())){
                break;
            }
        }
        //2.确定员工类型并打印员工信息,,,3.选择并更改员工信息，不同员工所要更改的信息不同
        if(employee[i] instanceof SalariedEmployee){
            double tempMonthSalary;
            SalariedEmployee se=(SalariedEmployee)employee[i];
            System.out.println("-------------------------");
            System.out.println("员工姓名："+se.getName()+"\n出生月份："+se.getMonth()+"\n月薪："+se.getMonthSalary());
            System.out.println("-------------------------");
            System.out.println("请输入更改后的月薪：");
            tempMonthSalary=sc.nextDouble();
            se.setMonthSalary(tempMonthSalary);
            System.out.println("更改后员工信息：");
            System.out.println("员工姓名："+se.getName()+"\n出生月份："+se.getMonth()+"\n月薪："+se.getMonthSalary());
            show();
        }else if(employee[i] instanceof HourlyEmployee){
            double tempHourSalary;
            int tempHours;
            HourlyEmployee he=(HourlyEmployee)employee[i];
            System.out.println("-------------------------");
            System.out.println("员工姓名："+he.getName()+"\n出生月份："+he.getMonth()+"\n时薪："+he.getHourSalary()+"\n每月工作小时数："+he.getHours());
            System.out.println("-------------------------");
            flag=1;
            while(flag==1){
                System.out.println("请选择您想要更改的信息：\n1.时薪\n2.每月工作小时数\n0.退出");
                n=sc.nextInt();
                switch(n){
                    case 1:
                        System.out.println("请输入更改后的时薪：");
                        tempHourSalary=sc.nextDouble();
                        he.setHourSalary(tempHourSalary);
                        System.out.println("更改后员工信息：");
                        System.out.println("员工姓名："+he.getName()+"\n出生月份："+he.getMonth()+"\n时薪："+he.getHourSalary()+"\n每月工作小时数："+he.getHours());
                        System.out.println("-------------");
                        break;
                    case 2:
                        System.out.println("请输入更改后的每月工作小时数：");
                        tempHours=sc.nextInt();
                        he.setHours(tempHours);
                        System.out.println("更改后员工信息：");
                        System.out.println("员工姓名："+he.getName()+"\n出生月份："+he.getMonth()+"\n时薪："+he.getHourSalary()+"\n每月工作小时数："+he.getHours());
                        System.out.println("-------------");
                        break;
                    case 0:
                        flag=0;
                        break;
                    default:
                        System.out.println("抱歉，您的输入有误，请重新输入");
                        break;

                }
            }
            show();
        }else if(employee[i] instanceof SalesEmployee){
            //因为BasePlusSalesEmployee extends SalesEmployee,所以要再判断一下
            if(employee[i] instanceof BasePlusSalesEmployee){
                double tempRate,tempBasePay;
                BasePlusSalesEmployee bpse=(BasePlusSalesEmployee)employee[i];
                System.out.println("-------------------------");
                System.out.println("员工姓名："+bpse.getName()+"\n出生月份："+bpse.getMonth()+"\n月销售额："+bpse.getMonthlySales()+"\n提成率："+bpse.getRate()+"\n底薪："+bpse.getBasePay());
                System.out.println("-------------------------");
                flag=1;
                while(flag==1){
                    System.out.println("请选择您想要更改的信息:\n1. 提成率\n2. 底薪\n0. 退出");
                    n=sc.nextInt();
                    switch(n){
                        case 1:
                            System.out.println("请输入更改后的提成率：");
                            tempRate=sc.nextDouble();
                            bpse.setRate(tempRate);
                            System.out.println("更改后员工信息：");
                            System.out.println("员工姓名："+bpse.getName()+"\n出生月份："+bpse.getMonth()+"\n月销售额："+bpse.getMonthlySales()+"\n提成率："+bpse.getRate()+"\n底薪："+bpse.getBasePay());
                            System.out.println("-------------");
                            break;
                        case 2:
                            System.out.println("请输入更改后的底薪：");
                            tempBasePay=sc.nextInt();
                            bpse.setBasePay(tempBasePay);
                            System.out.println("更改后员工信息：");
                            System.out.println("员工姓名："+bpse.getName()+"\n出生月份："+bpse.getMonth()+"\n月销售额："+bpse.getMonthlySales()+"\n提成率："+bpse.getRate()+"\n底薪："+bpse.getBasePay());
                            System.out.println("-------------");
                            break;
                        case 0:
                            flag=0;
                            break;
                        default:
                            System.out.println("抱歉，您的输入有误，请重新输入");

                    }
                }
                show();
            }else{
                double tempRate;
                SalesEmployee se=(SalesEmployee)employee[i];
                System.out.println("-------------------------");
                System.out.println("员工姓名："+se.getName()+"\n出生月份："+se.getMonth()+"\n月销售额："+se.getMonthlySales()+"\n提成率："+se.getRate());
                System.out.println("-------------------------");
                System.out.println("请输入更改后的提成率：");
                tempRate=sc.nextDouble();
                se.setRate(tempRate);
                System.out.println("更改后员工信息：");
                System.out.println("员工姓名："+se.getName()+"\n出生月份："+se.getMonth()+"\n月销售额："+se.getMonthlySales()+"\n提成率："+se.getRate());
                show();
            }

        }
    }
    private static void show(){
        System.out.println("                               ");
        System.out.println("                               ");
        System.out.println("-----------------------------");
        System.out.println("1.办理员工入职");
        System.out.println("2.辞退员工");
        System.out.println("3.修改员工信息");
        System.out.println("4.查询员工信息");
        System.out.println("0.退出");
        System.out.println("-----------------------------");
        System.out.println("请选择您想办理的业务");
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
    private double royaltyrate;  //定义提成率的参数

    public SalesEmployee()
    {

    }

    public SalesEmployee(String name, int month,double monthsalesvolumes,double royaltyrate)
    {
        super(name,month);
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

    public void setRoyaltyrate(double royaltyrate)
    {
        this.royaltyrate = royaltyrate;
    }

    public double getRoyaltyrate()
    {
        return royaltyrate;
    }

    public double getSalary(int month)
    {
        return this.getMonthsalesvolumes()*(1+this.getRoyaltyrate())+super.getSalary(month);
    }
}

class BasePlusSalesEmployee extends SalesEmployee
{
    private double basesalary;

    public BasePlusSalesEmployee()
    {

    }

    public  BasePlusSalesEmployee(String name, int month, double monthsalesvolumes,double royaltyrate,double basesalary)
    {
        super(name,month,monthsalesvolumes,royaltyrate);
        this.basesalary = basesalary;
    }

    public void setBasesalary(double basesalary)
    {
        this.basesalary = basesalary;
    }

    public double getBasesalary()
    {
        return basesalary;
    }

    public double getSalary(int month)
    {
        return basesalary + super.getSalary(month);
    }
}
