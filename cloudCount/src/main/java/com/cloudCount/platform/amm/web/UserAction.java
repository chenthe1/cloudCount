package com.cloudCount.platform.amm.web;

import java.io.IOException;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.annotation.ReadOnlyProperty;
import org.springframework.stereotype.Component;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.cloudCount.platform.amm.model.User;
import com.cloudCount.platform.amm.service.UserService;


@Component
@RequestMapping("/login.do")
public class UserAction {
	
	/**
	 * UserService
	 */
	@Autowired
	public UserService userServiceImpl;
	
	/**
	 * ���׵�¼
	 * @param req
	 * @param map
	 * @return
	 * @throws IOException
	 */
	@ResponseBody
	@ReadOnlyProperty
	@RequestMapping(params="method=login")
	public String loginAction(HttpServletRequest req, ModelMap map) throws IOException {
		String userName = req.getParameter("userName");
		String userPassword = req.getParameter("userPassword");
		
		User user = new User();
		//user.setId(11);
		user.setUserName(userName);
		user.setUserPassword(userPassword);
		
		System.out.println(userName);
		System.out.println(userPassword);
		// assert aadc = "dd";
		
		userServiceImpl.addUser(user);
		return userPassword;
	}

}
