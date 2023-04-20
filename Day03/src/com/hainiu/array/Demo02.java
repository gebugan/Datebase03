package com.hainiu.array;

/**
 * @program: Text
 * @description:
 * @author: 小戈
 * @create: 2023-03-30 10:18
 */
public class Demo02 {
    public static void main(String[] args) {
        //静态初始化
        int[] arr = new  int[] {1,2,3,4,5,6,7,8,};
        //数组名.Length    获取长度
        System.out.println(arr.length);

        int[] arr2 = {1,2,3,4,5,6,7,8,};
        System.out.println(arr2.length);

        //null 空常量
        int[] arr3 = null;
        System.out.println(arr3[0]);//NullPointerException 空指针异常

    }
}
