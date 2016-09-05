package com.cloudCount.platform.amm.web;

import java.io.IOException;
import java.util.HashMap;

import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import javax.xml.bind.DatatypeConverter;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.annotation.ReadOnlyProperty;
import org.springframework.stereotype.Component;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.auth0.jwt.JWTSigner;
import com.cloudCount.platform.amm.model.User;
import com.cloudCount.platform.amm.service.UserService;
import com.opensymphony.xwork2.util.Key;


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
		// Cookie cookie=new Cookie("JSESSIONID", req.getCookies().toString());  
		Cookie cookie=new Cookie("token", req.getRequestedSessionId());  
		
		req.getRequestedSessionId();
        response.addCookie(cookie);  
        
        // HttpSession session = httpRequest.getSession(false);
        
        
//        j_w_t = jwt.encode({'userId': 1, 'exp': datetime.now()}, '100msh.com', algorithm='HS256')
//        		'eyJhbGciOiJIUzI1NiIsInR5cCI6IkpXVCJ9.eyJ1c2VySWQiOjEsImV4cCI6MTQ3MjcyNzQ1Nn0.mqeyzl8YXin0EDGGUm2yYci9FHyo2JbgHFKUZuq9tSU'
//        jwt.decode(j_w_t, '100msh.com', algorithm='HS256')
//        		{'userId': 1, 'exp': 1472727670}

        String jwt = "eyJhbGciOiJIUzI1NiIsInR5cCI6IkpXVCJ9.eyJ1c2VySWQiOjEsImV4cCI6MTQ3MjcyNzQ1Nn0.mqeyzl8YXin0EDGGUm2yYci9FHyo2JbgHFKUZuq9tSU";
       /* Claims claims = Jwts.parser()        
        		   .setSigningKey(DatatypeConverter.parseBase64Binary("100msh.com"))
        		   .parseClaimsJws(jwt).getBody();
        		System.out.println("ID: " + claims.getId());
        		System.out.println("Subject: " + claims.getSubject());
        		System.out.println("Issuer: " + claims.getIssuer());
        		System.out.println("Expiration: " + claims.getExpiration());*/
		
		return "succeed";
	}

}
