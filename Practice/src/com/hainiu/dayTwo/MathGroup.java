package com.hainiu.dayTwo;

/**
 * @program: Text
 * @description:
 * @author: 小戈
 * @create: 2023-03-27 21:33
 */
public class MathGroup {
    public static void main(String[] args) {
        //定义一个整形数组，数组长度为4
        int []arr = new int[4];
        //定义一个整型数组arr2，并赋值
        int []arr2 = new int[]{22,55,99,465,02,36,2};

//        System.out.println(arr2[3]);
//        Exception in thread "main" java.lang.ArrayIndexOutOfBoundsException:数组索引越界异常

//        arr = null;
//        System.out.println(arr[0]);
//        Exception in thread "main" java.lang.NullPointerException:空指针异常
        int a =1;

        if(arr == null){
            System.out.println("空指针异常");
        }else{
            System.out.println(arr2[a]);
        }

        for (int i = 0;i < arr2.length;i++){
            for(int j = i+1;j < arr2.length;j++){
                int max;
               if(arr2[i] > arr2[j]){
                    max = arr2[i];
               }else{
                   max = arr2[j];
               }
                System.out.println(max);
            }


        }




    }


}
