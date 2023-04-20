package com.hainiu.homework;

/**
 * @program: Text
 * @description:
 * @author: 小戈
 * @create: 2023-03-31 21:44
 */
public abstract class SwimTest  implements Swimming{

    public static void main(String[] args) {

        //访问方法名 （new 接口名（）{重写方法}}）；

        goSwimming(new Swimming() {

            @Override
            public void swim() {

                System.out.println("游泳");
            }
        });

    }
    // 参数是接口  传递的一定是接口的实现子类对象
    public static void goSwimming(Swimming swimming){

        swimming.swim();
    }

}
