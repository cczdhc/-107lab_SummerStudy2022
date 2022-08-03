package com.atguigu.jdbc;

import com.alibaba.druid.pool.DruidDataSource;

import java.io.IOException;
import java.io.InputStream;
import java.sql.Connection;
import java.sql.SQLException;
import java.util.Properties;

//读取外部配置文件设置连接池
public class Demo04Druid {
    public static void main(String[] args) throws SQLException, IOException {

        Properties properties = new Properties();
        InputStream is = Demo04Druid.class.getClassLoader().getResourceAsStream("jdbc.properties");
        properties.load(is);
        DruidDataSource dataSource = new DruidDataSource();

        dataSource.setDriverClassName(properties.getProperty("jdbc.driverClassName"));
        dataSource.setUrl(properties.getProperty("jdbc.url"));
        dataSource.setUsername(properties.getProperty("jdbc.username"));
        dataSource.setPassword(properties.getProperty("jdbc.pwd"));
        dataSource.setInitialSize(Integer.parseInt(properties.getProperty("jdbc.initSize")));
        dataSource.setMaxActive(Integer.parseInt(properties.getProperty("jdbc.maxActive")));
        dataSource.setMaxWait(Long.parseLong(properties.getProperty("jdbc.maxWait")));

        for(int i = 0 ; i<10 ; i++){
            Connection conn1 = dataSource.getConnection();
            System.out.println(i+"-------->"+conn1);

        }
    }
}

