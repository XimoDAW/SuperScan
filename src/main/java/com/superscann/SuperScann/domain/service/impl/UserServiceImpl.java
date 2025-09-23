package com.superscann.SuperScann.domain.service.impl;

import com.superscann.SuperScann.domain.model.User;
import com.superscann.SuperScann.domain.repository.UserRepository;
import com.superscann.SuperScann.domain.service.UserService;
import com.superscann.SuperScann.mapper.UserMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserServiceImpl implements UserService {

    @Autowired
    UserRepository userRepository;
    @Autowired
    UserMapper userMapper;
    @Override
    public User findById(int id) {
        return userMapper.toDomain(userRepository.findById(id));
    }
}
