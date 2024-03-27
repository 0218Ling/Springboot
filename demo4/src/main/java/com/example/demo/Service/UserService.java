package com.example.demo.Service;

import com.example.demo.domain.Users;
import org.apache.catalina.User;

import java.util.List;

public interface UserService {
    List<Users> getList();

    Users findUserById(Integer id);

    void addUser(Users user);


    void updateUser(Users user);

    void  deleteUserById(Integer id);



}
