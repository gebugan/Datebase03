package hainiu.tcpdemo;

import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.InetAddress;
import java.net.Socket;

/**
 * @program: Text
 * @description:
 * @author: 小戈
 * @create: 2023-04-07 11:33
 */
public class Demo02_Client {

    public static void main(String[] args) throws IOException {
        //创建发送端socket对象 参数：需要连接的Ip和端口号
        InetAddress ip = InetAddress.getByName("192.168.62.189");//192.168.62.189
        int port = 12345;
        Socket socket = new Socket(ip,port);

        //发送数据  获取输出流
        OutputStream out = socket.getOutputStream();
        //使用输出流写出输出流
        byte[] bytes = "hello tcp 我不来了".getBytes();
        out.write(bytes);

        //获取输入流读取服务器反馈
        InputStream in = socket.getInputStream();
        byte[] data = new byte[1024];
        int len = in.read(data);
        String s = new String(bytes,0,len);
        System.out.println(s);




        //释放资源
       // out.close();
        socket.close();


    }

































}
