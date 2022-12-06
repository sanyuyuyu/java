class Test_20221206
{
    public static void main(String[] args)
    {
        StringBuffer stb1 = new StringBuffer("今天我在学习StringBuff");
		System.out.println("stb1的内容是: "+stb1);
		stb1.append("学习中阳光灿烂，我很开心");
		stb1.append("StringBuff类很简单");
		System.out.println("stb1追加后的内容是: "+stb1);
		stb1.insert(42, "我是阿里it221班学习小能手");
		System.out.println("stb1插入内容后是: "+stb1);
		stb1.delete(43, 58);
		System.out.println("stb1刪除后的内容是："+stb1);
		
		
		StringBuilder std1 = new StringBuilder("明天我也要学习StringBuff");
		System.out.println("std1的内容是: "+std1);
		std1.append("学习过程中我有信心一路顺风");
		System.out.println("std1追加後的内容是: "+std1);
		std1.insert(30,"我是云计算211班学习小能手");
		System.out.println("std1插入后的内容是: "+std1);
    }
}