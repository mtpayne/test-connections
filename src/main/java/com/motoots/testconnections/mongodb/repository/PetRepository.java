package com.motoots.testconnections.mongodb.repository;

import com.motoots.testconnections.mongodb.model.Pet;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface PetRepository extends MongoRepository<Pet, String> {
}
