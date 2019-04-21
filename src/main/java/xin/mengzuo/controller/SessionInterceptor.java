package xin.mengzuo.controller;

import java.net.URLDecoder;
import java.util.List;

import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.servlet.HandlerInterceptor;

import xin.mengzuo.pojo.User;
import xin.mengzuo.service.UserService;

public class SessionInterceptor implements HandlerInterceptor {

	@Autowired
	private UserService us;

	@Override
	public boolean preHandle(HttpServletRequest request, HttpServletResponse response, Object handler)
			throws Exception {

		User user = (User) request.getSession().getAttribute("user");
		if (user != null) {
			return true;
		}
		
		String usename = null;
		String password = null;

		Cookie[] cookies = request.getCookies();
		if (cookies != null) {
			for (Cookie cookie : cookies) {
				if ("usename".equals(cookie.getName())) {
					usename = cookie.getValue();
				}
				if ("password".equals(cookie.getName())) {
					password = cookie.getValue();
				}
			}
		}
		if (usename!=null&&password != null) {

			List<User> list = us.login(Integer.valueOf(usename), password);

			if (list!=null&&list.size() > 0) {
				request.getSession().setAttribute("user", list.get(0));
				return true;
			}


		}
		return false;
	}

}
