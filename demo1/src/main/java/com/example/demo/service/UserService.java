package com.example.demo.service;

import com.example.demo.entity.User;
import com.example.demo.mapper.UserMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;


@Service
public class UserService {
    @Autowired
    private UserMapper userMapper;

    public User getUser(int id){
        return userMapper.getUser(id);
    }

    public int delete(int id){
        return userMapper.delete(id);
    }

    public int update(User user){
        return userMapper.update(user);
    }

    public int save(User user){
        return userMapper.save(user);
    }

    public List<User>  selectAll(){
        return userMapper.selectAll();
    }
}
