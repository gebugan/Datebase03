package com.hainiu.Day03;

/**
 * @program: Text
 * @description:二维数组
 * @author: 小戈
 * @create: 2023-03-29 11:53
 */
public class Demo02 {
    public static void main(String[] args) {
        //二维数组动态初始化;5行6列
        int [][] arr01 = new int[5][6];

        //二维数组静态初始化
        int[][] arr = new  int[][]{{1,2,3,4 },{5,6,7,8}};

        //二维数组静态初始化简化
        int[][] arr02 = {{1,4,7,8},{9,6,3,1}};
        System.out.println(arr[1][3]);
        System.out.println("--------------------------------");

        //二维数组遍历;
        // arr.length为一维数组的个数；arr[i].length为每个一维数组的长度
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                System.out.print(arr[i][j] + "\t");
            }
            System.out.println();

        }

    }
}
