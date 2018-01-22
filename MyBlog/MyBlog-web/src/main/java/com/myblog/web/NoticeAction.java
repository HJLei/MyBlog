package com.myblog.web;

import com.myblog.entity.Notice;
import com.myblog.service.INoticeService;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Controller;

import javax.annotation.Resource;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.List;

/**
 * 公告
 * Created by HJL on 2018/1/19.
 */
@Controller("noticeAction")
@Scope("prototype")
public class NoticeAction {

    /**声明需要依赖的服务层*/
    @Resource(name = "noticeService")
    private INoticeService noticeService;

    private int msg;
    private Notice notice;
    private List noticeList;



    //发布公告
    public String addNotices(){
        String d=new SimpleDateFormat("yyyy-MM-dd").format(Calendar.getInstance().getTime());
        SimpleDateFormat sdf=new SimpleDateFormat("yyyy-MM-dd");
        try {
            Date date=sdf.parse(d);
            notice.setTime(date);
        } catch (ParseException e) {
            e.printStackTrace();
        }
        if (noticeService.addNotices(notice)){
            msg=1;
        }else {
            msg=-1;
        }
        return "addNotices";
    }

    public String noticeList(){
        noticeList=noticeService.getAllNotice();
        return "noticeList";
    }

    //查询评论
    public INoticeService getNoticeService() {
        return noticeService;
    }

    public void setNoticeService(INoticeService noticeService) {
        this.noticeService = noticeService;
    }

    public int getMsg() {
        return msg;
    }

    public void setMsg(int msg) {
        this.msg = msg;
    }

    public Notice getNotice() {
        return notice;
    }

    public void setNotice(Notice notice) {
        this.notice = notice;
    }

    public List getNoticeList() {
        return noticeList;
    }

    public void setNoticeList(List noticeList) {
        this.noticeList = noticeList;
    }
}
