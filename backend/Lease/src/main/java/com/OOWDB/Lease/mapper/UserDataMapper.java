package com.OOWDB.Lease.mapper;

import com.OOWDB.Lease.dto.UserDto;
import com.OOWDB.Lease.model.User;
import org.springframework.stereotype.Component;

@Component
public class UserDataMapper {


    public UserDto MapToUserDto(User user) {
        return UserDto.builder()
                .id(user.getId())
                .profileImage(user.getProfileImage())
                .role(user.getRole())
                .email(user.getEmail())
                .name(user.getName())
                .password(user.getPassword())
                .apartmentId(user.getApartmentId())
                .build();
    }

    public User MapToUser(UserDto userDto) {
        return User.builder()
                .id(userDto.getId())
                .profileImage(userDto.getProfileImage())
                .role(userDto.getRole())
                .email(userDto.getEmail())
                .name(userDto.getName())
                .password(userDto.getPassword())
                .apartmentId(userDto.getApartmentId())
                .build();
    }
}
