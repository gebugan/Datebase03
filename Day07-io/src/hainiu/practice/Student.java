package hainiu.practice;

import java.io.Serializable;

/**
 * @program: Text
 * @description:
 * @author: 小戈
 * @create: 2023-04-04 21:24
 */
public class Student implements Serializable {
    private String name;
    private int age;
    private int id;


    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public Student(String name, int age, int id) {
        this.name = name;
        this.age = age;
        this.id = id;
    }

    public Student() {
        System.out.println("这是一个私有构造方法");
    }

//    private static Student instance = null;
//    public static  Student getInstance(){
//
//        if (instance == null){
//            instance = new Student();
//        }
//        return instance;
//    }

}
