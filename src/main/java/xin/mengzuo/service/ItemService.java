package xin.mengzuo.service;

import java.util.List;

import xin.mengzuo.pojo.Item;

public interface ItemService {

	public void add(Item item) ;
	
	public List<Item> findList(String yearMonthDay,Integer phone);
	
}
