package com.myblog.service;

import com.myblog.entity.Article;
import com.myblog.entity.PageBean;

import java.util.List;

public interface IArticleService {
    /**
     * 查询出文章
     * @return
     */
    public List findArticleList();

    /**
     * 分页查询
     * @return
     */
    public  PageBean findArticleForPage(PageBean bean,String[] querys);

    public Article findArticleDetail(int id);

    /**
     * 修改点击量+1
     * @param article
     * @return
     */
    public boolean updateClickCount(Article article);

    //添加文章
    public boolean addTbArticle(Article article);
}
