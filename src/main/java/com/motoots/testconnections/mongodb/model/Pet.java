package com.motoots.testconnections.mongodb.model;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.data.mongodb.core.mapping.Document;

import javax.persistence.Id;

@Document
@NoArgsConstructor
@AllArgsConstructor
@Data
@Builder
public class Pet {
    @Id
    private String id;
    private String name;
}
