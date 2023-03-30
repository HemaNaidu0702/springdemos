package com.examples.S08SpringMVCORMDemo.services;

import java.util.List;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.examples.S08SpringMVCORMDemo.dao.UserDao;
import com.examples.S08SpringMVCORMDemo.entity.User;
import com.examples.S08SpringMVCORMDemo.exception.UserAlreadyExistException;

@Service
public class UserServiceImpl implements UserService{

	@Autowired
	private UserDao userdao;
	
	
	@Override
	@Transactional
	public int save(User user) throws UserAlreadyExistException {
		if (userdao.findUser(user.getEmail()) != null) {
			throw new UserAlreadyExistException(user.getEmail());
		}
		return userdao.create(user);
	}


	@Override
	public List<User> getUsers() {
		return userdao.findUsers();
	}
   
}
