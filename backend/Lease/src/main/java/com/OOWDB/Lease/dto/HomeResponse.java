package com.OOWDB.Lease.dto;

import lombok.*;

@Data
@Getter
@Setter
@Builder
public class HomeResponse {
    private String name;
    private String email;
    private String logo;
    private String profileImage;
    private String banner;
    private String rent;
    private String apartmentName;
    private String address;
}
