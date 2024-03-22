package com.hainiu.loop;

/**
 * @program: Text
 * @description:
 * @author: 小戈
 * @create: 2023-03-28 15:07
 */
public class Demo06 {
    /**珠穆朗玛峰
     *
     * 1.定义变量存储，山的高度，纸的厚度
     *
     */

    public static void main(String[] args) {
        double zf = 8844430;
        double paper = 0.1;
        //定义计数器
        int count = 0;
        //循环
        while (paper <= zf){
            paper = paper*2;
            System.out.println(paper);
            count++;
        }
        //打印循环次数
        System.out.println(count);
    }


}
