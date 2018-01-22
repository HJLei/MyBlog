package com.myblog.dao;

import com.myblog.entity.Users;

import java.util.List;

public interface IUsersDao {

    /**
     * 注册用户
     * @param user
     * @return
     */
    public boolean addUser(Users user);

    /**
     * 查询用户
     * @param hql
     * @return
     */
    public List<Users> findUserList(String hql);


    /***
     * 更新用户
     * @param user
     * @return
     */
    public boolean updateUser(Users user);

    /**
     * 获取用户的ID
     * @param id
     * @return
     */
    public Users getUserById(String id);

}
