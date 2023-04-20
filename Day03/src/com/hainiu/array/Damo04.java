package com.hainiu.array;

/**
 * @program: Text
 * @description:
 * @author: 小戈
 * @create: 2023-03-30 10:31
 */
public class Damo04 {
    public static void main(String[] args) {

        //找最大值
        int[] arr = new int[] {12,55,1,68,5,2,33,51,69};
        //定义一个参考值，取数组第一个元素,最终记录最大的
        int max = arr[0];
        //从第二个元素，遍历数组，一次比较
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] > max){

                max = arr[i];
            }

        }
        System.out.println(max);
    }
}
