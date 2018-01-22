package com.myblog.service;

import com.myblog.entity.Notice;

import java.util.List;

/**
 * 公告
 * Created by HJL on 2018/1/19.
 */
public interface INoticeService {

    //添加公告
    public boolean addNotices(Notice notice);

    //查询公告
    public List getAllNotice();
}
