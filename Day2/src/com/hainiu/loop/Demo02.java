package com.hainiu.loop;

/**
 * @program: Text
 * @description:
 * @author: 小戈
 * @create: 2023-03-28 14:43
 */
public class Demo02 {
    public static void main(String[] args) {
        int sum = 0;
        for (int i = 1; i <= 100;i++){

            //判断
            if (i%2 == 0){
                //偶数判断叠加
                sum += i;
            }
        }
        System.out.println(sum);






    }
}
