package com.pack;

import org.junit.jupiter.api.*;
import org.mockito.Mockito;

import com.pack.dao.UserDao;
import com.pack.service.UserService;
import static org.junit.jupiter.api.Assertions.*;


public class AppTest {
	UserDao dao=Mockito.mock(UserDao.class);
	UserService user=new UserService(dao);
	
	@Test
	public void testForName() {
		Mockito.when(dao.FindUserNameById(100)).thenReturn("ann");
		Mockito.when(dao.FindUserNameById(101)).thenReturn("kann");
		String n=user.getUserByName(100);
		assertEquals("ANN",n);
	}

}
