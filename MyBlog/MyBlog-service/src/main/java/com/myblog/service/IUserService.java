package com.myblog.service;


import com.myblog.entity.Users;

import java.util.List;


/**
 * 提供用户服务的serService接口
 * @author Administrator
 *
 */
public interface IUserService {
	/**
	 *
	 * @param user
	 * @return
	 */
	public boolean addUser(Users user);
	
	/**
	 * 查询用户
	 * @return
	 */
	public List<Users> findUserList();

	public List<Users> findMyInfo();

	/**
	 * 更改用户
	 * @param user
	 * @return
	 */
	public boolean updateUser(Users user);

	/**
	 * 处理用户登录操作
	 * @param user
	 * @return
	 */
	public Users doLogin(Users user);

    public Users getUserById(String id);
}
