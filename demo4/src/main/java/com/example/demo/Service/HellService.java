package com.example.demo.Service;

import com.example.demo.domain.Hell;
import org.springframework.stereotype.Service;

import java.util.List;


public interface HellService {
    List<Hell> helllist();

    Hell findHellById(Integer id);

    void insertHell(Hell hell);

    void updateHellByid(Integer id);

    void deleteHellById(Integer id);
}
