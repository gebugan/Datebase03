package com.hainiu.array2;

/**
 * @program: Text
 * @description:
 * @author: 小戈
 * @create: 2023-03-30 11:40
 */
public class Demo01 {
    public static void main(String[] args) {
        //数据类型[][] 数组名 = new 数据类型[m][n]
        //m便是二维数组的长度，大数组中包含几个小数组
        //n表示每个小数组的长度，每个小数组包含几个元素
        int[][] arr = new int[3][4];
        System.out.println(arr); // 二维数组[[I@7f31245a
        System.out.println(arr[0]);//一维数组[I@6d6f6e28
        System.out.println(arr[0][0]);//0

        int[][] arr2 = new int[][]{{1,2,3,4},{4,5,6,7},{7,8,9,10}};
        System.out.println(arr2[2][2]);

        //掌握二维数组的遍历，两层循环嵌套
        for (int i = 0; i < arr.length; i++) {
            int[] temp = arr[i];
            for (int j = 0; j < temp.length; j++) {
                System.out.println(temp[j]);
            }

        }




    }
}
