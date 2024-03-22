package com.hainiu.Practice;

import java.util.TreeSet;

/**
 * @program: Text
 * @description:
 * @author: 小戈
 * @create: 2023-04-09 21:56
 */
public class Treeet {
    public static void main(String[] args) {
       // Student student = new Student();
        TreeSet<Student> tree = new TreeSet<>();
        Student st0 = new Student("张三",23);
        Student st1 = new Student("张四",28);
        Student st2 = new Student("张五",29);
        Student st3 = new Student("张六",20);
        tree.add(st0);
        tree.add(st1);
        tree.add(st2);
        tree.add(st3);
        for (Student arr: tree){
            System.out.println(arr);
        }






    }
































}
