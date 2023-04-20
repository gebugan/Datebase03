package hainiu.udpdemo;
import java.io.IOException;
import java.net.*;

/**
 * @program: Text
 * @description: 用UDP协议发送数据
 * @author: 小戈
 * @create: 2023-04-07 10:23
 */
public class Demo01_send {
    public static void main(String[] args) throws IOException {

        //创建发送端Socket对象,随机绑定一个端口号发出数据
        DatagramSocket socket = new DatagramSocket();

        //数据打包

        String data = "ikun02";
        byte[] bytes = data.getBytes();
        InetAddress address = InetAddress.getByName("192.168.62.245");//192.168.62.189
        int port = 10086;

        DatagramPacket packet = new DatagramPacket(bytes,bytes.length,address,port);

        //发送
        socket.send(packet);

        //释放资源
        socket.close();;


    }






















































}
