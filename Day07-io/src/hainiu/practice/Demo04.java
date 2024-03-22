package hainiu.practice;

import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

/**
 * @program: Text
 * @description:
 * @author: 小戈
 * @create: 2023-04-04 20:17
 */
public class Demo04 {

    //字符流写入数据
    public static void main(String[] args) throws IOException {

        FileWriter fw = new FileWriter("Day07-io\\aa.txt");
        //写入字符串
        fw.write("我是一个字符串");

        fw.close();

    }

}
