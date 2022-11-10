class Test_20221110
{
    public static void main(String[] args)
    {
        Stu myself = new Stu();
        myself.name = "wss";
        myself.age = 18;
        myself.male = "women";
        myself.num = 20220118133l;
        myself.getInfo();
    }
    class Stu
    {
        public String name; //def
        public int age;
        public String male;
        public long num;
        


        public void setName(String outName)
        {
            name = outName;
        }

        public void setAge(int outAge)
        {
            age = outAge;
        }

        public void setMale(String outMale)
        {
            male = outMale;
        }

        public String getName()
        {
            return name;
        }

        public int getAge()
        {
            return age;
        }

        public String getMale()
        {
            return male;
        }

        public void getInfo()
        {
            System.out.println("姓名"+name+"年龄"+age+"性别"+male);
        }


    }
}