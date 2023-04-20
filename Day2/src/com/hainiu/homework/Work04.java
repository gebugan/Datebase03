package com.hainiu.homework;

/**
 * @program: Text
 * @description:折纸超过珠峰
 * @author: 小戈
 * @create: 2023-03-28 19:33
 * 1.定义变量，折纸厚度0.1，珠穆朗玛峰8848
 * 2.对折纸定义折叠次数与山峰进行对比
 * 3.大于珠峰跳出循环输出次数
 */
public class Work04 {
    public static void main(String[] args) {
        double paper = 0.1;
        double mountain = 8848;

        int i = 0;
        //while 判断布尔型，比较大小，ture
        while (paper < mountain){
            //纸的厚度两倍在重新赋值纸的厚度
            paper = paper * 2;
            i += 1;
            System.out.println(paper);

            if (paper> mountain){
                System.out.println("次数为：" + i + "折叠后的高度：" + paper);
                break;
            }

        }


    }
}
