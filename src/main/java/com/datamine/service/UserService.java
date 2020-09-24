package com.datamine.service;

import com.datamine.model.User;
import java.util.*;

public interface UserService 
{
	
	public List<User> findUser(String password);
	public List<User> findUserById(String string);

}
