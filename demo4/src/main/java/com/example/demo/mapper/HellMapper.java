package com.example.demo.mapper;

import com.example.demo.domain.Hell;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

import java.util.List;

@Mapper
public interface HellMapper {
    List<Hell> helllist();

    Hell findHellById(@Param("id") Integer id);

    void insertHell(Hell hell);

    void updateHellByid(@Param("id") Integer id);

    void deleteHellById(@Param("id") Integer id);

}
