package com.datamine.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.datamine.model.User;
import com.datamine.repository.UserRepository;

@Service
public class UserServiceBean implements UserService 
{
	@Autowired
	private UserRepository userRepository;
	
	@Override
	public List<User> findUser(String password) {
		// TODO Auto-generated method stub
		return userRepository.findAll();
	}

	@Override
	public List<User> findUserById(String string) {
		// TODO Auto-generated method stub
		return null;
	}
	

}
