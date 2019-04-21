package xin.mengzuo.service;

import java.util.List;

import xin.mengzuo.pojo.User;

public interface UserService {
	 List<User> login(Integer username,String password);
}
