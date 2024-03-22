package com.hainiu.homework;

/**
 * @program: Text
 * @description:水仙花数案例
 * @author: 小戈
 * @create: 2023-03-28 19:33
 * 1.水仙花数 个位数*个位数*个位数+十位数*十位数*十位数+百位数*百位数*百位数=百十个
 * 2.100-999数字，显示水仙花数，显示个数
 * 3.百位数获取/100；十位数获取/10%10；个位数获取%10
 */
public class Work03 {
    public static void main(String[] args) {
        int count = 0;
        for (int i = 100; i <= 999; i++) {
            int bai = i / 100 ;
            int shi = i / 10 % 10;
            int ge  = i % 10;
            if (bai * bai * bai + shi * shi * shi + ge * ge * ge == i){
                System.out.println(i);
                count ++;
            }

        }
        System.out.println(count + "个");
    }
}
