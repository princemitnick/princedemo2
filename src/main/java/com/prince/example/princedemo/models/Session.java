package com.prince.example.princedemo.models;

import lombok.*;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Getter
@Setter @AllArgsConstructor @ToString
@Entity(name = "sessions")
public class Session {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private  Long session_id;
    private String session_name;
    private String session_description;
    private Integer session_length;

    public Session(){}

}
