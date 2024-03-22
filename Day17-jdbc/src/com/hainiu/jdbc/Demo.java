package com.hainiu.jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

/**
 * @program: Text
 * @description:
 * @author: 小戈
 * @create: 2023-04-18 09:37
 */
public class Demo {
    public static void main(String[] args) throws ClassNotFoundException, SQLException {
        //加载驱动
        Class.forName("com.mysql.jdbc.Driver");
        //建立连接
        String url ="jdbc:mysql://11.90.214.92:3306/hainiu49_3?useSSL=false&characterEncoding=UTF-8";
        String username = "root";
        String password = "hainiu";
        Connection connection = DriverManager.getConnection(url,username,password);

        //获取连接对
        Statement statement = connection.createStatement();
        //语句
        String sql = " insert into category(cid,cname) values(6,'张进宝');";
        //执行操作
        int i = statement.executeUpdate(sql);
        System.out.println("受影响的数据有" + i + "条");
        //释放资源
        statement.close();
        connection.close();

    }




























































}
