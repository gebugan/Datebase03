package hainiu.tcpdemo;

import sun.reflect.generics.scope.Scope;

import java.io.*;
import java.net.InetAddress;
import java.net.Socket;
import java.net.UnknownHostException;

/**
 * @program: Text
 * @description:
 * @author: 小戈
 * @create: 2023-04-07 15:05
 */
public class FileUploadClient {
    public static void main(String[] args) throws IOException {
        //创建输入流 指向文件数据源
        FileInputStream in = new FileInputStream("C:\\Users\\wo\\Desktop\\5555.png");


        //Socket对象
        Socket socket = new Socket(InetAddress.getByName("192.168.62.235"),10086);

        //传输数据
        OutputStream out = socket.getOutputStream();
        byte[] bytes = new byte[8192];
        int len;
        while ((len = in.read(bytes)) != -1){
            out.write(bytes,0,len);
            out.flush();
        }

        //数据传输完毕
        socket.shutdownOutput();

        //读取服务端的反馈
        BufferedReader reader = new BufferedReader(new InputStreamReader(socket.getInputStream()));
        String result = reader.readLine();
        System.out.println(result);

        //释放资源
        in.close();
        socket.close();



    }






























}
