package com.hainiu.homework;

/**
 * @program: Text
 * @description:
 * @author: 小戈
 * @create: 2023-03-31 19:12
 * // 用于描述书籍信息
 * /*
 * 成员变量 -- 属性 -- field 字段
 * 成员方法 -- 行为 -- method
 * 构造方法 -- 创建对象 -- constructor  构造器
 *
 * 私有成员变量
 * 提供相应的get和set方法
 * 提供构造器（无参数 全参数）
 */
public class Book {
    private String name;
    private int price;
    private String author;

    //空的构造方法
    public Book() {
    }

    //全参数的构造方法
    public Book(String name, int price, String author) {
        this.name = name;
        this.price = price;
        this.author = author;
    }

    //获取名字
    public String getName() {
        return name;
    }

    //写入名字
    public void setName(String name) {
        this.name = name;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    @Override
    public String toString() {
        return "Book{" +
                "name='" + name + '\'' +
                ", price=" + price +
                ", author='" + author + '\'' +
                '}';
    }
}
