package com.hainiu.homework;

/**
 * @program: Text
 * @description:
 * @author: 小戈
 * @create: 2023-03-31 19:43
 * 继承可以让类与类之间产生子父类关系，产生子父类后，
 * 子类则可以使用父类中非私有的成员。
 */

public class Cat extends Pet{

    //重写父类pet的eatAction方法
    @Override
    public void eatAction(){
        System.out.println("小猫正在吃鱼");
    }


}
