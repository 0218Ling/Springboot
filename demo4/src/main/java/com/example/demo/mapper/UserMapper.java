package com.example.demo.mapper;

import com.example.demo.domain.Users;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

import java.util.List;

@Mapper
public interface UserMapper {

       List<Users> userlist();


       Users findUserById(@Param("id") Integer id);

       void insertUser(Users user);

       void updateUser(Users user);

       void deleteUserById(@Param("id") Integer id);



}
