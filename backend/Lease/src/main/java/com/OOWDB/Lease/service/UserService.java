package com.OOWDB.Lease.service;


import com.OOWDB.Lease.dto.UserDto;
import com.OOWDB.Lease.exception.UserNotFoundException;
import com.OOWDB.Lease.mapper.UserDataMapper;
import com.OOWDB.Lease.model.User;
import com.OOWDB.Lease.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class UserService {
    
    @Autowired
    UserRepository userRepository;
    @Autowired
    UserDataMapper userDataMapper;
    
    public ResponseEntity<List<UserDto>> getUsers(){
        List<User> fetched_users=userRepository.findAll();
        List<UserDto> mapped_users=new ArrayList<>();
        
        for(User user:fetched_users){
            mapped_users.add(userDataMapper.MapToUserDto(user));
        }
        
        return new ResponseEntity<>(mapped_users, HttpStatus.OK);
    }
    
    public ResponseEntity<UserDto> getUserById(String id){
        User user=userRepository.findById(id).orElseThrow( ()-> new UserNotFoundException("User not found in the database with id "+id));
        UserDto fetched_userDto=userDataMapper.MapToUserDto(user);
        return new ResponseEntity<>(fetched_userDto,HttpStatus.OK);
    }
    
    
    public ResponseEntity<UserDto> addUser(UserDto userDto){
        
        User user=userDataMapper.MapToUser(userDto);
        User saved_user=userRepository.save(user);
        UserDto saved_userDto=userDataMapper.MapToUserDto(saved_user);
        
        return new ResponseEntity<>(saved_userDto,HttpStatus.OK);
    }
    
    
    
     
}
