package hainiu.collection;

import java.util.ArrayList;

/**
 * @program: Text
 * @description:
 * @author: 小戈
 * @create: 2023-04-03 11:47
 */
public class Demo01 {
    public static void main(String[] args) {
        //强制当前集合只能存储字符串  泛型的概念<>
        ArrayList<String> list = new ArrayList<>();

        //添加对象
        //list.add(100);
        list.add("hello");
        list.add("java");
        list.add("world");
        list.add("java");

        System.out.println(list);

//        //移除一个java
//        list.remove("java");
//        System.out.println(list);
        //list.fori
        //list.for
        for (String s : list) {
            System.out.print(s + "\t");
        }



    }









































}
