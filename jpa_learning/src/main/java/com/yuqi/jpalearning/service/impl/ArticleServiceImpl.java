package com.yuqi.jpalearning.service.impl;

import com.yuqi.jpalearning.dao.ArticleJPA;
import com.yuqi.jpalearning.model.Article;
import com.yuqi.jpalearning.service.ArticleService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @author yuqi
 * @mail yuqi5@xiaomi.com
 * @description
 * @time 14/10/19 15:58
 **/

@Service
public class ArticleServiceImpl implements ArticleService {

    @Autowired
    private ArticleJPA articleJPA;


    public List<Article> getAllArticle() {
        return articleJPA.findAll();
    }
}
