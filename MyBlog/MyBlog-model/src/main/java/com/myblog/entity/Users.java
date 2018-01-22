package com.myblog.entity;

import javax.persistence.*;

/**
 * 信息
 */
@Entity
@Table(name = "blogger")
public class Users {

	private int bno; // 编号
	private String bname; // 用户名
	private String bpwd; // 密码
	private String bnickName; // 昵称
	private String bsign; // 个性签名
	private String bproFile; // 个人简介
	private String bimage; // 博主头像

    private String bSex;				    	//性别
    private String bTel;					//电话
    private String bAddress;				//地址
    private String bhobby;					//爱好
    private String bemail;						//邮箱
    private int state=1;                //1为普通用户，2为博主

	public Users() {
	}

    public Users(int bno, String bname, String bpwd, String bnickName, String bsign, String bproFile, String bimage, String bSex, String bTel, String bAddress, String bhobby, String bemail, int state) {
        this.bno = bno;
        this.bname = bname;
        this.bpwd = bpwd;
        this.bnickName = bnickName;
        this.bsign = bsign;
        this.bproFile = bproFile;
        this.bimage = bimage;
        this.bSex = bSex;
        this.bTel = bTel;
        this.bAddress = bAddress;
        this.bhobby = bhobby;
        this.bemail = bemail;
        this.state = state;
    }

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    public int getBno() {
        return bno;
    }

    public void setBno(int bno) {
        this.bno = bno;
    }

    public String getBname() {
        return bname;
    }

    public void setBname(String bname) {
        this.bname = bname;
    }

    public String getBpwd() {
        return bpwd;
    }

    public void setBpwd(String bpwd) {
        this.bpwd = bpwd;
    }

    public String getBnickName() {
        return bnickName;
    }

    public void setBnickName(String bnickName) {
        this.bnickName = bnickName;
    }

    public String getBsign() {
        return bsign;
    }

    public void setBsign(String bsign) {
        this.bsign = bsign;
    }

    public String getBproFile() {
        return bproFile;
    }

    public void setBproFile(String bproFile) {
        this.bproFile = bproFile;
    }

    public String getBimage() {
        return bimage;
    }

    public void setBimage(String bimage) {
        this.bimage = bimage;
    }

    public String getbSex() {
        return bSex;
    }

    public void setbSex(String bSex) {
        this.bSex = bSex;
    }

    public String getbTel() {
        return bTel;
    }

    public void setbTel(String bTel) {
        this.bTel = bTel;
    }

    public String getbAddress() {
        return bAddress;
    }

    public void setbAddress(String bAddress) {
        this.bAddress = bAddress;
    }

    public String getBhobby() {
        return bhobby;
    }

    public void setBhobby(String bhobby) {
        this.bhobby = bhobby;
    }

    public String getBemail() {
        return bemail;
    }

    public void setBemail(String bemail) {
        this.bemail = bemail;
    }

    public int getState() {
        return state;
    }

    public void setState(int state) {
        this.state = state;
    }

}
