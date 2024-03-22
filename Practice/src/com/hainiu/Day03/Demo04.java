package com.hainiu.Day03;

/**
 * @program: Text
 * @description: 方法调用
 * @author: 小戈
 * @create: 2023-03-29 14:52
 */
public class Demo04 {
    public static void main(String[] args) {
       //int[][] arr = {{1,2,3,4},{5,6,7,8}};
        //准备参数
        int[][] arr = new int[4][4];
        number(arr);
    }

    /**
     * 带参数无返回值的方法
     * @param arr
     */
    public static void number(int[][] arr){
        if (arr == null){
            System.out.println("该数组不存在");
            return;
        }
        if (arr != null){
            System.out.println("该数组值不为空");
            System.out.println(arr);
        }

        for (int i = 0; i < arr.length; i++) {
            System.out.print("[\t");
            for (int j = 0; j < arr[i].length; j++) {
                System.out.print(arr[i][j] + "\t");
            }
            System.out.println("]");
            System.out.println();

        }

    }

}
