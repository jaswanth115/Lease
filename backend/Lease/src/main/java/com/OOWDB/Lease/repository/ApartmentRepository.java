package com.OOWDB.Lease.repository;

import com.OOWDB.Lease.model.Apartment;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ApartmentRepository extends MongoRepository<Apartment,String> {

}
