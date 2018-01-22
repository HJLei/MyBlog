package com.myblog.entity;

import java.util.List;

/**
 * 封装分页信息工具类
 * @author Administrator
 *
 */
public class PageBean {

	private int cpage=1;		//当前页
	private int showNum=5;		//每页显示的条数,默认5条
	private int allPage=0;		//总页数
	private int allNum=0;		//总条数
	
	private List data;			//每页总数据

	public PageBean() {
	}

	public PageBean(int cpage, int showNum, int allPage, int allNum, List data) {
		super();
		this.cpage = cpage;
		this.showNum = showNum;
		this.allPage = allPage;
		this.allNum = allNum;
		this.data = data;
	}

	public int getCpage() {
		return cpage;
	}

	public void setCpage(int cpage) {
		this.cpage = cpage;
	}

	public int getShowNum() {
		return showNum;
	}

	public void setShowNum(int showNum) {
		this.showNum = showNum;
	}

	public int getAllPage() {
		return allPage;
		
	}

	public void setAllPage(int allPage) {
		this.allPage = allPage;
		
	}

	public int getAllNum() {
		return allNum;
	}

	//数据条数
	public void setAllNum(int allNum) {
		this.allNum = allNum;
		//计算总页数
		if(this.allNum%this.showNum==0){
			this.allPage=this.allNum/this.showNum;
		}
			this.allPage=this.allNum/this.showNum+1;
	}

	public List getData() {
		return data;
	}

	public void setData(List data) {
		this.data = data;
	}


	
	
}
