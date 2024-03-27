package com.example.demo.Controller;

import com.example.demo.Service.HellService;
import com.example.demo.domain.Hell;
import org.apache.ibatis.annotations.Param;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/Hell")
public class HellController {
    @Autowired
    private HellService service;

    @GetMapping("/all")
    public List<Hell> ListData() {
        return service.helllist();
    }

    @GetMapping("/find/{id}")
    public Hell findHellById(@PathVariable Integer id) {
        return service.findHellById(id);
    }

    @DeleteMapping("/delete/{id}")
    public String deleteHellById(@PathVariable Integer id) {
        service.deleteHellById(id);
        return "删除成功";
    }

    @PutMapping("/add")
    public String insertHell(@RequestBody Hell hell) {
        service.insertHell(hell);
        return "新增成功";
    }

    @PutMapping("/update/{id}")
    public String updateHellByid(@PathVariable Integer id) {
        service.updateHellByid(id);
        return "更新成功";
    }


}
