package xin.mengzuo.controller;

import java.io.IOException;

import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.fasterxml.jackson.core.JsonParseException;
import com.fasterxml.jackson.databind.JsonMappingException;
import com.fasterxml.jackson.databind.ObjectMapper;

import xin.mengzuo.config.DataUntil;
import xin.mengzuo.config.TtmsResult;
import xin.mengzuo.pojo.Mouth;
import xin.mengzuo.pojo.User;
import xin.mengzuo.service.MouthService;

@RestController
public class MouthController {

	
	@Autowired
	private MouthService ms;
	@RequestMapping("/item/all")
	public TtmsResult findAll(HttpServletRequest request) throws JsonParseException, JsonMappingException, IOException {
		User user = (User) request.getSession().getAttribute("user");
		Mouth one = ms.findOne(user.getPhone(), DataUntil.getYearMonth());
		System.out.println("xxxx");
		
		return TtmsResult.build(200, "存在", one);
		 
	}
	
	@RequestMapping("/item/findMonth")
	public TtmsResult findMonth(HttpServletRequest request) {
		User user = (User) request.getSession().getAttribute("user");
		
		return TtmsResult.build(200, "按月查看", ms.findMouthList(user));
	}
	
	@RequestMapping("/item/findDayList")
	public TtmsResult findDay(HttpServletRequest request,String yearMouth) {
		User user = (User) request.getSession().getAttribute("user");
		
	
		
		return TtmsResult.build(200, DataUntil.getDataYear(yearMouth), ms.findDayList(user, yearMouth));
	}
	
	@RequestMapping("/item/addmoney")
	public TtmsResult addMoney(String money,HttpServletRequest request) {
		User user = (User) request.getSession().getAttribute("user");
		Mouth month = ms.addMonth(Double.valueOf(money), user.getPhone());
		return TtmsResult.build(200, "",month);
	}
	
}
