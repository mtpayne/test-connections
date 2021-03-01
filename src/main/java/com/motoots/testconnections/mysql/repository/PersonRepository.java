package com.motoots.testconnections.mysql.repository;

import com.motoots.testconnections.mysql.model.Person;
import org.springframework.data.repository.CrudRepository;

public interface PersonRepository extends CrudRepository<Person, Long> {
}
