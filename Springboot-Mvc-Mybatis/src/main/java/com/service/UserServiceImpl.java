package com.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.entity.User;
import com.mapper.UserMapper;

@Service
public class UserServiceImpl implements UserService{
	
	@Autowired
    private UserMapper userMapper;

    @Override
    public List<User> find() {
    	  return userMapper.find();
    	 } 
    
    @Override
    	 public User get(Integer id){
    	  return userMapper.get(id);
    	 }
}
