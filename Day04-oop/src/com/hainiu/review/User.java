package com.hainiu.review;

/**
 * @program: Text
 * @description:
 * @author: 小戈
 * @create: 2023-03-31 22:11
 */
public class User {
    private String name;

    public void sendMessage(String message){
        ChatRoom.showMessage(this,message);
    }

    public User() {
    }

    public User(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
