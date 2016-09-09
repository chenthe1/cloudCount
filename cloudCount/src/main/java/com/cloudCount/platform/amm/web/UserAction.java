package com.cloudCount.platform.amm.web;

import java.io.IOException;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
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
	 * 登录
	 * @param req
	 * @param map
	 * @return
	 * @throws IOException
	 */
	// @ResponseBody
	// @ReadOnlyProperty
	@RequestMapping(params="method=login")
	public String loginAction(HttpServletRequest req, ModelMap map, HttpServletResponse response) throws IOException {
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
		
		req.setAttribute("requestScope.IP", userName);
		
		// Cookie cookie=new Cookie("JSESSIONID", req.getCookies().toString());  
		Cookie cookie=new Cookie("token", req.getRequestedSessionId());  
		
		req.getRequestedSessionId();
        response.addCookie(cookie);  
        
		
		return "succeed";
	}

}
