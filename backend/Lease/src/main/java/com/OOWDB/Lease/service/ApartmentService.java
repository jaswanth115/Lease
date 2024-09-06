package com.OOWDB.Lease.service;


import com.OOWDB.Lease.dto.ApartmentDto;
import com.OOWDB.Lease.exception.ApartmentNotFoundException;
import com.OOWDB.Lease.mapper.ApartmentDataMapper;
import com.OOWDB.Lease.model.Apartment;
import com.OOWDB.Lease.repository.ApartmentRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class ApartmentService {
    
    
    @Autowired
    private ApartmentRepository apartmentRepository;
    
    @Autowired
    private ApartmentDataMapper apartmentDataMapper;
    
    public ResponseEntity<List<ApartmentDto>> getApartments(){
        List<Apartment> fetched_apartments=apartmentRepository.findAll();
        List<ApartmentDto> mapped_apartments=new ArrayList<>();
        
        for(Apartment apartment:fetched_apartments){
            mapped_apartments.add(apartmentDataMapper.MapToApartmentDto(apartment));
        }
        return new ResponseEntity<>(mapped_apartments, HttpStatus.OK);
    } 
    
    public ResponseEntity<ApartmentDto> getApartmentById(String id){
            Apartment fetched_apartment=apartmentRepository.findById(id).orElseThrow(()-> new ApartmentNotFoundException("Apartment Not found in the database with id "+id));
            ApartmentDto mapped_apartment=apartmentDataMapper.MapToApartmentDto(fetched_apartment);
            return new ResponseEntity<>(mapped_apartment,HttpStatus.OK);
    } 
    
    public ResponseEntity<ApartmentDto> addApartment(ApartmentDto apartmentDto){
        Apartment apartment=apartmentDataMapper.MapToApartment(apartmentDto);
        Apartment saved_apartment=apartmentRepository.save(apartment);
        ApartmentDto mapped_apartment=apartmentDataMapper.MapToApartmentDto(saved_apartment);
        return new ResponseEntity<>(mapped_apartment,HttpStatus.OK);
    }
        
    
    
}
