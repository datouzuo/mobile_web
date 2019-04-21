package xin.mengzuo.serviceImp;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.mysql.fabric.xmlrpc.base.Data;

import xin.mengzuo.config.DataUntil;
import xin.mengzuo.dao.DayMapper;
import xin.mengzuo.dao.MouthMapper;
import xin.mengzuo.pojo.Day;
import xin.mengzuo.pojo.DayExample;
import xin.mengzuo.pojo.Mouth;
import xin.mengzuo.pojo.MouthExample;
import xin.mengzuo.pojo.MouthExample.Criteria;
import xin.mengzuo.pojo.User;
@Service
public class MouthServiceImp implements xin.mengzuo.service.MouthService{
 
	@Autowired
	private MouthMapper mm;
    @Autowired
    private DayMapper dm;
	@Override
	public List<Mouth> findMouthList(User user) {
		MouthExample me = new MouthExample();
		Criteria mcriteria = me.createCriteria();
		 mcriteria.andIdentityEqualTo(user.getPhone());
		 me.setOrderByClause("year_mouth DESC");
		 
		return mm.selectByExample(me);
	}

	@Override
	public List<Day> findDayList(User user, String yearMouth) {
		DayExample de = new DayExample();
		xin.mengzuo.pojo.DayExample.Criteria dcriteria = de.createCriteria();
		dcriteria.andIdentityEqualTo(user.getPhone());
		dcriteria.andYearMouthEqualTo(Integer.valueOf(yearMouth));
		de.setOrderByClause("year_mouth_day DESC");
		
		return dm.selectByExample(de);
	}

	@Override
	public Mouth findOne(Integer phone, String yearmMouth) {
		
		MouthExample me = new MouthExample();
		Criteria criteria = me.createCriteria();
		criteria.andIdentityEqualTo(phone);
		criteria.andYearMouthEqualTo(yearmMouth);
		List<Mouth> list = mm.selectByExample(me);
		if(list.size()>0) {
			return list.get(0);
			
		}
		return null;
		
	}

	@Override
	public Mouth addMonth(Double money, Integer phone) {
		MouthExample me = new MouthExample();
		Criteria criteria = me.createCriteria();
       criteria.andIdentityEqualTo(phone);
       criteria.andYearMouthEqualTo(DataUntil.getYearMonth());
       List<Mouth> list = mm.selectByExample(me);
       Mouth mouth=null;
       if(list.size()>0) {
    	   mouth = list.get(0);
    	   if(mouth.getTotalMoney()!=null) {
    		   mouth.setTotalMoney(money+mouth.getTotalMoney());
    		  
    	   }else {
    		   mouth.setTotalMoney(money); 
    	   }
    	   mm.updateByExample(mouth, me);
    	   }
    	   else {
    		  mouth = new Mouth();
   			mouth.setTotalMoney(money);
   			mouth.setIdentity(phone);
   			mouth.setYearMouth(DataUntil.getYearMonth());
   			mouth.setTotalConsum(0.0);
   			
   			mm.insertSelective(mouth);   
    	   }
    	  
    	   return mouth;
       }
	}
	

	
	


