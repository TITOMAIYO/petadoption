package com.tito.petadoption.Repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.tito.petadoption.Model.Pet;


public interface PetRepository extends JpaRepository<Pet, Long>{
    
}
