package hainiu.practice;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Properties;

/**
 * @program: Text
 * @description:
 * @author: 小戈
 * @create: 2023-04-04 22:11
 */
public class Demo10 {
    public static void main(String[] args) throws IOException {
        // Properties可以保存到流中或从流中加载。

//        // 流指向文件
//        FileInputStream fis = new FileInputStream("Day07-io\\prop.properties");
//        // 集合
//        Properties prop1 = new Properties();
//        // 从流中加载到集合中
//        prop1.load(fis);
//        fis.close();
//        prop1.forEach((k, v) -> System.out.println(k + "=" + v));


        // 从集合保存到流中
        Properties prop = new Properties();
        prop.setProperty("username", "root");
        prop.setProperty("password", "123456");
        prop.setProperty("url", "www.hainiu.com");

        // 流
        FileOutputStream out = new FileOutputStream("Day07-io\\prop2.properties");
        prop.store(out, "this is mysql resources message");

        out.close();

    }
}
