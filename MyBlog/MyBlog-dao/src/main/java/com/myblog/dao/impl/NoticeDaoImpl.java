package com.myblog.dao.impl;

import com.myblog.dao.INoticeDao;
import com.myblog.entity.Notice;
import org.springframework.stereotype.Repository;

import java.util.List;

/**
 * Created by HJL on 2018/1/19.
 */
@Repository("noticeDao")
public class NoticeDaoImpl extends BaseDao implements INoticeDao{

    /**
     * 发布公告
     * @param notice
     * @return
     */
    @Override
    public boolean addNotices(Notice notice) {
        getSession().save(notice);
        return true;
    }

    /**
     * 查询公告
     * @param hql
     * @return
     */
    @Override
    public List getAllNotice(String hql) {
        return getSession().createQuery(hql).list();
    }
}
