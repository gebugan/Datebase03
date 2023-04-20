package hainiu.practice;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

/**
 * @program: Text
 * @description:
 * @author: 小戈
 * @create: 2023-04-04 16:34
 */
public class Demo02 {

    public static void main(String[] args) {
        /**
         * - 字节流抽象基类
         *   - InputStream：这个抽象类是表示字节输入流的所有类的超类
         *   - OutputStream：这个抽象类是表示字节输出流的所有类的超类
         *   - 子类名特点：子类名称都是以其父类名作为子类名的后缀
         * - 字节输出流
         *   - FileOutputStream(String name)：创建文件输出流以指定的名称写入文件
         */

        try ( FileInputStream fis = new FileInputStream("C:\\Users\\wo\\Desktop\\001.png");
              FileOutputStream fos = new FileOutputStream("Day07-io\\002.png");
              ){
            //定义字节数组
            byte[] buffer = new byte[8192];
            int len;

            while ((len = fis.read(buffer)) != -1){
                fos.write(buffer,0,len);
            }
        } catch (IOException e) {
            e.printStackTrace();
        }

    }

}
