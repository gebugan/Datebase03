package hainiu.practice;

import java.io.*;

/**
 * @program: Text
 * @description:
 * @author: 小戈
 * @create: 2023-04-04 21:12
 * - 构造方法
 *   | ObjectOutputStream(OutputStream out) | 创建一个写入指定的OutputStream的ObjectOutputStream |
 * - 序列化对象的方法
 *   | void writeObject(Object obj) | 将指定的对象写入ObjectOutputStream |
 */
public class Demo08 {
    public static void main(String[] args) throws IOException, ClassNotFoundException {

        ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream("Day07-io\\bos.txt"));

        Student st = new Student("张三",18,10086);

        //将创建的新对象写入oos
        oos.writeObject(st);
        //结果bos文件内非正常输出

        //反序列化还原
        ObjectInputStream ois = new ObjectInputStream(new FileInputStream("Day07-io\\bos.txt"));

        //获取ois中对象赋给Object中的obj
        Object obj = ois.readObject();

        //强转
        Student ss = (Student) obj;

        System.out.println(ss.getName() + "-" + ss.getAge() + "-" + ss.getId());



        oos.close();
        ois.close();


    }
}
