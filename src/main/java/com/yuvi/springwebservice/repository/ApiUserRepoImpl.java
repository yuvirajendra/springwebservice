package com.yuvi.springwebservice.repository;

import com.yuvi.springwebservice.TO.User;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.List;

@Repository("apiUserRepo")
public class ApiUserRepoImpl implements ApiUserRepository{
    private static List<User> userList = new ArrayList<>();

    @Override
    public void addUserDetail(User user) {
        userList.add(user);
    }

    @Override
    public List<User> getUserDetail() {
        return userList;
    }
}
