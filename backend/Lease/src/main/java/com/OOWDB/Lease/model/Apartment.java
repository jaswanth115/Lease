package com.OOWDB.Lease.model;


import lombok.Builder;
import lombok.Getter;
import lombok.Setter;
import org.springframework.data.mongodb.core.mapping.Document;

@Document(collection = "apartment")
@Builder
@Getter
@Setter
public class Apartment {
    private String id;
    private String apartmentName;
    private String rent;
    private String address;
    private String banner;
    private String logo;
    private String insuranceId;
    
}
