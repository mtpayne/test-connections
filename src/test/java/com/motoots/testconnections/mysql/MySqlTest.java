package com.motoots.testconnections.mysql;

import com.motoots.testconnections.mysql.model.Person;
import com.motoots.testconnections.mysql.repository.PersonRepository;
import lombok.extern.slf4j.Slf4j;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.ActiveProfiles;

import static org.junit.jupiter.api.Assertions.assertEquals;

@ActiveProfiles("mysql")
@Slf4j
@SpringBootTest(classes = {MySqlConfig.class})
public class MySqlTest {

    @Autowired
    PersonRepository personRepository;

    @Test
    void saveAndRetrievePerson() {

        Person personSave = Person.builder().id(1L).name("MJ").build();

        log.info("About to save {} to MySQL", personSave);
        personRepository.save(personSave);

        log.info("About to retrieve {} from MySQL", personSave);
        Person personRetrieve = personRepository.findById(personSave.getId()).orElse(null);

        log.info("{} retrieved", personRetrieve);

        assertEquals(personSave, personRetrieve);
    }
}
