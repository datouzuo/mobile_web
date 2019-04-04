package xin.mengzuo.serviceImp;

import java.util.Calendar;
import java.util.List;

import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import xin.mengzuo.config.DataUntil;
import xin.mengzuo.dao.DayMapper;
import xin.mengzuo.dao.ItemMapper;
import xin.mengzuo.dao.MouthMapper;
import xin.mengzuo.pojo.Day;
import xin.mengzuo.pojo.DayExample;
import xin.mengzuo.pojo.DayExample.Criteria;
import xin.mengzuo.pojo.Item;
import xin.mengzuo.pojo.ItemExample;
import xin.mengzuo.pojo.Mouth;
import xin.mengzuo.pojo.MouthExample;
import xin.mengzuo.service.ItemService;

@Service
@Transactional
public class ItemServiceImp implements ItemService{

	@Autowired
	private ItemMapper im;

	@Autowired
	private DayMapper dm;
	@Autowired
	private MouthMapper mm;

	@Override
	public List<Item> findList(String yearMonthDay,Integer phone) {
		ItemExample te = new ItemExample();
		xin.mengzuo.pojo.ItemExample.Criteria criteria = te.createCriteria();
		
		criteria.andYearMonthDayEqualTo
		(Integer.valueOf(yearMonthDay));
		criteria.andIdentityEqualTo(phone);
		return im.selectByExample(te);
	}


	@Override
	public void add(Item item) {
		//查询是否为第一条
		DayExample dd = new DayExample();
		Criteria criteria = dd.createCriteria();
		criteria.andYearMouthDayEqualTo(String.valueOf(item.getYearMonthDay()));
		criteria.andIdentityEqualTo(item.getIdentity());
		List<Day> daylist =  dm.selectByExample(dd);
		Day day ;
		//不是则更插入这天
		if(daylist.size()==0) {
		 day = new Day();
		 day.setIdentity(item.getIdentity());
			day.setConsume(item.getConsume());
			day.setYearMouthDay(Integer.toString(item.getYearMonthDay()));
		     day.setYearMouth(Integer.valueOf(DataUntil.getYearMonth(
		    		 String.valueOf(item.getYearMonthDay()))));
		     dm.insert(day);
		}else {
			day = daylist.get(0);
			Double consume = day.getConsume()+item.getConsume();
			day.setConsume(consume);
			dm.updateByExample(day, dd);
		}
		//查看是否为当前月第一条
		MouthExample me = new MouthExample();
		xin.mengzuo.pojo.MouthExample.Criteria Criteria = me.createCriteria();
		
		Criteria.andYearMouthEqualTo(DataUntil.getYearMonth(
	    		 String.valueOf(item.getYearMonthDay())));
		Criteria.andIdentityEqualTo(item.getIdentity());
		
		List<Mouth> mouthlist = mm.selectByExample(me);
		Mouth mouth;
		if(mouthlist.size()==0) {
			mouth = new Mouth();
			mouth.setTotalConsum(0.0);
			mouth.setIdentity(item.getIdentity());
			mouth.setYearMouth(DataUntil.getYearMonth(
	    		 String.valueOf(item.getYearMonthDay())));
			mouth.setTotalConsum(item.getConsume());
			
			mm.insertSelective(mouth);
			
		}else {
			mouth =mouthlist.get(0);
			Double mconseme = mouth.getTotalConsum()+item.getConsume();
			mouth.setTotalConsum(mconseme);
		   mm.updateByExample(mouth, me);
		}	
		
		im.insert(item);
		
		
	}

}
