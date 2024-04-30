package com.example.pfabackend.repository;

import com.example.pfabackend.entities.User;
import com.example.pfabackend.entities.UserClient;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface UserClientRepository extends JpaRepository<UserClient, Long> {
  Optional<UserClient> findByUsername(String username);

  Boolean existsByUsername(String username);

  Boolean existsByEmail(String email);
}