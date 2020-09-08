package com.yuvi.springwebservice.service;

import com.yuvi.springwebservice.TO.User;

import java.util.List;

public interface ApiUserService {
    void addUserDetail(User user);
    List<User> getUserDetail();
}
