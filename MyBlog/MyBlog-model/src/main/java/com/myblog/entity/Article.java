package com.myblog.entity;

import javax.persistence.*;
import java.io.Serializable;
import java.util.Date;

/**
 * 文章表
 */
@Entity
@Table(name = "article")
public class Article implements Serializable {

	private int articleId;
	private String articleType;				//文章类型
	private String articleTitle;				//文章标题
	private String articleSummary;			//摘要描述
	private String articleContent;			//文章内容
	private Date articleTime;			        //发布(创建)时间
	private int clickCount;				    //点击(浏览)数
	private int replyCount;				    //文章回复数



	public Article() {
	}

    public Article(int articleId, String articleType, String articleTitle, String articleSummary, String articleContent, Date articleTime, int clickCount, int replyCount) {
        this.articleId = articleId;
        this.articleType = articleType;
        this.articleTitle = articleTitle;
        this.articleSummary = articleSummary;
        this.articleContent = articleContent;
        this.articleTime = articleTime;
        this.clickCount = clickCount;
        this.replyCount = replyCount;
    }
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    public int getArticleId() {
        return articleId;
    }

    public void setArticleId(int articleId) {
        this.articleId = articleId;
    }

    public String getArticleType() {
        return articleType;
    }

    public void setArticleType(String articleType) {
        this.articleType = articleType;
    }

    public String getArticleTitle() {
        return articleTitle;
    }

    public void setArticleTitle(String articleTitle) {
        this.articleTitle = articleTitle;
    }

    public String getArticleSummary() {
        return articleSummary;
    }

    public void setArticleSummary(String articleSummary) {
        this.articleSummary = articleSummary;
    }

    public String getArticleContent() {
        return articleContent;
    }

    public void setArticleContent(String articleContent) {
        this.articleContent = articleContent;
    }

    @Column(columnDefinition="date")
    public Date getArticleTime() {
        return articleTime;
    }

    public void setArticleTime(Date articleTime) {
        this.articleTime = articleTime;
    }

    public int getClickCount() {
        return clickCount;
    }

    public void setClickCount(int clickCount) {
        this.clickCount = clickCount;
    }

    public int getReplyCount() {
        return replyCount;
    }

    public void setReplyCount(int replyCount) {
        this.replyCount = replyCount;
    }
}