package com.hainiu.method;

/**
 * @program: Text
 * @description:
 * @author: 小戈
 * @create: 2023-03-30 14:50
 */

public class Demo01 {
    /**
     返回值类型 --方法执行完毕得到的结果
     如果没有具体的返回值，写void
     方法名 -- 标识符 调用方法使用
     参数列表 --方法需要的参数
     数据类型 变量名，数据类型 变量名。。。
     没有就空着
     方法体 -- 方法的实现逻辑代码
     return -- 可选，如果方法执行完毕有结果，那么使用return语句返回这个结果
     如果没有返回值，省略return
     */
    public static int add(int a,int b){
        return a + b;
    }

    public static void main(String[] args) {
        //调用方法
        int num = add(10,20);
        System.out.println(num);
    }



























}
