package com.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.entity.User;
import com.service.UserService;

@Controller
@RequestMapping("/user")
public class UserController {

	@Autowired
    private UserService userService;

    @RequestMapping("/toUserListPage")
    public String toUserListPage() {
        return "user/userList";
    }

    @RequestMapping("/find")
    @ResponseBody
    public List<User> find() {
     return userService.find();
    } 
    
    @RequestMapping("/get/{id}")
    @ResponseBody
    public User get(@PathVariable Integer id){
     return userService.get(id);
    }

}
