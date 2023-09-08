package com.tito.petadoption.Service;

import java.util.List;
import java.util.Optional;

import org.springframework.stereotype.Service;

import com.tito.petadoption.Model.Pet;
import com.tito.petadoption.Repository.PetRepository;

@Service
public class PetService {
    private final PetRepository petRepository;
     
    public PetService(PetRepository petRepository){
        this.petRepository=petRepository;
    }

    public List<Pet> getAllPets(){
        return petRepository.findAll();
    }
    public Pet savePet(Pet pet) {
          return petRepository.save(pet);
    }   
    public Optional<Pet> getPetById(Long Id){
    return petRepository.findById(Id);
    }
    public  Pet updatePet(Pet pet, Long Id){
        return petRepository.saveAndFlush(pet);
    }
    public void deletePet(Long Id){
        petRepository.deleteById(Id);
    }
}
