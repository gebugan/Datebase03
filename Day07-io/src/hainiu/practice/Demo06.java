package hainiu.practice;

import java.io.*;

/**
 * @program: Text
 * @description:
 * @author: 小戈
 * @create: 2023-04-04 20:43
 */
public class Demo06 {
    public static void main(String[] args) throws IOException {
        /**
         * 3、知道为什么使用字符流
         *     查看文本不乱码
         *     掌握缓冲字符流读取一行数据的方法
         *     掌握缓冲字符流写出字符串和换行符的方法
         *     构造方法：
         * | 方法名                                 | 说明                   |
         * | -------------------------------------- | ---------------------- |
         * | BufferedOutputStream(OutputStream out) | 创建字节缓冲输出流对象 |
         * | BufferedInputStream(InputStream in)    | 创建字节缓冲输入流对象 |
         */
        //字符流缓冲区写入数据
        BufferedWriter bw = new BufferedWriter(new FileWriter("Day07-io\\aa.txt"));

        bw.write("我是缓冲区的字符串");
//
//        BufferedReader br = new BufferedReader(new FileReader("Day07-io\\aa.txt"));
//
//        System.out.println(br.read());


        bw.close();
       // br.close();
    }
}
