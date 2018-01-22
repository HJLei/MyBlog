package com.myblog.web;

import com.myblog.entity.Article;
import com.myblog.entity.Comment;
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

/**
 * Created by HJL on 2018/1/16.
 */
@Controller("commentAction")
@Scope("prototype")
public class CommentAction {

    /**声明需要依赖的服务层*/
    @Resource(name="commentService")
    private ICommentService commentService;

    private int msg;
    private Comment comment;
    private List commentList;//存储查询出来的评论信息
    /**
     * 发布评论
     * @return
     */
    public String ReleaseComments(){
        String d=new SimpleDateFormat("yyyy-MM-dd").format(Calendar.getInstance().getTime());
        SimpleDateFormat sdf=new SimpleDateFormat("yyyy-MM-dd");
        try {
            Date date=sdf.parse(d);
            comment.setCommentTime(date);
        } catch (ParseException e) {
            e.printStackTrace();
        }
        if (commentService.addComment(comment)){
            msg=1;
        }else {
            msg=-1;
        }
        return "addSuccess";
    }

    /**
     * 后台查询评论
     * @return
     */
    public String commentList(){
        commentList=commentService.getFindCounts();
        return "commentList";
    }

    /**
     * 审核评论
     * @return
     */
    public String updateComment(){
        if (commentService.updateComment(comment)){
            msg=1;
        }else {
            msg=-1;
        }
        return "updateComment";
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

    public Comment getComment() {
        return comment;
    }

    public void setComment(Comment comment) {
        this.comment = comment;
    }

    public List getCommentList() {
        return commentList;
    }

    public void setCommentList(List commentList) {
        this.commentList = commentList;
    }
}
