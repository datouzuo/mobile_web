package xin.mengzuo.controller;

import java.net.URLEncoder;
import java.util.List;

import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;

import xin.mengzuo.config.DataUntil;
import xin.mengzuo.config.TtmsResult;
import xin.mengzuo.pojo.Mouth;
import xin.mengzuo.pojo.User;
import xin.mengzuo.service.MouthService;
import xin.mengzuo.service.UserService;
import xin.mengzuo.serviceImp.UserImp;

@RestController
public class UserController {


@Autowired	
	private UserService us;

@Autowired
private MouthService ms;
 @RequestMapping(value="/login",method=RequestMethod.POST)
	public TtmsResult userLogin(User user,HttpServletRequest request,
			HttpServletResponse response) throws JsonProcessingException {
	 
	       List<User> list = us.login(user.getPhone(), user.getPassword());
	       if(list!=null&&list.size()>0) {
	    	   
	 
			Cookie cookie_usename = new Cookie("usename", String.valueOf(user.getPhone()));
			Cookie cookie_password = new Cookie("password", user.getPassword());
			cookie_password.setMaxAge(60 * 60 * 600);
			cookie_usename.setMaxAge(60 * 60 * 600);
			response.addCookie(cookie_password);
			response.addCookie(cookie_usename);
			request.getSession().setAttribute("user",list.get(0));
			
			Mouth mouth = ms.findOne(user.getPhone(), DataUntil.getYearMonth());
			
			return TtmsResult.build(200, "登录成功",mouth);
			}else {
				return TtmsResult.build(400, "登录失败");
			}
	       
		
		
			}
		

	
}
