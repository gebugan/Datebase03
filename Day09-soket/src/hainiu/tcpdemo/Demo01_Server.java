package hainiu.tcpdemo;

import java.io.IOException;
import java.io.InputStream;
import java.net.ServerSocket;
import java.net.Socket;

/**
 * @program: Text
 * @description:
 * @author: 小戈
 * @create: 2023-04-07 11:40
 */
public class Demo01_Server {
    public static void main(String[] args) throws IOException {

        //创建服务的Soket对象
        int port = 12345;
        ServerSocket serverSocket = new ServerSocket(port);
        //接受请求
        Socket socket = serverSocket.accept();

        //获取输入流读取数据
        InputStream in = socket.getInputStream();//阻塞socket
        byte[] bytes = new byte[1024];
        int len =in.read(bytes);//阻塞read
        String s =new String(bytes,0,len);
        String ip = socket.getInetAddress().getHostAddress();
        System.out.println(ip + "说" +s);

        //释放资源
        in.close();
        socket.close();
        serverSocket.close();


    }








































}
