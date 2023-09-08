package com.tito.petadoption.Model;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;


@Entity
@Data
@NoArgsConstructor
@AllArgsConstructor

public class Pet {

     @Id
    @GeneratedValue
    private Long Id;
    private String name;
    private String breed;
    private Integer age;
    private Integer size;
    private String gender; 
    private String personality;
    private String medicalHistory;
    private String location;
    @Lob
      private byte[] image;
}
