package com.hainiu.homework;

/**
 * @program: Text
 * @description:森林里有一只熊怪，很爱吃核桃。
 *   不过它有个习惯，每次都把找到的核桃分成相等的两份，吃掉一份，留一份。
 *   如果不能等分，熊怪就会扔掉一个核桃再分。第二天再继续这个过程，直到最后剩一个核桃了，直接丢掉。
 *   有一天，熊怪发现了1543个核桃，请问，它在吃这些核桃的过程中，它一共要丢掉多少个核桃。
 * @author: 小戈
 * @create: 2023-03-28 19:36
 * 1.除二取余问题
 * 2.循环整除二，分情况讨论
 * 3.无余数继续除二，有余数累加次数
 */
public class Work08 {
    public static void main(String[] args) {
        int a = 1543;
        int count = 0;
        while (true){
            if (a % 2 == 0){
                a = a / 2;
            }else {
                a = a - 1;
              count ++;
            }
            if (a == 0){
                System.out.println("熊怪丢掉了：" + count);break;
            }
        }
    }
}
