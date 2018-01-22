package com.myblog.service.impl;

import com.myblog.dao.ICommentDao;
import com.myblog.dao.IUsersDao;
import com.myblog.entity.Comment;
import com.myblog.service.ICommentService;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

import javax.annotation.Resource;
import java.util.List;

/**
 * Created by HJL on 2018/1/16.
 */
@Service("commentService")
@Transactional(propagation= Propagation.REQUIRED)
public class CommentServiceImpl implements ICommentService  {

    /**
     * 提供需要依赖的dao层
     */
    @Resource(name="commentDao")
    private ICommentDao commentDao;

    //发布评论
    @Override
    public boolean addComment(Comment comment) {
        return commentDao.addComment(comment);
    }

    /**
     * 根据Id查询评论
     * @param id        //文章Id
     * @return
     */
    @Override
    public List getAllCounts(int id) {
        String hql="select  b.bname,c.commentTime,c.content " +
                " FROM Users AS b  left join " +
                " Comment AS c " +
                " on " +
                " b.bno=c.blogger.bno " +
                " where commentId="+id+" and cstate=1 " +
                " GROUP BY " +
                " c.commentTime";
        return commentDao.getAllCounts(hql);
    }

    /**
     * 后台查询所有评论
     * @return
     */
    @Override
    public List getFindCounts() {
        String hql="select  b.bname,c.commentTime,c.content ,c.cstate,c.cno " +
                " FROM Users AS b  right join Comment AS c on  b.bno=c.blogger.bno order BY c.commentTime desc";
        return commentDao.getAllCounts(hql);
    }

    /**
     * 审核
     * @param comment
     * @return
     */
    @Override
    public boolean updateComment(Comment comment) {
        comment=commentDao.findCommentId(comment.getCno());
        comment.setCstate(1);
        return commentDao.updateComment(comment);
    }

    public ICommentDao getCommentDao() {
        return commentDao;
    }

    public void setCommentDao(ICommentDao commentDao) {
        this.commentDao = commentDao;
    }
}
