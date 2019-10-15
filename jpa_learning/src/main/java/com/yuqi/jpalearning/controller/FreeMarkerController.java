package com.yuqi.jpalearning.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * @author yuqi
 * @mail yuqi5@xiaomi.com
 * @description
 * @time 15/10/19 11:52
 **/
@Controller
public class FreeMarkerController {

    @RequestMapping(value = "/test1")
    public String testFreeMarker(ModelMap modelMap) {
        modelMap.addAttribute("content", "this is a free test from yuqi");
        return "freemarker";
    }
}
