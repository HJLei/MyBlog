package com.myblog.dao.impl;

import com.myblog.dao.IArticleDao;
import com.myblog.entity.Article;
import com.myblog.entity.PageBean;
import org.hibernate.Query;
import org.hibernate.Session;
import org.springframework.stereotype.Repository;

import java.util.List;
@Repository("articleDao")
public class ArticleDaoImpl extends BaseDao implements IArticleDao{
    /**
     * 单独查询文章信息
     * @param hql
     * @return
     */
    @Override
    public List findArticleList(String hql) {
        return getSession().createQuery(hql).list();
    }

    /**
     * 分页查询
     * @param hql
     * @param bean
     * @return
     */
    @Override
    public List findArticleList(String hql, PageBean bean) {
        Query query=getSession().createQuery(hql);
        //设置分页
        query.setFirstResult((bean.getCpage()-1)*bean.getShowNum());//从哪里开始
        query.setMaxResults(bean.getShowNum());		//设置每页查询几条数据
        List list=query.list();//执行查询
        return list;
    }

    /**
     * 根据ID查询文章
     * @param id
     * @return
     */
    @Override
    public Article findArticleDetail(int id) {
        return getSession().get(Article.class,id);
    }

    /**
     * 修改点击量
     * @param article
     * @return
     */
    @Override
    public boolean updateClickCount(Article article) {
        try {
            getSession().update(article);
            return true;
        }catch (Exception e){
            e.printStackTrace();
        }
        return false;
    }

    /**
     * 添加文章
     * @param article
     * @return
     */
    @Override
    public boolean addTbArticle(Article article) {
        getSession().save(article);
        return true;
    }


}
