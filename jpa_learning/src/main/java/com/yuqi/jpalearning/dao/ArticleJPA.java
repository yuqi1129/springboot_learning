package com.yuqi.jpalearning.dao;

import com.yuqi.jpalearning.model.Article;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;

import java.io.Serializable;

/**
 * @author yuqi
 * @mail yuqi5@xiaomi.com
 * @description
 * @time 14/10/19 15:55
 **/
public interface ArticleJPA extends JpaRepository<Article, Integer>, JpaSpecificationExecutor<Article>, Serializable {
}
