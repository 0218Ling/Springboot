package com.example.demo.Service.impl;

import com.example.demo.Service.WaterService;
import com.example.demo.domain.Water;
import com.example.demo.mapper.WaterMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class WaterServiceImpl implements WaterService {
@Autowired
    WaterMapper WMapper;


@Override
    public void insertWater(Water water) {
        WMapper.insertWater(water);
    }

    @Override
    public void updateWater(Water water) {
        WMapper.updateWater(water);
    }

    @Override
    public void deleteWaterById(Integer id) {
WMapper.deleteWaterById(id);
    }

    @Override
    public Water findWaterById(Integer id) {
        return WMapper.findWaterById(id);

    }

    @Override
    public List<Water> waterlist() {
       return WMapper.waterlist();
    }


}
