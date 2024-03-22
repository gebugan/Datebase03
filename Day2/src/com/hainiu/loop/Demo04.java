package com.hainiu.loop;

/**
 * @program: Text
 * @description:
 * @author: 小戈
 * @create: 2023-03-28 14:56
 */
public class Demo04 {
    public static void main(String[] args) {
        //计数器
        int count = 0;
        for (int i = 100; i <= 999; i++) {
            int ge = i % 10;
            int shi = i / 10 % 10;
            int bai = i / 100 % 10;
            if (ge * ge * ge + shi * shi * shi + bai * bai * bai == i) {
                System.out.println(i);

                count++;
            }
        }
        System.out.println(count + "个");
    }
}
