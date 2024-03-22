package hainiu.tcpdemo;

import java.io.*;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.UUID;
import java.util.concurrent.ArrayBlockingQueue;
import java.util.concurrent.Executors;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

/**
 * @program: Text
 * @description:
 * @author: 小戈
 * @create: 2023-04-07 14:57
 */
public class FileUploadSever {
    public static void main(String[] args) throws IOException {
        ServerSocket serverSocket = new ServerSocket(10086);
        //线程池
        ThreadPoolExecutor pool = new ThreadPoolExecutor(3,
                8,
                60,
                TimeUnit.SECONDS,
                new ArrayBlockingQueue<>(5),
                Executors.defaultThreadFactory(),
                new ThreadPoolExecutor.AbortPolicy());



        while (true) {
            //接受请求建立连接
            Socket socket = serverSocket.accept();
            //建立一个连接就开启一条线程来传输数据
            pool.submit(new FileUploadThread(socket));
        }

//            Socket socket = serverSocket.accept();
//
//            InputStream in = socket.getInputStream();
//            String name = UUID.randomUUID().toString().replaceAll("-", "");
//            FileOutputStream out = new FileOutputStream("C:\\Users\\wo\\Desktop\\666\\" + name + ".png");
//            byte[] bytes = new byte[8192];
//            int len;
//            while ((len = in.read(bytes)) != -1) {
//                out.write(bytes, 0, len);
//
//
//            }
//            BufferedWriter writer = new BufferedWriter(new OutputStreamWriter(socket.getOutputStream()));
//            writer.write("文件上传成功");
//
//            writer.newLine();
//            writer.flush();
//
//        //释放资源
//        in.close();
//        socket.close();
//        serverSocket.close();

    }























































}
