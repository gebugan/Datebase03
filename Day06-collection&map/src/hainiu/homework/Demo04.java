package hainiu.homework;

import java.util.TreeSet;

/**
 * @program: Text
 * @description: 4、定义一个Worker类（属性 姓名name 年龄age 工资salary）
 * 创建几个Worker对象，存入TreeSet集合，
 * 要求：按照薪资从大到小排序，如果薪资相同，按照年龄从小到大；
 * 如果也相同，按照姓名字典顺序排序。
 * @author: 小戈
 * @create: 2023-04-03 21:25
 */
public class Demo04 {
    public static void main(String[] args) {
        TreeSet<Worker > set = new TreeSet<>();
        Worker worker01 = new Worker("zhangsan",20,2000);
        Worker worker02 = new Worker("zhangsan",19,1000);
        Worker worker03 = new Worker("lisi",20,2000);
        Worker worker04 = new Worker("zhangsi",28,1000);
        Worker worker05 = new Worker("wangwu",20,3000);

        set.add(worker01);
        set.add(worker02);
        set.add(worker03);
        set.add(worker04);
        set.add(worker05);


        for (Worker arr : set){
            System.out.println(arr);
        }

    }
}
