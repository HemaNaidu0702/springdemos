package com.examples.S08SpringMVCORMDemo.services;

import java.util.List;

import com.examples.S08SpringMVCORMDemo.entity.User;
import com.examples.S08SpringMVCORMDemo.exception.UserAlreadyExistException;

public interface UserService {

	int save(User user) throws UserAlreadyExistException; 

	 List <User> getUsers();
}
