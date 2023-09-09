package com.tito.petadoption.Repository;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;

import com.tito.petadoption.Model.User;

public interface UserRepository extends JpaRepository<User, Integer> {
    Optional<User>findByEmail(String email);
    
}
