import java.io.*;
class Test_20230226
{
    public static void main(String[] args) throws Exception
    {
        File file = new File("~/wss/java/Test_20230224");  //构造File对象，传入文件路径
        System.out.println(file);

        File f = new File("..");
        System.out.println(f.getPath()); //返回构造方法传入的路径
        System.out.println(f.getAbsolutePath()); //返回绝对路径
        //System.out.println(f.getCanonicalPath());
        System.out.println(file.isFile()); //判断File是否是一个已存在的文件
        System.out.println(file.isDirectory()); //判断该File对象是否是一个已存在的目录
        System.out.println(f.isFile());
        System.out.println(f.isDirectory());
        //构造一个File对象，即使传入的文件或者目录不存在，因为构造一个File对象不会导致任何磁盘操作

        if(file.createNewFile())
        {
            //文件创建成功
            if(file.delete())
            {
                //删除文件成功
            }
        }
      
        //createTempFile()创建一个临时文件
        File ff = File.createTempFile("tmp-",".txt"); //提供临时文件的前缀和后缀
        ff.deleteOnExit(); //JVM推出时自动删除
        System.out.println(ff.isFile());
        System.out.println(ff.getAbsolutePath());  

        File f1 = new File("~/wss/java/Test_20230224"); 
        File[] fs1 = f1.listFiles(); //列出所有问价和子目录
        printFiles(fs1);
        File[] fs2 = f1.listFiles(new FilenameFilter()
        {
            //仅列出.exe文件
            public boolean accept(File dir,String name)
            {
                return name.endsWith(".exe"); //返回true表示接受该文件
            }
        });
        printFiles(fs2);

    }

    static void printFiles(File[] files)
    {
        System.out.println("=========");
        if(files != null)
        {
            for(File f1: files)
            {
                System.out.println(f1);
            }
        }
        System.out.println("=========");
    }
}