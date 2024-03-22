package com.hainiu.method;

/**
 * @program: Text
 * @description:引用类型参数，形式参数改变，影响实际数值
 * @author: 小戈
 * @create: 2023-03-30 16:07
 */
public class Demo07 {
    public static void main(String[] args) {
        int[] arr = {10,20,30};
        System.out.println("方法调用前：" + arr[1]);
        num(arr);
        System.out.println("方法调用后：" + arr[1]);

    }
    public static void num(int[] arr){
        arr[1] = 200;
        System.out.println(arr[1]);
    }
}
