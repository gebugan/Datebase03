package com.hainiu.homework;

import java.util.Random;
import java.util.Scanner;

/**
 * @program: Text
 * @description: 生成验证码  四位的字符串  可选字符包含：大写字母小写字母数字
 * 通过索引操作数据
 * @author: 小戈
 * @create: 2023-04-01 22:18
 * 1.用到rundom函数设计随机索引
 * 2.索引可查询字符串在大写字母小写字母数字之间
 * 3.设置大写字母小写字母数字
 */
public class Demo05 {
    public static void main(String[] args) {
        code();
        String dd = "";

        while (true) {
            //调用colut方法，将返回值f传递给dd
            dd = colut(code());
            Scanner sc = new Scanner(System.in);
            System.out.println("请输入校验码：");
            String shibie = sc.nextLine();
            //识别输入和系统随机码是否相等
            //equalsIgnoreCase记忆
            if (shibie.equalsIgnoreCase(dd)) {
                System.out.println("识别成功");
                break;
            } else {
                System.out.println("识别失败");
            }
        }

        
    }
    //存储code写字母小写字母数字
    public static String code(){
        String code = "";
        for (char i = 'a';i <= 'z';i++) {
            code += i;
        }
        for (char i = 'A';i <= 'Z';i++) {
            code += i;
        }
        for (char i = '0';i <= '9';i++) {
            code += i;
        }
        
        return code;
        
    }

    //生成编码
    public static String  colut(String code){

        String f = "";
        Random random = new Random();
        //循环四次
        for (int i = 0; i < 4; i++) {
            //对code字符串进行随机数
            int a = random.nextInt(code.length());
            //提供随机数进行查寻code字段
            char c = code.charAt(a);
            f += c;
        }
        System.out.println("系统生成的校验码为：" + f);
       return f;

    }
//    //使用输入方法识别
//    public static void start(String shibie){
//
//        if (shibie.equals(colut(code()))){
//            System.out.println("识别成功");
//        }else {
//            System.out.println("识别失败");
//        }
//
//
//    }


}
