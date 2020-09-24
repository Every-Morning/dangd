package com.jxny.util;

import com.alibaba.druid.pool.DruidDataSourceFactory;

import javax.sql.DataSource;
import java.io.FileInputStream;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.util.Properties;

public class JDBCutil {
private static DataSource dataSource;
static{
    try{
        Properties properties = new Properties();
        String path ="druid.properties";
        InputStream in=JDBCutil.class.getClassLoader().getResourceAsStream(path);
        properties.load(in);
        dataSource= DruidDataSourceFactory.createDataSource(properties);
}catch (Exception e){
    e.printStackTrace();
    }
}
public static DataSource getDataSource(){
    return dataSource;
}

}
