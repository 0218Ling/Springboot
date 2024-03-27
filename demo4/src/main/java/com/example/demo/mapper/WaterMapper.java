package com.example.demo.mapper;

import com.example.demo.domain.Water;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

import java.util.List;
@Mapper
public interface WaterMapper {
    void insertWater(Water water);
    void updateWater(Water water);
    void deleteWaterById(Integer id);
    Water findWaterById(@Param("id") Integer id);
    List<Water> waterlist();
}
