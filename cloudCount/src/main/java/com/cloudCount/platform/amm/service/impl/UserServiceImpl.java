package com.cloudCount.platform.amm.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.cloudCount.platform.amm.dao.impl.UserMapper;
import com.cloudCount.platform.amm.model.User;
import com.cloudCount.platform.amm.service.UserService;

//@Transactional
// @Service
// @Component
// @Transactional(value="baseTransactionManager")
@Service("userService")
public class UserServiceImpl implements UserService{
	
	/**
	 * 
	 */
	@Autowired
	private UserMapper userMapper;
	
	/**
	 * add user
	 */
	public void addUser(User user){
		userMapper.addUser(user);
	}

	public UserMapper getUserMapper() {
		return userMapper;
	}

	public void setUserMapper(UserMapper userMapper) {
		this.userMapper = userMapper;
	}
}
