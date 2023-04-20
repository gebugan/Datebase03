package com.hainiu.homework;

/**
 * @program: Text
 * @description: String str = "hellojavaworldjavabigdatajavajava"; 有几个java单词
 * 查找并截取
 * ***改变查询范围 不截取
 * 1.从头开始遍历查找第一次java出现位置
 * 2.记录位置，跳过java单词（+3），改变查询范围，在该位置开始遍历下一个java
 * 3.记录跳跃次数，即为java出现次数
 * @author: 小戈
 * @create: 2023-04-01 21:15
 public int indexOf(String str)
 返回指定的子字符串在调用方法的字符串中第一次出现的索引。如果没有，返回-1
 public int indexOf(String str, int fromIndex)
 返回指定的子字符串在调用方法的字符串中第一次出现的索引，以指定的索引开始搜索。如果没有，返回-1
 */
public class Demo04 {
    public static void main(String[] args) {
        String str = "hellojavaworldjavabigdatajavajavahellojavaworldjavabigdatajavajava";
        String a = "java";
        //注释：6为开始查询str字符串位置，方法使用后会输出要查询的字符串a第一次出现的位置，并将该位置赋值给c
        // int c = str.indexOf(a, 6);
        System.out.println(search(str,a));
    }
    public static int search(String str,String a){

        //定义跳跃次数
        int count = 0;
        //遍历查询
        for (int i = 0; i < str.length(); i++) {

            //从i= 0开始遍历查找，将第一次查到java的位置赋值给b
            int b = str.indexOf(a,i);
            //第一次位置锚点跳过java字符串开始查找新的java
            i = b + 3;
            //记录跳跃次数
            count++;
        }
        //循环结束返回跳跃次数
        return count;
    }
}
