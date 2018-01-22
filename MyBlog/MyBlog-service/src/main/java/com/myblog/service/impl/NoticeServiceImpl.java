package com.myblog.service.impl;

import com.myblog.dao.INoticeDao;
import com.myblog.entity.Comment;
import com.myblog.entity.Notice;
import com.myblog.service.ICommentService;
import com.myblog.service.INoticeService;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

import javax.annotation.Resource;
import java.util.List;

/**
 * Created by HJL on 2018/1/19.
 */
@Service("noticeService")
@Transactional(propagation= Propagation.REQUIRED)
public class NoticeServiceImpl  implements INoticeService{

    /**
     * 提供需要依赖的dao层
     */
    @Resource(name="noticeDao")
    private INoticeDao noticeDao;

    /**
     * 发布公告
     * @param notice
     * @return
     */
    @Override
    public boolean addNotices(Notice notice) {
        return noticeDao.addNotices(notice);
    }

    /**
     * 查询公告
     * @return
     */
    @Override
    public List getAllNotice() {
        String hql=" from Notice";
        return noticeDao.getAllNotice(hql);
    }

    public INoticeDao getNoticeDao() {
        return noticeDao;
    }

    public void setNoticeDao(INoticeDao noticeDao) {
        this.noticeDao = noticeDao;
    }
}
