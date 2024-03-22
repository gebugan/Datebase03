package hainiu.udpdemo;

import sun.security.x509.IPAddressName;

import java.io.IOException;
import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.SocketException;
import java.util.Scanner;

/**
 * @program: Text
 * @description:
 * @author: 小戈
 * @create: 2023-04-07 10:38
 */
public class Demo02_jieshou {
    public static void main(String[] args) throws IOException {
        int port = 10086;
        //创建接收端socket对象
        DatagramSocket socket = new DatagramSocket(port);


        //打包接收
        byte[] bytes = new byte[1024];
        DatagramPacket packet = new DatagramPacket(bytes,bytes.length);

        while (true) {
            String arr = "192.168.62.245";

            //接受
            socket.receive(packet);

            //解析包裹
            int len = packet.getLength();//有效数据长度
            //转换字符
            String s = new String(bytes,0,len);
            String ip = packet.getAddress().getHostAddress();
            if (arr.equals(ip)){
                System.out.println(ip + "已将噶了");
                break;
            }
            System.out.println(ip + "说" + s);
        }

        //释放资源
        //socket.close();


    }






























}
