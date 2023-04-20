package com.hainiu.homework;

/**
 * @program: Text
 * @description: 两个对象的属性值都想同，想等
 * 如果两个对象相同（即用即用equals比较返回比较返回true），那么它们的hashCode值一定要相同！！！！
 * 如果两个对象不同（即用即用equals比较返回比较返回false），那么它们的hashCode值可能相同也可能不同。
 * 如果两个对象的hashCode相同（存在哈希冲突存在哈希冲突），那么它们可能相同也可能不同(即equals比较可能是false也可能是true)
 * 如果两个对象的hashCode不同，那么他们肯定不同(即用equals比较返回false)
 * @author: 小戈
 * @create: 2023-04-01 19:51
 */
public class StudentTest {
    public static void main(String[] args) {
        Student student1 = new Student("张三");
        Student student2 = new Student("张三");
        //两个对象相同,较返回true
        System.out.println(student1.equals(student2));

        //774920
        System.out.println(student1.hashCode());
        System.out.println(student2.hashCode());

        //Student{name='张三'}
        System.out.println(student1);
        System.out.println(student1.toString());





    }

}
