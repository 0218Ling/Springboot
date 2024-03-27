package com.example.demo.Service.impl;

import com.example.demo.Service.HellService;
import com.example.demo.domain.Hell;
import com.example.demo.mapper.HellMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class HellServiceImpl implements HellService {
    @Autowired
    HellMapper hellMapper;

    @Override
    public List<Hell> helllist() {
        return hellMapper.helllist();
    }

    @Override
    public Hell findHellById(Integer id) {
        return hellMapper.findHellById(id);
    }

    @Override
    public void insertHell(Hell hell) {
        hellMapper.insertHell(hell);
    }

    @Override
    public void updateHellByid(Integer id) {
        hellMapper.updateHellByid(id);
    }

    public void deleteHellById(Integer id) {
        hellMapper.deleteHellById(id);
    }


}
