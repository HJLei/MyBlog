package com.myblog.dao;

import com.myblog.entity.Comment;

import java.util.List;

public interface ICommentDao {

	/**
	 * 发布评论
	 * @param comment
	 */
	public boolean addComment(Comment comment);
	
	//public List<Comment> findCommentsByPage(int pageNo, int pageSize);

	/**
	 * 查询评论
	 * @return
	 */
	public List getAllCounts(String hql);

	/**
	 * 修改审核评论状态
	 * @param comment
	 * @return
	 */
	public boolean updateComment(Comment comment);

	/**
	 * 根据id查询
	 * @param id
	 * @return
	 */
	public Comment findCommentId(int id);
	
//	public List<Comment> findComments();
//
//	public Comment getComment(int commentId);
//	public void delComment(Comment comment);
//
//	public void todelComment(String[] commentId);

}
