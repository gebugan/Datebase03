package com.hainiu.Day05.mo;

/**
 * @program: Text
 * @description:
 * @author: 小戈
 * @create: 2023-04-01 19:28
 */
public class EableTest {
    public static void main(String[] args) {
       Eatable e = new EableImpl();
        userEatable(e);

        //匿名内部类
        userEatable(new Eatable() {
            @Override
            public void eat() {
                System.out.println("一天俩苹果，医生远离我");
            }
        });
        //Lambda表达式
        userEatable(() -> {
            System.out.println("一天仨苹果，医生远离我");
        });
    }
    public static void userEatable(Eatable e){
        e.eat();
    }
}
