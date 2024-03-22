package hainiu.homework;

import java.util.ArrayList;
import java.util.Iterator;

/**
 * @program: Text
 * @description: 1、定义ArrayList集合，随意存储几个字符串，并遍历（三种：迭代器 foreach 索引）
 * @author: 小戈
 * @create: 2023-04-03 20:13
 */
public class Demo01 {
    public static void main(String[] args) {
        ArrayList<String> a = new ArrayList<>();
        a.add("张三");
        a.add("李四");
        a.add("王五");
        a.add("赵六");

        System.out.println(a);
        //遍历 迭代器 Iterator<E> iterator()：返回此集合中元素的迭代器，通过集合的iterator()方法得到
        Iterator<String> b = a.iterator();
        while (b.hasNext()){
            System.out.print(b.next() + "\t");
        }
        System.out.println();

        //foreach，增强for循环
        // 1,数据类型一定是集合或者数组中元素的类型
        // 2,str仅仅是一个变量名而已,在循环的过程中,依次表示集合或者数组中的每一个元素
        // 3,list就是要遍历的集合或者数组
        for (String arr : a){
            System.out.print(arr + "\t");
        }

        System.out.println();
        //索引

        for (int i = 0; i < a.size(); i++) {
            System.out.print(a.get(i) + "\t");
        }



    }

}
