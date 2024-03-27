package com.example.demo.Service.impl;

import com.example.demo.domain.Users;
import com.example.demo.mapper.UserMapper;
import com.example.demo.Service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserServiceImpl implements UserService {

    @Autowired
    UserMapper uMapper;

    @Override
    public List<Users> getList() {
        return uMapper.userlist();
    }

    @Override
    public Users findUserById(Integer id) {
        return uMapper.findUserById(id);
    }

    // 注意参数类型应该是 Users 而不是 User
    @Override
    public void addUser(Users user) {
        uMapper.insertUser(user);
    }

    @Override
    public void updateUser(Users user) {
        uMapper.updateUser(user);
    }

    // 参数类型应该是 Integer id 而不是 User user
    @Override
    public void deleteUserById(Integer id) {
        uMapper.deleteUserById(id);
    }
}
