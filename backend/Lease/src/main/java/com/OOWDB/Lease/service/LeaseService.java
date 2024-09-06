package com.OOWDB.Lease.service;
import com.OOWDB.Lease.dto.HomeResponse;
import com.OOWDB.Lease.exception.ApartmentNotFoundException;
import com.OOWDB.Lease.exception.UserNotFoundException;
import com.OOWDB.Lease.model.Apartment;
import com.OOWDB.Lease.model.User;
import com.OOWDB.Lease.repository.ApartmentRepository;
import com.OOWDB.Lease.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class LeaseService {

    @Autowired
    UserRepository userRepository;
    @Autowired
    ApartmentRepository apartmentRepository;
    public ResponseEntity<HomeResponse> getHomeData(String id) {
        User fetched_user=userRepository.findById(id).orElseThrow(()->new UserNotFoundException("User Not Found in the database with id "+id));
        if(fetched_user.getApartmentId()!=null) {
            Optional<Apartment> fetched_apartment = apartmentRepository.findById(fetched_user.getApartmentId());
            if(fetched_apartment.isEmpty()) throw new ApartmentNotFoundException(
                    "Apartment is not found in the database with id"+fetched_user.getApartmentId());
            return new ResponseEntity<>(HomeResponse.builder()
                    .name(fetched_user.getName())
                    .email(fetched_user.getEmail())
                    .logo(fetched_apartment.get().getLogo())
                    .banner(fetched_apartment.get().getBanner())
                    .apartmentName(fetched_apartment.get().getApartmentName())
                    .rent(fetched_apartment.get().getRent())
                    .address(fetched_apartment.get().getAddress())
                    .build(), HttpStatus.OK);
        }
        else{
           return new ResponseEntity<>(HomeResponse.builder()
                   .name(fetched_user.getName())
                   .email(fetched_user.getEmail())
                   .logo(null)
                   .banner(null)
                   .apartmentName(null)
                   .rent(null)
                   .address(null)
                   .build(),HttpStatus.OK);
        }
       
    }
}
