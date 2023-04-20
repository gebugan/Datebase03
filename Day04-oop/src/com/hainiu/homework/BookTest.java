package com.hainiu.homework;

/**
 * @program: Text
 * @description:
 * @author: 小戈
 * @create: 2023-03-31 19:23
 */
public class BookTest {
    public static void main(String[] args) {
        Book b = new Book();
        //往setAuthor中传入内容
        b.setAuthor("罗贯中");
        //调用get方法获取封装的数据  并赋给a
        String author = b.getAuthor();
        //同理
        b.setName("三国演义");
        String name = b.getName();
        b.setPrice(99);
        int price = b.getPrice();
        //输出传入的值
        System.out.println(name + author + price);

        //直接定义成员变量
        Book b2 = new Book("李四",66,"三罗演义");
        b2.setName("张三");
        System.out.println(b2.getName());
        //显示Book类内部成员变量的值
        System.out.println(b2);



    }
}
