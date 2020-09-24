package com.datamine.repojpa;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.datamine.model.User;
import com.datamine.repository.UserRepository;
import com.datamine.service.UserService;

@RestController
public class RepoJpaController
{
	@Autowired
	UserService userService;
	
	@GetMapping("/getdata")
	public String getData()
	{
		List<User> userV = new ArrayList<User>();
		userV = userService.findUserById("abc");
		
		return userV.toString();
	}
	
}