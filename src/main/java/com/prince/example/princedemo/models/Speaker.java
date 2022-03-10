package com.prince.example.princedemo.models;

import lombok.*;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity(name = "speakers")
@Getter @Setter @NoArgsConstructor @AllArgsConstructor @ToString
public class Speaker {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)

    private Long speaker_id;
    private String first_name;
    private String last_name;
    private String title;
    private String company;
    private String speaker_bio;





}
