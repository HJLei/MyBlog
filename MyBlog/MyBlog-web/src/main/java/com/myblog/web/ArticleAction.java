package com.myblog.web;

import com.myblog.entity.Article;
import com.myblog.entity.Comment;
import com.myblog.entity.PageBean;
import com.myblog.service.IArticleService;
import com.myblog.service.ICommentService;
import com.opensymphony.xwork2.ActionContext;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Controller;

import javax.annotation.Resource;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.List;

@Controller("articleAction")
@Scope("prototype")
public class ArticleAction {

    private PageBean bean;	//封装分页信息
    private String[] querys;	//封装查询条件

    private int msg;
    private Article article;
    private List articleList;

    @Resource(name="articleService")
    private IArticleService articleService;
    @Resource(name="commentService")
    private ICommentService commentService;

    /**
     * 查询文章
     * @return
     */
    public String findArticleList(){
        ActionContext.getContext().put("articleList",articleService.findArticleList());
        return "findArticleList";
    }

    /**
     * 分页和模糊查询文章action
     * @return
     */
    public String findArticleForPage(){
        bean=articleService.findArticleForPage(bean, querys);
        ActionContext.getContext().put("articleList",articleService.findArticleList());
        return "findArticleForPage";
    }

    /**
     * 去到详细文章页
     * @return
     */
    public String articleDetail(){
        article=articleService.findArticleDetail(article.getArticleId());
        ActionContext.getContext().getSession().put("ArticleId", article.getArticleId());       //保存文章编号
        article.setClickCount(article.getClickCount()+1);       //点击详情页时，点击量+1
        articleService.updateClickCount(article);
        //获取评论信息
        ActionContext.getContext().put("commentList",commentService.getAllCounts(article.getArticleId()));

        return "articleDetail";
    }

    //添加文章
    public String addTbArticle(){
        String d=new SimpleDateFormat("yyyy-MM-dd").format(Calendar.getInstance().getTime());
        SimpleDateFormat sdf=new SimpleDateFormat("yyyy-MM-dd");
        try {
            Date date=sdf.parse(d);
            article.setArticleTime(date);       //记录添加文章时间
        } catch (ParseException e) {
            e.printStackTrace();
        }
        if(articleService.addTbArticle(article)){
            msg=1;
        }else{
            msg=-1;
        }
        return "addTbArticle";
    }
    public Article getArticle() {
        return article;
    }

    public void setArticle(Article article) {
        this.article = article;
    }

    public List getArticleList() {
        return articleList;
    }

    public void setArticleList(List articleList) {
        this.articleList = articleList;
    }

    public IArticleService getArticleService() {
        return articleService;
    }

    public void setArticleService(IArticleService articleService) {
        this.articleService = articleService;
    }

    public PageBean getBean() {
        return bean;
    }

    public void setBean(PageBean bean) {
        this.bean = bean;
    }

    public String[] getQuerys() {
        return querys;
    }

    public void setQuerys(String[] querys) {
        this.querys = querys;
    }

    public ICommentService getCommentService() {
        return commentService;
    }

    public void setCommentService(ICommentService commentService) {
        this.commentService = commentService;
    }

    public int getMsg() {
        return msg;
    }

    public void setMsg(int msg) {
        this.msg = msg;
    }
}

