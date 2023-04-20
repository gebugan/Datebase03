package com.hainiu.Day05.mo;

/**
 * @program: Text
 * @description:
 * @author: 小戈
 * @create: 2023-04-01 19:27
 */
public class EableImpl implements Eatable{

    @Override
    public void eat() {
        System.out.println("一天一个苹果，医生远离我");
    }
}
