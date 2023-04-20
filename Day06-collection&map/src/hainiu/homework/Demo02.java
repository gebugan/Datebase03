package hainiu.homework;

import java.util.LinkedList;

/**
 * @program: Text
 * @description: 2、LinkedList 1-108号 排序拿好，拿起一张扔掉，拿起一张放到最下面。反复操作，直到剩余一张，剩的谁？
 * @author: 小戈
 * @create: 2023-04-03 20:46
 */
public class Demo02 {
    public static void main(String[] args) {
        //定义链表，存储元素
        LinkedList<Object> list = new LinkedList<>();
        for (int i = 1; i <= 108; i++) {
            list.add(i);
        }
        //实现
        while (list.size() > 1) {
            //删除第一个元素
            list.removeFirst();

            list.addLast(list.removeFirst());
        }

        Integer num = (Integer) list.get(0);
      //  System.out.println(list.get(0));
        System.out.println(num);


    }
}
