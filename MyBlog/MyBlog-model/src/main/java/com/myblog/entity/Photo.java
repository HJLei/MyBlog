package com.myblog.entity;

import javax.persistence.*;
import java.io.Serializable;
import java.sql.Timestamp;
import java.util.Date;

/**
 * 照片
 */
@Entity
@Table(name = "photo")
public class Photo implements Serializable {

	private int id;
	private String photoType;			//类型
	private String photoName;			//图片名称
	private Date photoTime;			//添加时间

	public Photo() {
	}

	public Photo(int  id, String photoType, String photoName, Date photoTime) {
		this.id = id;
		this.photoType = photoType;
		this.photoName = photoName;
		this.photoTime = photoTime;
	}

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getPhotoType() {
		return photoType;
	}

	public void setPhotoType(String photoType) {
		this.photoType = photoType;
	}

	public String getPhotoName() {
		return photoName;
	}

	public void setPhotoName(String photoName) {
		this.photoName = photoName;
	}

    @Column(columnDefinition="date")
	public Date getPhotoTime() {
		return photoTime;
	}

	public void setPhotoTime(Date photoTime) {
		this.photoTime = photoTime;
	}
}