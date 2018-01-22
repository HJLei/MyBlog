package com.myblog.dao;

import com.myblog.entity.Article;
import com.myblog.entity.PageBean;

import java.util.List;

public interface IArticleDao {

	/**
	 * 单独查询出文章
	 * @param hql
	 * @return
	 */
	public List findArticleList(String hql);

	/**
	 *分页查询
	 * @param hql
	 * @param bean
	 * @return
	 */
	public  List findArticleList(String hql,PageBean bean);

    /**
     * 根据ID查询
     * @param id
     * @return
     */
	public Article findArticleDetail(int id);

	public  boolean updateClickCount(Article article);

	// 添加文章
	public boolean addTbArticle(Article article);


}
