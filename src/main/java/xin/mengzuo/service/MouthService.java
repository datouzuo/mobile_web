package xin.mengzuo.service;

import java.util.List;

import xin.mengzuo.pojo.Day;
import xin.mengzuo.pojo.Mouth;
import xin.mengzuo.pojo.User;

public interface MouthService {
    Mouth findOne(Integer phone,String yearmMouth);
	List<Mouth> findMouthList(User user);
	List<Day> findDayList(User user,String yearMouth);
	 Mouth addMonth(Double money,Integer phone);
  }
