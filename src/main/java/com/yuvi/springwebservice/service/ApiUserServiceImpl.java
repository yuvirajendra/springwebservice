package com.yuvi.springwebservice.service;

import com.yuvi.springwebservice.TO.User;
import com.yuvi.springwebservice.repository.ApiUserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ApiUserServiceImpl implements ApiUserService {

    private ApiUserRepository userRepository;

    @Autowired
    public ApiUserServiceImpl(@Qualifier("apiUserRepo")ApiUserRepository userRepository) {
        this.userRepository = userRepository;
    }

    @Override
    public void addUserDetail(User user) {
        userRepository.addUserDetail(user);
    }

    @Override
    public List<User> getUserDetail() {
        return userRepository.getUserDetail();
    }
}
