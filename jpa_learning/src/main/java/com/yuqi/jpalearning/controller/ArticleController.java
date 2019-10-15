package com.yuqi.jpalearning.controller;

import com.yuqi.jpalearning.aux.ResponseResult;
import com.yuqi.jpalearning.enumclass.ResponseCode;
import com.yuqi.jpalearning.model.Article;
import com.yuqi.jpalearning.service.ArticleService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * @author yuqi
 * @mail yuqi5@xiaomi.com
 * @description
 * @time 14/10/19 15:59
 **/

@RestController
@RequestMapping(value = "/article")
public class ArticleController {

    @Autowired
    private ArticleService articleService;

    @RequestMapping(value = "/all", method = RequestMethod.GET)
    public ResponseResult<List<Article>> getAllArticle() {
        List<Article> articles = articleService.getAllArticle();
        return new ResponseResult<List<Article>>(articles,
                ResponseCode.SUCCESS.getCode(), ResponseCode.SUCCESS.getMessage());
    }





}
