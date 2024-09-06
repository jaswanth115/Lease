package com.OOWDB.Lease.dto;


import lombok.Builder;
import lombok.Data;
import lombok.Getter;
import lombok.Setter;

@Data
@Getter
@Setter
@Builder
public class UserDto {
    private String id;
    private String profileImage;
    private String role;
    private String email;
    private String name;
    private String password;
    private String apartmentId;
}
