package com.hainiu.homework;

/**
 * @program: Text
 * @description:父类
 * @author: 小戈
 * @create: 2023-03-31 19:43
 * 继承案例
 *     oop4包 Pet类和子类Cat、Dog
 */
public class Pet {
    private String eat;
    private String color;

    public void eatAction(){
        System.out.println(color + "的动物正在吃" + eat);
    }

    public Pet() {
    }

    public Pet(String eat, String color) {
        this.eat = eat;
        this.color = color;
    }

    public String getEat() {
        return eat;
    }

    public void setEat(String eat) {
        this.eat = eat;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }
}
