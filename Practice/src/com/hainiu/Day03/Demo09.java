package com.hainiu.Day03;

import com.sun.scenario.effect.impl.state.GaussianShadowState;

import java.util.Random;
import java.util.Scanner;

/**
 * @program: Text
 * @description:二分查找
 * 1.前提：必须是顺序储存结构
 * 2.必须按关键字大小排列
 * @author: 小戈
 * @create: 2023-03-29 19:10
 */
public class Demo09 {
    public static void main(String[] args) {
        int[] arr = {1,2,4,5,7,8,10,11,13,14,55,89,111,254};
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入要用二分法做的数字：");
        int gass = sc.nextInt();
        //调用方法，返回值
        int jiqi = two(arr,gass);
        System.out.println("数字在数组的位置为" + jiqi);
    }

    public static int two(int[] arr,int gass){
        int first = 0;
        int end = arr.length - 1;
        for (int i = 0; i < arr.length; i++) {
            int no = (first+end)/2;

            if (arr[no] < gass){
                first = no;

            }else if(arr[no] > gass){
                end = no;
            }else {
                System.out.println("您输入的值已经猜到，为：" + arr[no]);
                //返回猜到的数字位置
                return no + 1;
            }

        }





        return 1;
    }


}
