package com.service;

import java.util.List;

import com.entity.User;

public interface UserService {

		public List<User> find();
		public User get(Integer id);
}
