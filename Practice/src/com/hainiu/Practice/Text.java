package com.hainiu.Practice;

/**
 * @program: Text
 * @description:
 * @author: 小戈
 * @create: 2023-04-05 19:15
 */
public class Text {
    public static void main(String[] args) {
//        double b =2.
//        double c =2.
//        Cat cat = new Cat();
//        cat.eat();
//        int a = cat.s();
//        cat.fly();
//       if (cat instanceof Cat){
//           System.out.println("cat对象是Cat类的");
//       }




        String s = new String("hdkjahdajkh");

        s.length();

        Cat cat = new Cat();
        text(cat);
        //cat.eat();


        //匿名内部类
        //text(() ->{ System.out.println("小猫吃鱼2"); });
        text(new Cat() {
            @Override
            public void eat() {
                System.out.println("小猫吃鱼2");
            }
        });

        //lamba表达式
        text(() -> {
            System.out.println("aaaaaa");
        });


    }
    public static void text(Inter e){
        e.eat();
    }



}
