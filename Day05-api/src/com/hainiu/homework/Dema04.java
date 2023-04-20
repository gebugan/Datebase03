package com.hainiu.homework;

import java.lang.reflect.Constructor;
import java.lang.reflect.Field;

/**
 * @program: Text
 * @description:
 * @author: 小戈
 * @create: 2023-04-07 19:30
 *
 *
 */
public class Dema04 {
    public static void main(String[] args) throws Exception {
        Class<Student> clazz = (Class<Student>)Class.forName("com.hainiu.homework.Student");
//        System.out.println(clazz);
//
////任意类型的class属性
//        Class<Dema02> clazz02 = Dema02.class;
//        System.out.println(clazz02);
//
//        System.out.println(clazz == clazz02);
//
//        Dema02 s = new Dema02();
//        Class<Dema02> clazz03 = (Class<Dema02>)s.getClass();
//        System.out.println(clazz03);
//        System.out.println(clazz == clazz03);

        // 获取一个非公弓构造
        Constructor<Student> constructor2 = clazz.getDeclaredConstructor(String.class);
        System.out.println(constructor2);

        //使用
        constructor2.setAccessible(true);
        Student dema02 = constructor2.newInstance("Tom");
        System.out.println(dema02);

        Student student = clazz.getDeclaredConstructor().newInstance();

        //获取成员
        Field nameFiled = clazz.getDeclaredField("name");

        //设置可访问
        nameFiled.setAccessible(true);
        //赋值
        nameFiled.set(student,"tom");

        Object value = nameFiled.get(student);
        System.out.println(value);

        Field ageField = clazz.getDeclaredField("age");
        ageField.setAccessible(true);
        ageField.set(student,23);
        Object v2 = ageField.get(student);
        System.out.println(v2);

        System.out.println(student);






    }


































}
