package com.example.demo.Controller;

import com.example.demo.Service.UserService;
import com.example.demo.domain.Users;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/User")
public class UsersController {
    @Autowired
    private UserService service;

    @GetMapping("/all")
     public List<Users> ListData(){
    return service.getList();
    }

    @GetMapping("/{id}")
    public Users getUserById(@PathVariable Integer id) {
        return service.findUserById(id);
    }
    @PostMapping("/add")
    public String createUser(@RequestBody Users user) {
         service.addUser(user);
         return "新增成功";
    }

    @PostMapping("/update/{id}")
        public String updateUser(@RequestBody Users user ){
        service.updateUser(user);
        return "更新成功";
    }

    @DeleteMapping("/delete/{id}")
    public  String deleteUser(@PathVariable Integer id){
        service.deleteUserById(id);
        return "删除成功";
    }


}
