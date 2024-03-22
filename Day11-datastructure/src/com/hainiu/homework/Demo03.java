package com.hainiu.homework;

import java.io.File;

/**
 * @program: Text
 * @description:统计一个文件夹大小的字节
 * @author: 小戈
 * @create: 2023-04-10 21:05
 */
public class Demo03 {
    public static void main(String[] args) {
        File file = new File("C:\\Users\\wo\\Desktop\\666");
        System.out.println(sweach(file));

    }

    public static long sweach(File dir){
        //如果文件表示的路径不存在
        if (!dir.exists()){
            return -1;
        }
        long c = 0;
        //文件
        File[] files = dir.listFiles();
        if (files != null){
            for (File file : files){
               //如果是文件，计算大小
                if (file.isFile()){
                    c = c + file.length();
                }else if (file.isDirectory()){
                    //如果是文件夹，递归
                    c = c + sweach(file);
                }
            }
        }

        return c;

    }

}
