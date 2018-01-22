package com.myblog.dao.impl;

import com.myblog.dao.IUsersDao;
import com.myblog.entity.Users;
import org.springframework.stereotype.Repository;

import java.util.List;

/**
 * 用户使用的dao层接口实现类
 * @author Administrator
 *
 */
@Repository("userDao")
public class UsersDaoImpl extends BaseDao implements IUsersDao{
	/**
	 * 添加用户
	 */
	@Override
	public boolean addUser(Users user) {
		getSession().save(user);
		return true;
	}
	/**
	 * 查询用户
	 */
	@Override
	public List<Users> findUserList(String hql) {
		return getSession().createQuery(hql).list();
	}


	/**
	 *修改用户
	 */
	@Override
	public boolean updateUser(Users user) {
		getSession().update(user);
		return true;
	}
	
	/**
	 * 获取用户ID
	 */
	@Override
	public Users getUserById(String id) {
		return getSession().get(Users.class,id);
	}
		
}
