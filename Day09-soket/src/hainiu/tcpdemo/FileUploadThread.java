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
 * @create: 2023-04-07 16:16
 */
public class FileUploadThread implements Runnable{

    private final Socket socket;

    public FileUploadThread(Socket socket) {
        this.socket = socket;
    }
    @Override
    public void run(){

        FileOutputStream out = null;
        try {
            InputStream in = socket.getInputStream();
            String name = UUID.randomUUID().toString().replaceAll("-", "");
            out = new FileOutputStream("C:\\Users\\wo\\Desktop\\666\\" + name + ".png");
            byte[] bytes = new byte[8192];
            int len;
            while ((len = in.read(bytes)) != -1) {
                out.write(bytes, 0, len);


            }
            BufferedWriter writer = new BufferedWriter(new OutputStreamWriter(socket.getOutputStream()));
            writer.write("文件上传成功");

            writer.newLine();
            writer.flush();


        } catch (IOException e) {
            e.printStackTrace();
        }finally {
            if (out != null) {
                //释放资源
                try {
                    out.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
                try {
                    socket.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
        }


    }



























}
