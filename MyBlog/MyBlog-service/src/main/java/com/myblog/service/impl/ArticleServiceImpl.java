package com.myblog.service.impl;

import com.myblog.dao.IArticleDao;
import com.myblog.entity.Article;
import com.myblog.entity.PageBean;
import com.myblog.service.IArticleService;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

import javax.annotation.Resource;
import java.util.List;
@Service("articleService")
@Transactional(propagation = Propagation.REQUIRED)
public class ArticleServiceImpl  implements IArticleService{
    @Resource(name = "articleDao")
    private IArticleDao articleDao;

    @Override
    public List findArticleList() {
        String hql="from Article";
        return articleDao.findArticleList(hql);
    }

    /**
     * 分页带条件查询文章信息
     * @param bean		分页查询信息
     * @param querys	查询条件
     * @return		返回查询到分页带条件查询后的信息
     */
    @Override
    public PageBean findArticleForPage(PageBean bean, String[] querys) {
        String hql=" SELECT a,c from Article a left join Comment c on a.articleId=c.comments.articleId where 1=1 ";
        if(querys!=null&&querys.length>0){
            //按题目
            if(querys[0]!=null&&querys[0].length()>0){
                hql+=" and a.articleTitle like '%"+querys[0]+"%' ";
            }
            //按类型
            if(querys[1]!=null&&querys[1].length()>0){
                hql+=" and a.articleType like '%"+querys[1]+"%' ";
            }
            //按时间
            if(querys[2]!=null&&querys[2].length()>0){
                hql+=" and a.articleTime='"+querys[2]+"' ";
            }
        }
        //排序
        hql+=" GROUP BY a.articleId ORDER BY a.articleTime DESC ";
        bean.setData(articleDao.findArticleList(hql,bean));	    //	获取当前页的数据
        bean.setAllNum(articleDao.findArticleList(hql).size());	//总数据条数
        return bean;
    }

    /**
     * 根据ID查询文章
     * @param id
     * @return
     */
    @Override
    public Article findArticleDetail(int id) {
        return articleDao.findArticleDetail(id);
    }

    @Override
    public boolean updateClickCount(Article article) {
        return articleDao.updateClickCount(article);
    }

    @Override
    public boolean addTbArticle(Article article) {
        return articleDao.addTbArticle(article);
    }

    public IArticleDao getArticleDao() {
        return articleDao;
    }

    public void setArticleDao(IArticleDao articleDao) {
        this.articleDao = articleDao;
    }


}
