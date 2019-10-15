package com.yuqi.jpalearning;

import com.yuqi.jpalearning.interceptor.IpAndMessageInterceptor;
import org.mybatis.spring.annotation.MapperScan;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.servlet.config.annotation.InterceptorRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;


/**
 *
 *
 * WebMvcAutoConfiguration.WebMvcAutoConfigurationAdapter 是mvc 配置的核心
 * WebMvcConfigurer 这个是为了添加拦截器
 */

@SpringBootApplication
@MapperScan(value = {"com.yuqi.jpalearning.mapper"})
public class JpaLearningApplication implements WebMvcConfigurer {

    @Autowired
    private IpAndMessageInterceptor ipAndMessageInterceptor;

    public static void main(String[] args) {
        SpringApplication.run(JpaLearningApplication.class, args);
    }


    public void addInterceptors(InterceptorRegistry registry) {
        registry.addInterceptor(ipAndMessageInterceptor);
    }
}
