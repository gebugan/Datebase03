package com.hainiu.Practice;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Scanner;

/**
 * @program: Text
 * @description:
 * 请通过键盘录入一段纯英文文本（无需校验数据的正确性，按要求录入即可）
 * ，统计其中每个英文字符出现的次数，打印结果如下：
 * a=5
 * b=6
 * c=7
 * ...
 * 表示a出现5次，b出现6次，以此类推；要求按照字母的自然顺序输出。
 * @author: 小戈
 * @create: 2023-04-12 16:15
 */
public class Exam03 {
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        System.out.println("请输入一段纯英文文本:");
        //存入字符串
        String a = sc.nextLine();
        //调用方法
        pai(a);
        geshu(a);

    }

    /**
     * 这是排字母顺序的方法
     * @param str
     */
    public static void pai(String str){
        //转成字符串数组
        char[] chars = str.toCharArray();
        //排序
        Arrays.sort(chars);
    }

    /**
     * 这是统计字符串个数的方法
     * @param a
     */
    public static void geshu(String a){
        // Map集合，key代表字符，value是字符的个数
        HashMap<Character , Integer> map = new HashMap<>();
        // 遍历字符串，获取每一个字符
        for(char c : a.toCharArray()){
            //判断字符
            if(map.containsKey(c)){
                // key存在
                Integer value = map.get(c);
                //值加一
                value++;
                map.put(c,value);
            }else{
                // key不存在
                map.put(c,1);
            }
        }

        // 增强for循环遍历
        for(Character key : map.keySet()){
            Integer value = map.get(key);
            System.out.println(key + "=" +value);
        }


    }
}
