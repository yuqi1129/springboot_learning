package com.yuqi.spring.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author yuqi
 * @mail yuqi5@xiaomi.com
 * @description
 * @time 14/10/19 14:09
 **/
@RestController
@RequestMapping("/")
public class WelcomeController {

    @RequestMapping("welcome")
    public String welcome() {
        return "Welcome to nice";
    }
}
