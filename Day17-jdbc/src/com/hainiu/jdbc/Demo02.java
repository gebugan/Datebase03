package com.hainiu.jdbc;

import java.sql.*;
import java.util.ArrayList;



/**
 * @program: Text
 * @description:
 * @author: 小戈
 * @create: 2023-04-18 09:37
 */
public class Demo02 {
    public static void main(String[] args) throws ClassNotFoundException, SQLException {
        //加载驱动
        Class.forName("com.mysql.jdbc.Driver");
        //建立连接
        String url ="jdbc:mysql://11.90.214.92:3306/hainiu49_3?useSSL=false&characterEncoding=UTF-8";
        String username = "root";
        String password = "hainiu";
        Connection connection = DriverManager.getConnection(url,username,password);

        //获取连接对象
        Statement statement = connection.createStatement();

        //语句
        String sql = " insert into category(cid,cname) values(6,'张进宝');";
        //执行操作
        ResultSet resultSet = statement.executeQuery(sql);
        //集合容器
        ArrayList<Category> list = new ArrayList<>();
        while (resultSet.next()){
            int cid = resultSet.getInt("cid");
            String cname = resultSet.getString("cname");
            //封装成Java对象
            Category category = new Category(cid,cname);
            list.add(category);
        }
        //将集合对象传递给下一步的业务
        for (Category category : list) {
            System.out.println(category);

        }
        //释放资源
        statement.close();
        connection.close();

    }




























































}
