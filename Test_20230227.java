import java.io.*;
import java.nio.file.*;
import java.io.File;
import java.io.IOException;

class Test_20230227
{
    public static void main(String[] args) throws IOException
    {
        Path p1 = Paths.get(".","project","study"); //构造一个Path对象
        System.out.println(p1);
        Path p2 = p1.toAbsolutePath(); //转换为绝对路径
        System.out.println(p2);
        Path p3 = p2.normalize(); //转换为规范路径
        System.out.println(p3);
        File f = p3.toFile(); //转换为File对象
        System.out.println(f);
        for(Path p : Paths.get("..").toAbsolutePath())
        {
            //直接遍历Path
            System.out.println(" "+p);
        }

        File currentDir = new File("./Documents"); //所有文件手动创建载本地目录
        System.out.println("Documents/");
        listDir(currentDir.getCanonicalFile());

    }

     static int depth = 1;
	static void listDir(File dir) {
		// TODO: 递归打印所有文件和子文件夹的内容
		File[] fs = dir.listFiles();
		String blank = "  ";
		blank = blank.repeat(depth);
		if (fs != null) 
        {
			for (File f : fs)
            {
				if (f.isDirectory()) 
                {
					System.out.println(blank + f.getName() + "/");
					depth ++;
					listDir(f);
					depth --;
				}
				if (f.isFile()) 
                {
					System.out.println(blank + f.getName());
				}
			}
		}
	}
}