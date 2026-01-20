package com.trenc.rest.models;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

@Entity
public class Users {

    // Getters and setters will be automatically defined thanks to Lombok
    @Getter
    @Id // Id is a generated value
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    @Setter
    @Getter
    @Column
    private String name;
    @Setter
    @Getter
    @Column
    private String surname;
    @Setter
    @Getter
    @Column
    private Integer age;
    @Setter
    @Getter
    @Column
    private String job;

}
