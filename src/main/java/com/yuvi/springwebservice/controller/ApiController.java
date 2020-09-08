package com.yuvi.springwebservice.controller;

import com.yuvi.springwebservice.TO.User;
import com.yuvi.springwebservice.service.ApiUserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api")
public class ApiController {
    @Autowired
    private ApiUserService userService;

    @PostMapping("/addUser")
    public void addUserDetails(@RequestBody User user) {
        userService.addUserDetail(user);
    }

    @GetMapping("/getUserDetails")
    public List<User> getUserDetail() {
        return userService.getUserDetail();
    }
}
