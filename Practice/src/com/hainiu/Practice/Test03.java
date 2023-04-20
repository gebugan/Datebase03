package com.hainiu.Practice;

import java.security.Key;
import java.util.*;

/**
 * @program: Text
 * @description:
 * @author: 小戈
 * @create: 2023-04-09 11:28
 */
public class Test03 {
    public static void main(String[] args) {
        /**
         * ArrayList
         */
        ArrayList<String>  a = new ArrayList<>();
        a.add("张三");
        a.add("张三");
        a.add("张三");
        a.add("张三1");
        a.add("张三2");
        a.add(2,"李四");
        for (String arr : a){
            System.out.println(arr);
        }
        /**
         * LinkedList
         */

        System.out.println("------------------------");
        LinkedList<String > b = new LinkedList<>();
        b.add("赵四");
        b.add("赵四2");
        b.add("赵四3");
        b.add(3,"赵四4444");
        b.add("赵四5");
        b.add("赵四6");
        b.add("赵四6");
        b.add("赵四6");
        b.add("赵四7");
        b.add("赵四8");
        b.removeFirst();
        b.remove(2);
        for (String arr : b){
            System.out.println(arr);
        }
        /**
         * TreeSet
         */

        System.out.println("-------------------------");
        //<>可传入类文件，并对类中的带参构造方法赋值
        TreeSet<String > d = new TreeSet<>();
        //可以调用其他javaBeen，进行排序
        d.add("胡汉三");
        d.add("胡汉三");
        d.add("胡汉四");
        d.add("胡汉五");
        for (String arr: d){
            System.out.println(arr);
        }
        /**
         * HashSet
         */

        System.out.println("-------------------------");
        HashSet<Object> e = new HashSet<>();
        //hashset具有唯一性，不录入重复元素
        e.add("李四");
        e.add("李五");
        e.add("李六");
        e.add("李六");
        e.add("李六");
        e.add("李六");
        e.add("李七");
        e.add("李八");
        for (Object arr : e){
            System.out.println(arr);
        }
        /**
         * HashMap
         */

        System.out.println("--------------------------");
        HashMap<String , Integer>  c = new HashMap<>();
        c.put("张飞",25);
        c.put("卢布",25);
        c.put("关羽",25);
        c.put("关羽",25);
        //获取键值，进行遍历
        for (String arr : c.keySet()){
            System.out.println(arr);
        }
        //使用map方法中的Entry,循环遍历
        for ( Map.Entry<String,Integer> arr : c.entrySet()){
            System.out.println(arr);
        }
        System.out.println("----------------");
        /**
         * TreeMap
         */
        TreeMap<String ,Integer> f = new TreeMap();

        f.put("张三0",26);
        f.put("张三1",20);
        f.put("张三2",22);
        f.put("张三3",25);
        Set<String > arr = f.keySet();
        for (String ar: arr){
            Integer value = f.get(ar);
            System.out.println(ar + "  " + value);
        }
        //创建集合对象
        Map<String, String> map = new HashMap<String, String>();

        //添加元素
        map.put("张无忌", "赵敏");
        map.put("郭靖", "黄蓉");
        map.put("杨过", "小龙女");

        //方法一
        //获取所有键的集合。用keySet()方法实现
        Set<String> keySet = map.keySet();
        //遍历键的集合，获取到每一个键。用增强for实现
        for (String key : keySet) {
            //根据键去找值。用get(Object key)方法实现
            String value = map.get(key);
            System.out.println(key + "," + value);
        }
        //方法二
        //获取所有键值对对象的集合
        Set<Map.Entry<String, String>> entrySet = map.entrySet();
        //遍历键值对对象的集合，得到每一个键值对对象
        for (Map.Entry<String, String> me : entrySet) {
            //根据键值对对象获取键和值
            String key = me.getKey();
            String value = me.getValue();
            System.out.println(key + "," + value);
        }


    }
}
