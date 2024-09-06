package com.OOWDB.Lease.controller;


import com.OOWDB.Lease.dto.UserDto;
import com.OOWDB.Lease.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/user")
public class UserController {
    
    @Autowired
    UserService userService;
    
    @GetMapping("/getUsers")
    public ResponseEntity<List<UserDto>> getUsers(){
        return userService.getUsers();
    }
    
    @PostMapping("/getUserById")
    public ResponseEntity<UserDto> getUserById(@RequestParam String id){
        return userService.getUserById(id);
    }
    
//    should we make a seperate dto for userDto? userRequestObject?
    @PostMapping("/addUser")
    public ResponseEntity<UserDto> addUsers(@RequestBody UserDto userDto){
        return userService.addUser(userDto);
    }
    
    
}
