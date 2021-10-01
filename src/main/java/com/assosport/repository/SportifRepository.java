package com.assosport.repository;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

import com.assosport.model.Sportif;

@Repository
public interface SportifRepository extends MongoRepository<Sportif,String>{

}