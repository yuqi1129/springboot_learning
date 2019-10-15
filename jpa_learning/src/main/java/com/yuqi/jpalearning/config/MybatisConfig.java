package com.yuqi.jpalearning.config;

import com.alibaba.druid.pool.DruidDataSource;
import org.apache.ibatis.session.SqlSessionFactory;
import org.mybatis.spring.SqlSessionFactoryBean;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.autoconfigure.jdbc.DataSourceProperties;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import javax.sql.DataSource;

/**
 * @author yuqi
 * @mail yuqi5@xiaomi.com
 * @description  这个是为了解决
 *  java.lang.IllegalArgumentException: Property 'sqlSessionFactory' or 'sqlSessionTemplate' are required
 *  问题
 * @time 14/10/19 17:15
 **/
@Configuration
public class MybatisConfig {
    @Autowired
    private DataSourceProperties dataSourceProperties;


    @Bean(name = "dataSource")
    public DataSource dataSource() {
        DruidDataSource dataSource = new DruidDataSource();
        dataSource.setUrl(dataSourceProperties.getUrl());
        System.out.println(dataSourceProperties.getUrl());
        dataSource.setDriverClassName(dataSourceProperties.getDriverClassName());
        dataSource.setUsername(dataSourceProperties.getUsername());
        dataSource.setPassword(dataSourceProperties.getPassword());
        return dataSource;
    }

    /**
     * bug 诊断
     *
     * 1. 在低版本的时候，会自动注入SqlSessionFactory, 而读取xml文件就是在这个逻辑中，下面代码就没有什么用
     * 2. 在高版本中,取消了自动注入, 需要手动注入
     *
     * @return
     * @throws Exception
     */
    //@Bean
    public SqlSessionFactory sqlSessionFactory() throws Exception {
        SqlSessionFactoryBean sqlSessionFactoryBean = new SqlSessionFactoryBean();
        sqlSessionFactoryBean.setDataSource(dataSource());
        return sqlSessionFactoryBean.getObject();
    }
}
