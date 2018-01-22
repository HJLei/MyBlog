package com.myblog.dao;

import java.util.List;

import com.myblog.entity.Notice;

/**
 * 公告
 */
public interface INoticeDao {
	//添加公告
	public boolean addNotices(Notice notice);

	//查询公告
	public List getAllNotice(String hql);

}
