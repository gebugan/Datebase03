package hainiu.practice;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

/**
 * @program: Text
 * @description:
 * @author: 小戈
 * @create: 2023-04-04 20:38
 */
public class Demo05 {
    public static void main(String[] args) throws IOException {
        //字符流读取数据
        FileReader fr = new FileReader("Day07-io\\aa.txt");

        char[] a = new char[8196];
        int len;
        while ((len = fr.read(a)) != -1){
            System.out.println(new String(a,0,len));
        }
        fr.close();

    }
}
