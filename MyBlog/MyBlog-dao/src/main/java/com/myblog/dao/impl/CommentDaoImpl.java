package com.myblog.dao.impl;

import com.myblog.dao.ICommentDao;
import com.myblog.entity.Comment;
import org.springframework.stereotype.Repository;

import java.util.List;

/**
 * Created by HJL on 2018/1/16.
 */
@Repository("commentDao")
public class CommentDaoImpl extends BaseDao implements ICommentDao{


    /**
     * 发布评论
     * @param comment
     * @return
     */
    @Override
    public boolean addComment(Comment comment) {
        getSession().save(comment);
        return true;
    }

    @Override
    public List getAllCounts(String hql) {
        return getSession().createQuery(hql).list();
    }

    /**
     * 修改审核评论状态
     * @param comment
     * @return
     */
    @Override
    public boolean updateComment(Comment comment) {
        getSession().update(comment);
        return true;
    }

    /**
     * 根据Id查询
     * @param id
     * @return
     */
    @Override
    public Comment findCommentId(int id) {
        return getSession().get(Comment.class,id);
    }
}
