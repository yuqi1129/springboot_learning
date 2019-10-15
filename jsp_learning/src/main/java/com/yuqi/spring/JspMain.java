package com.yuqi.spring;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * @author yuqi
 * @mail yuqi5@xiaomi.com
 * @description
 * @time 14/10/19 12:03
 **/

@SpringBootApplication
public class JspMain {
    public static void main(String[] args) {
        SpringApplication.run(JspMain.class);
    }

    @RequestMapping("/index")
    public String index() {
        return "Welecome to test";
    }
}
