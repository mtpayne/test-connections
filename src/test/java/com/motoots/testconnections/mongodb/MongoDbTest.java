package com.motoots.testconnections.mongodb;

import com.motoots.testconnections.mongodb.model.Pet;
import com.motoots.testconnections.mongodb.repository.PetRepository;
import lombok.extern.slf4j.Slf4j;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.ActiveProfiles;

import static org.junit.jupiter.api.Assertions.assertEquals;

@ActiveProfiles("mongodb")
@Slf4j
@SpringBootTest(classes = {MongoDbConfig.class})
public class MongoDbTest {

    @Autowired
    PetRepository petRepository;

    @Test
    void saveAndRetrievePet() {

        Pet petSave = Pet.builder().id("best-id").name("LJ").build();

        log.info("About to save {} to MongoDB", petSave);
        petRepository.save(petSave);

        log.info("About to retrieve {} from MongoDB", petSave);
        Pet petRetrieve = petRepository.findById(petSave.getId()).orElse(null);

        log.info("{} retrieved", petRetrieve);

        assertEquals(petSave, petRetrieve);
    }
}
