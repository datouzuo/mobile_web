package xin.mengzuo.controller;

import java.io.IOException;
import java.util.Calendar;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.UUID;

import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpRequest;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.fasterxml.jackson.core.JsonParseException;
import com.fasterxml.jackson.databind.JsonMappingException;
import com.fasterxml.jackson.databind.ObjectMapper;

import xin.mengzuo.config.DataUntil;
import xin.mengzuo.config.TtmsResult;
import xin.mengzuo.pojo.Item;
import xin.mengzuo.pojo.User;
import xin.mengzuo.service.ItemService;

@RestController
public class ItemController {

	@Autowired
	private ObjectMapper om;
	
	@Autowired
	private ItemService is;
	
	@RequestMapping("/item/add")
	public TtmsResult add(@RequestParam(defaultValue="0") String consume,@RequestParam(defaultValue="没有") String description,HttpServletRequest request) throws JsonParseException, JsonMappingException, IOException {
		
		User user = (User) request.getSession().getAttribute("user");
				
	
		Item item = new Item();
		item.setIdentity(user.getPhone());
		item.setConsume(Double.valueOf(consume.trim()));
		item.setDescription(description);
				
		item.setYearMonthDay(Integer.valueOf(DataUntil.getYearMonthDay()));
		item.setDayCurrentTime(UUID.randomUUID().toString());
		item.setStatus(Short.valueOf("1"));
		
		is.add(item);
		
    return TtmsResult.build(200, "添加成功");
	}
	
	
	
	
	@RequestMapping("/item/selectday")
	public TtmsResult findList( String day,HttpServletRequest request) throws JsonParseException, JsonMappingException, IOException{
	 if(day==null||day.trim().equals("time")) { 	
		day = DataUntil.getYearMonthDay();
	 }
	
	 User user = (User) request.getSession().getAttribute("user");
	 
	 return TtmsResult.build(200,DataUntil.getDataFormat(day) 
			 , is.findList(day,user.getPhone()));
	}
	
}
