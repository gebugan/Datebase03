package hainiu.practice;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

/**
 * @program: Text
 * @description:
 * @author: 小戈
 * @create: 2023-04-04 20:53
 */
public class Demo07 {
    public static void main(String[] args) throws IOException {
        //字符缓冲区读取数据
        BufferedReader br = new BufferedReader(new FileReader("Day07-io\\aa.txt"));

        char[] arr = new char[1024];
        int mun = 0;
        while ((mun = br.read(arr)) != -1){
            System.out.println(new String(arr,0,mun));
        }
       // System.out.println(br.read());

        br.close();

    }
}
