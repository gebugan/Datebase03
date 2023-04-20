package com.hainiu.homework;

/**
 * @program: Text
 * @description:
 * @author: 小戈
 * @create: 2023-03-31 19:43
 */
public class AnimalTest {
    public static void main(String[] args) {
        Cat cat = new Cat();
        //调用子类重写的eatAction方法
        cat.eatAction();

//        Pet pet = new Pet();
//        pet.setColor("绿色");
//        pet.setEat("草");
//        System.out.println(pet.getColor());

        Dog dog = new Dog();
        //往dog子类继承Pet父类的方法中传入参数
        dog.setColor("绿色");
        dog.setEat("草");
        //调用子类继承父类的方法
        dog.eatAction();




    }



}
