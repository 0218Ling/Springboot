package com.example.demo.Service;

import com.example.demo.domain.Water;

import java.util.List;

public interface WaterService {
    public void insertWater(Water water);
    public void updateWater(Water water);
    public void deleteWaterById(Integer id);
    public Water findWaterById(Integer id);
   List<Water> waterlist();
}
