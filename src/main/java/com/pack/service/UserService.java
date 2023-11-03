package com.pack.service;
import com.pack.dao.UserDao;
public class UserService {
	private UserDao dao;
	public UserService(UserDao dao) {
		this.dao=dao;
	}
	public String getUserByName(int id) {
		String name=dao.FindUserNameById(id);
		return name.toUpperCase();
	}
}
