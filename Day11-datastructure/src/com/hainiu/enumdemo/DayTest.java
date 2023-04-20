package com.hainiu.enumdemo;

/**
 * @program: Text
 * @description:
 * @author: 小戈
 * @create: 2023-04-10 09:18
 */
public class DayTest {
    public static void main(String[] args) {
        Day day = Day.FRIDAY;
        System.out.println(day);
    }
    private Day day;
    public DayTest(Day day){
        this.day = day;
    }
    public void test(){
        switch ( day){
            case MONDAY:
                System.out.println("星期一");
                break;
            case TUESDAY:
                System.out.println("星期二");
                break;
            case THURSDAY:
                System.out.println("星期四");
                break;
            case FRIDAY:
                System.out.println("星期五");
                break;
            case SATURDAY:
                System.out.println("星期六");
                break;
            case SUNDAY:
                System.out.println("星期日");
                break;

        }
    }







































































}
