package hainiu.practice;

import java.io.File;

/**
 * @program: Text
 * @description:掌握File类的常用API
 *     练习时注意：测试文件夹，因为删除不走回收站。
 * @author: 小戈
 * @create: 2023-04-04 10:15
 */
public class Demo01 {
    public static void main(String[] args) {
        //public boolean mkdirs()创建由此抽象路径名命名的目录，包括任何必需但不存在的父目录
        File file = new File("Day07-io\\demo01.text");
        System.out.println(file.mkdirs());
        //删除
        //System.out.println(file.delete());

        // public boolean isDirectory()：测试此抽象路径名表示的File是否为目录
        // true
        System.out.println(file.isDirectory());
        //public boolean isFile()：测试此抽象路径名表示的File是否为文件
        // false
        System.out.println(file.isFile());
        // public boolean exists()：测试此抽象路径名表示的File是否存在
        // true
        System.out.println(file.exists());
        // public String getAbsolutePath()：返回此抽象路径名的绝对路径名字符串
        // F:\object01\student\text01\Day07-io\demo01.text
        System.out.println(file.getAbsolutePath());
        // public String getPath()：将此抽象路径名转换为路径名字符串
        // Day07-io\demo01.text
        System.out.println(file.getPath());
        // public String getName()：返回由此抽象路径名表示的文件或目录的名称
        // demo01.text
        System.out.println(file.getName());
        //public File[] listFiles()：返回此抽象路径名表示的目录中的文件和目录的File对象数组
        // [Ljava.io.File;@7f31245a
        System.out.println(file.listFiles());


    }


}
