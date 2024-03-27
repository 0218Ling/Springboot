package com.example.demo.Controller;

import com.example.demo.Service.WaterService;
import com.example.demo.domain.Water;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/Water")
public class WaterController {
    @Autowired
    private WaterService service;

    @GetMapping("/all")
    public List<Water> ListData(){
        return service.waterlist();
    }

    @PostMapping("/add")
    public String createWater(@RequestBody Water water) {
        service.insertWater(water);
        return "新增成功";
    }

    @DeleteMapping("/delete/{id}")
    public String deleteById(@PathVariable Integer id){
        service.deleteWaterById(id);
        return "删除成功";
    }

    @PutMapping("/update/{id}")
    public String updateWater(@RequestBody Water water ){
        service.updateWater(water);
        return "更新成功";
    }

}
