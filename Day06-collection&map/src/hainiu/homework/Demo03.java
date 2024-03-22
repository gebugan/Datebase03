package hainiu.homework;

import java.util.HashMap;
import java.util.HashSet;

/**
 * @program: Text
 * @description: 3. HashSet 存储几个学生对象，要求如果对象的所有属性都相同就认为是重复。并遍历结果。
 * @author: 小戈
 * @create: 2023-04-03 21:13
 */
public class Demo03 {
    public static void main(String[] args) {
        HashSet<String > student = new HashSet<>();

        student.add("john");
        student.add("Mike");
        student.add("Tom");
        student.add("john");

        //增强for循环
        for (String arr : student) {
            System.out.println(arr);
        }



    }
}
