package com.myblog.service;


import com.myblog.entity.Comment;

import java.util.List;

/**
 * Created by HJL on 2018/1/16.
 */

public interface ICommentService {
    /**
     * 发布评论
     * @param comment
     * @return
     */
    public boolean addComment(Comment comment);

    /**
     * 根据Id查询评论
     * @param id
     * @return
     */
    public List getAllCounts(int id);

    /**
     * 后台查询所有评论
     * @return
     */
    public List getFindCounts();

    /**
     * 审核
     * @param comment
     * @return
     */
    public boolean updateComment(Comment comment);
}
