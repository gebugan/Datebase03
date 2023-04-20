package com.hainiu.review;

import java.util.Date;

/**
 * @program: Text
 * @description:
 * @author: 小戈
 * @create: 2023-03-31 22:10
 */
public class ChatRoom {
    public static void showMessage(User user, String message){
        System.out.println(new Date().toString() + " [" + user.getName() +"] : " + message);
    }
}
