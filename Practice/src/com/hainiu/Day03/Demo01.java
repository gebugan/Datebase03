package com.hainiu.Day03;

/**
 * @program: Text
 * @description:一维数组运用
 * @author: 小戈
 * @create: 2023-03-29 10:33
 */
public class Demo01 {
    public static void main(String[] args) {
        //数组动态初始化,new为开辟空间
        int []arr = new int[5];
        //数组静态初始化，新建一个数组并赋值
        int []arr01 = new int[]{11,55,62,89,112};
        //简化形式
        int []arr02 = {65,54,99,42,5};
        //数组遍历
        for (int i = 0; i < arr01.length; i++) {
            System.out.println(arr01[i]);
        }
        //求数组arr02最大值
        int max = arr02[0];
        for (int i = 0; i < arr02.length; i++) {
            if (max <= arr02[i]){
                max = arr02[i];
            }
        }
        System.out.println("数组arr02最大值为：" + max);
    }
}
