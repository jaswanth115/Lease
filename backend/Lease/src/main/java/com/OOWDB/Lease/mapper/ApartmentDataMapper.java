package com.OOWDB.Lease.mapper;

import com.OOWDB.Lease.dto.ApartmentDto;
import com.OOWDB.Lease.model.Apartment;
import org.springframework.stereotype.Component;

@Component
public class ApartmentDataMapper {
    
    
    public Apartment MapToApartment(ApartmentDto apartmentDto){
        return Apartment.builder()
                .id(apartmentDto.getApartmentId())
                .apartmentName(apartmentDto.getApartmentName())
                .rent(apartmentDto.getRent())
                .address(apartmentDto.getAddress())
                .banner(apartmentDto.getBanner())
                .logo(apartmentDto.getLogo())
                .insuranceId(apartmentDto.getInsuranceId())
        .build();
    }
    public ApartmentDto MapToApartmentDto(Apartment apartment){
        return ApartmentDto.builder()
                .apartmentId(apartment.getId())
                .apartmentName(apartment.getApartmentName())
                .rent(apartment.getRent())
                .address(apartment.getAddress())
                .banner(apartment.getBanner())
                .logo(apartment.getLogo())
                .insuranceId(apartment.getInsuranceId())
                .build();
    }
    
}
