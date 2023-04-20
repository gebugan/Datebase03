package com.hainiu.homework;

/**
 * @program: Text
 * @description:
 * @author: 小戈
 * @create: 2023-04-10 20:25
 */
public class DayTest {


    public DayTest(Day day) {
        this.day = day;
    }

    public static void main(String[] args) {
        //Day day = Day.FRIDAY;
       // System.out.println(day);

        //传星期，switch判断
        DayTest test = new DayTest(Day.THURSDAY);
        test.test();

        //遍历
        Day[] values = Day.values();
        for (Day value : values){
            System.out.println(value);
        }

        //传值
        Day monday = Day.valueOf("MONDAY");
        System.out.println(monday);

        System.out.println(Day.MONDAY.compareTo(Day.WEDNESDAY));
        System.out.println(Day.MONDAY.ordinal());



    }

    private Day day;

    public  void test(){
        switch (day){
            case MONDAY:
                System.out.println("星期一");
                break;
            case TUESDAY:
                System.out.println("星期二");
                break;
            case WEDNESDAY:
                System.out.println("星期三");
                break;
            case THURSDAY:
                System.out.println("星期四");
                break;

        }
    }



















}
