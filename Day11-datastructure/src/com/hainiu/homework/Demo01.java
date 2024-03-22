package com.hainiu.homework;

/**
 * @program: Text
 * @description:迷宫最优路线问题。工有多少条路径
 * @author: 小戈
 * @create: 2023-04-10 20:56
 */
public class Demo01 {
    public static void main(String[] args) {
        System.out.println();
    }
    public static int mg(int x,int y){
        //到达最边上只有一条路径
        if(x ==4 || y == 4){
            return 1;
        }
        //某个点的最优路线=这个点的右边的最优路线+这个点现编的最优路线
        return mg(x+1 ,y) + mg(x,y+1);
    }
}
