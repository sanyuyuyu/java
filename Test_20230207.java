import java.util.Arrays;

class Test_20230207
{
    public static void main(String[] args)
    {

        int x = 23;
        {
            int y = 24;
            System.out.println("x="+x);
            System.out.println("y="+y);
        
        }
        System.out.println("x is "+x);

        //使用ArrayList时，如果不定义泛型类型时，泛型类型实际上就是Object
        List list = new ArrayList();
        list.add("Hello");
        list.add("World");
        String first = (String) list.get(0);
        String second = (String) list.get(1);

        //当我们定义泛型类型<String>后，List<T>的泛型接口变为强类型List<String>
        List<String> list = new ArrayList<String>();
        list.add("Hello");
        list.add("World");
        String first = list.get(0);
        String second = list.get(1);

        //我们定义泛型类型<Number>后，List<T>的泛型接口变为强类型List<Number>
        List<Number> list = new ArrayList<Number>();
        list.add(new Integer(123));
        list.add(new Double(12.34));
        Number first = list.get(0);
        Number second = list.get(1);

        //编译器如果能自动推断出泛型类型，就可以省略后面的泛型类型
        List<Number> list = new ArrayList<Number>();

        // 可以省略后面的Number，编译器可以自动推断泛型类型：
        List<Number> list = new ArrayList<>();


        //泛街接口

        public interface Comparable<T> 
        {
        /*
            返回负数: 当前实例比参数o小
            返回0: 当前实例与参数o相等
            返回正数: 当前实例比参数o大
        */
            int compareTo(T o);
        }

        String[] ss = new String[] { "Orange", "Apple", "Pear" };
        Arrays.sort(ss);
        System.out.println(Arrays.toString(ss));

        Person[] ps = new Person[] 
        {
            new Person("Bob", 61),
            new Person("Alice", 88),
            new Person("Lily", 75),
        };
        Arrays.sort(ps);
        System.out.println(Arrays.toString(ps));

        Person[] ps = new Person[] 
        {
            new Person("Bob", 61),
            new Person("Alice", 88),
            new Person("Lily", 75),
        };
        Arrays.sort(ps);
        System.out.println(Arrays.toString(ps));    

    }
}

class Person
{
    public String name;
    public int score;
    Person(String name, int score) 
    {
        this.name = name;
        this.score = score;
    }

    public int compareTo(Person other) 
    {
        return this.name.compareTo(other.name);
    }

    public String toString() 
    {
        return this.name + "," + this.score;
    }
}
