package com.myblog.service.impl;


import com.myblog.dao.IUsersDao;
import com.myblog.entity.Users;
import com.myblog.service.IUserService;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

import javax.annotation.Resource;
import java.util.List;


/**
 * 提供用户服务的实现类
 * @author Administrator
 *
 */
@Service("userService")
@Transactional(propagation= Propagation.REQUIRED)
public class UserServiceImpl implements IUserService{


	    /**
		 * 提供需要依赖的dao层
		 */
		@Resource(name="userDao")
		private IUsersDao userDao;

	/**
	 * 查询博主信息
	 * @return
	 */
	@Override
		public List<Users> findMyInfo() {
			String hql="from Users u where u.bname='lei'";
			return userDao.findUserList(hql);
		}
		/**
		 * 添加用户
		 */
		@Override
		public boolean addUser(Users user) {
			return userDao.addUser(user);
		}
		
		/**
		 * 查询用户
		 */
		@Override
		public List<Users> findUserList() {
			return userDao.findUserList("from user");
		}

		/**
		 *
		 * @param user
		 * @return
		 */
		@Override
		public boolean updateUser(Users user) {
			return userDao.updateUser(user);
		}

		/**
		 * 处理用户登录
		 */
		@Override
		public Users doLogin(Users user) {
			String hql="from Users u where u.bname='"+user.getBname()+"'";
			//取出同名的所有用户
			List<Users> list=userDao.findUserList(hql);
			if(list!=null&&list.size()>0){
				for (Users users : list) {
					if(users.getBname().equals(user.getBname())&&users.getBpwd().equals(user.getBpwd())){
						return users;
					}
				}
			}
			return null;
		}

        @Override
        public Users getUserById(String id) {
            return userDao.getUserById(id);
        }

        public IUsersDao getUserDao() {
            return userDao;
        }

        public void setUserDao(IUsersDao userDao) {
            this.userDao = userDao;
        }
}
