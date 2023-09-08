package com.tito.petadoption.Controller;

import java.util.List;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.server.ResponseStatusException;

import com.tito.petadoption.Model.Pet;
import com.tito.petadoption.Service.PetService;

@RestController
@RequestMapping("api/v1")
public class PetController {
    
    private final PetService petService;
     
    public PetController(PetService petService){
        this.petService=petService;
    }
@GetMapping("")
 public List<Pet> getAllPets(){
        return petService.getAllPets();

 }
 @PostMapping("")
 public Pet createPet(@RequestBody Pet pet){
    return petService.savePet(pet);
 }
 @GetMapping("/{id}")
 public Pet getPet(@PathVariable Long Id){
    return petService.getPetById(Id).orElseThrow(()->new ResponseStatusException(HttpStatus.NOT_FOUND,"Pet not found"));
    
 }
 @PutMapping("/{id}")
 public Pet updatePet(@RequestBody Pet pet,@PathVariable Long Id){
    return petService.updatePet(pet, Id);
 }
 @DeleteMapping("/{id}")
 public void deletePet(@PathVariable Long Id){
   petService.deletePet(Id);
 }
}
