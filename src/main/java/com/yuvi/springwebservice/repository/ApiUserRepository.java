package com.yuvi.springwebservice.repository;


import com.yuvi.springwebservice.TO.User;

import java.util.List;

public interface ApiUserRepository {
    void addUserDetail(User user);
    List<User> getUserDetail();
}
