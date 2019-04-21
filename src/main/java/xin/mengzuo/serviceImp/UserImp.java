package xin.mengzuo.serviceImp;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import xin.mengzuo.dao.UserMapper;
import xin.mengzuo.pojo.User;
import xin.mengzuo.pojo.UserExample;
import xin.mengzuo.pojo.UserExample.Criteria;
import xin.mengzuo.service.UserService;

@Service
public class UserImp implements UserService{
@Autowired
private UserMapper um;
	public List<User> login(Integer username,String password){
		UserExample ue = new UserExample();
		Criteria criteria = ue.createCriteria();
		criteria.andPasswordEqualTo(password);
		criteria.andPhoneEqualTo(username);
		return um.selectByExample(ue);
	}
}
