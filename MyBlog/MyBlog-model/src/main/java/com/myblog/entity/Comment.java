package com.myblog.entity;

import javax.persistence.*;
import java.io.Serializable;
import java.util.Date;

/**
 * 评论
 */
@Entity
@Table(name = "comment")
public class Comment implements Serializable {

	private int  cno;
	private String content;		//评论内容
	private Date commentTime;		//评论时间
    private int cstate=0; // 审核状态  0 待审核 1 审核通过

    //建立多个评论对应一个用户的映射关系
    private Users blogger;

    //建立多个评论对应一个文章的映射关系
    private Article comments;

	public Comment() {
	}

    public Comment(int cno, String content, Date commentTime, int cstate, Users blogger, Article comments) {
        this.cno = cno;
        this.content = content;
        this.commentTime = commentTime;
        this.cstate = cstate;
        this.blogger = blogger;
        this.comments = comments;
    }

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    public int getCno() {
        return cno;
    }

    public void setCno(int cno) {
        this.cno = cno;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }

    @Column(columnDefinition="date")
    public Date getCommentTime() {
        return commentTime;
    }

    public void setCommentTime(Date commentTime) {
        this.commentTime = commentTime;
    }

    public int getCstate() {
        return cstate;
    }

    public void setCstate(int cstate) {
        this.cstate = cstate;
    }

    @ManyToOne(cascade = CascadeType.REFRESH,fetch = FetchType.EAGER)
    @JoinColumn(name="userId")
    public Users getBlogger() {
        return blogger;
    }

    public void setBlogger(Users blogger) {
        this.blogger = blogger;
    }

    @ManyToOne(cascade = CascadeType.REFRESH,fetch = FetchType.EAGER)
    @JoinColumn(name="commentId")
    public Article getComments() {
        return comments;
    }

    public void setComments(Article comments) {
        this.comments = comments;
    }
}