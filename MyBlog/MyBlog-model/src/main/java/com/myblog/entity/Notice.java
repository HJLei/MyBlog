package com.myblog.entity;

import javax.persistence.*;
import java.io.Serializable;
import java.sql.Timestamp;
import java.util.Date;

/**
 * 通知
 */
@Entity
@Table(name = "notice")
public class Notice implements Serializable {

	private int nno;
	private String title;               //公告标题
	private String notices;             //公告内容
	private Date time;                 //发布时间　
	private String code;				//html代码
	public Notice() {
	}

	public Notice(int nno, String title, String notices, Date time, String code) {
		this.nno = nno;
		this.title = title;
		this.notices = notices;
		this.time = time;
		this.code = code;
	}

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
    public int getNno() {
        return nno;
    }

    public void setNno(int nno) {
        this.nno = nno;
    }

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public String getNotices() {
		return notices;
	}

	public void setNotices(String notices) {
		this.notices = notices;
	}

    @Column(columnDefinition="date")
	public Date getTime() {
		return time;
	}

	public void setTime(Date time) {
		this.time = time;
	}

	public String getCode() {
		return code;
	}

	public void setCode(String code) {
		this.code = code;
	}
}