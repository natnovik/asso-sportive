package com.assosport.repository;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

import com.assosport.model.Gymnases;

@Repository
public interface GymnasesRepository extends MongoRepository<Gymnases,String>{

}
