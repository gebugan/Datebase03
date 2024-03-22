package hainiu.practice;

import java.io.*;

/**
 * @program: Text
 * @description:
 * @author: 小戈
 * @create: 2023-04-04 19:41
 */
public class Demo03 {
    public static void main(String[] args) throws IOException, InterruptedException {

        //字节流写数据
       FileOutputStream fos = new FileOutputStream("Day07-io\\bos.txt");

        fos.write("aa".getBytes());
        fos.write("bb".getBytes());
        fos.write("张三".getBytes());
        fos.write("dd".getBytes());
        fos.write("ee".getBytes());
        fos.write("\r\n".getBytes());

        System.out.println(fos.toString());
        for (int i = 0; i < 3; i++) {
            fos.write("hello".getBytes());
            fos.write("\r\n".getBytes());
        }

        fos.close();

    }

}
