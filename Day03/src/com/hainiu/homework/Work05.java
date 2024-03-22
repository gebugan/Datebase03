package com.hainiu.homework;

/**
 * @program: Text
 * @description:5、二维数组遍历，求年度营业额
 * @author: 小戈
 * @create: 2023-03-30 19:39
 */
public class Work05 {
    public static void main(String[] args) {
        int[][] arr = {{11,22,33,44},{55,66,77,88},{99,66,33,22,},{44,55,22,88}};
        int sum = 0;
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                sum = sum + arr[i][j];
            }

        }
        System.out.println(sum);
    }
}
