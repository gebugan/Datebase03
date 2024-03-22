package com.hainiu.array2;

/**
 * @program: Text
 * @description:
 * @author: 小戈
 * @create: 2023-03-30 12:12
 */
public class Test02 {
    //从季度和年度统计商场的营业额
    /**
     * 10 11 15
     * 22 33 44
     * 55 66 50
     * 10 8 9
     * 季度数据存储下来，所有数据保存到年度
     */
    public static void main(String[] args) {
        int[][] arr ={{10,11,15 },{22,33,44},{55,66,50},{10,8,9}};
        //年度
        int year = 0;
        //循环遍历每个元素累加
        //arr.length 为一维数组个数，ara[i].length为一维数组内的数的个数
        for (int i = 0; i < arr.length; i++) {
            int season = 0;
            for (int j = 0; j < arr[i].length; j++) {
                year += arr[i][j];
                season += arr[i][j];

            }
            //内循环执行一轮
            System.out.println(season);

        }
        System.out.println(year);
    }


















}
