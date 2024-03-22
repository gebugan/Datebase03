package com.hainiu.homework;

/**
 * @program: Text
 * @description:正则表达式的案例 讲义 5个代码
 * @author: 小戈
 * @create: 2023-04-02 13:04
 */
public class Demo09 {
    public static void main(String[] args) {
        // 现得到如下的字符串：
        String s = "我..我....我.我...我.要.要...要...要..要...要.学..学.学...学.学.编...编.编..编...编...程程..程..程";
        // 请还原出其中的有效信息：我要学编程
        // 替换所有的点
        //把点取代为空 不能有空格
        s = s.replaceAll("\\.","");
        System.out.println(s);
        //替换中第二个参数用$取第一个参数中的组
        s = s.replaceAll("(.)\\1+","$1");
        System.out.println(s);


    }
}
