package com.hainiu.homework;

/**
 * @program: Text
 * @description:斐波那契数列---小兔子问题
 * @author: 小戈
 * @create: 2023-04-10 20:52
 */
public class Demo {
    public static void main(String[] args) {
        System.out.println(fb(15));
    }

    public static int fb(int n ){
        //前两个兔子已知
        if(n == 1 || n == 2){
            return 1;
        }
        //从第三项开始，每一项都是前两项的和
        return fb(n- 2 ) + fb(n - 1);
    }
}
