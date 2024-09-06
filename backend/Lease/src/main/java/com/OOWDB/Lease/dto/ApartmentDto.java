package com.OOWDB.Lease.dto;

import lombok.Builder;
import lombok.Data;
import lombok.Getter;
import lombok.Setter;

@Data
@Getter
@Setter
@Builder
public class ApartmentDto {
    private String apartmentId;
    private String apartmentName;
    private String rent;
    private String address;
    private String banner;
    private String logo;
    private String insuranceId;
}
