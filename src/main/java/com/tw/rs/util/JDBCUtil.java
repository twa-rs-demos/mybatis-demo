package com.tw.rs.util;

import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;

import java.io.IOException;
import java.io.InputStream;

/**
 * Created by zhyingjia on 16-10-14.
 */
public class JDBCUtil {
    public static SqlSessionFactory  sqlSessionFactory = null;
    static {
        try {
            //将配置文件读取到输入流中
            String resource = "mybatis/mybatis-config.xml";
            InputStream reader = Resources.getResourceAsStream(resource);
            //创建SqlSessionFactory对象，解析reader对象中的内容,利用反射创建SqlSessionFactory对象.
            sqlSessionFactory = new SqlSessionFactoryBuilder().build(reader);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
    public static SqlSession getSession(){
        return sqlSessionFactory.openSession();
    }

    public static void colseSession(SqlSession session){
        if(session != null){
            session.close();
        }
    }
}

