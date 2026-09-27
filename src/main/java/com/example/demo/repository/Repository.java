package com.example.demo.repository;

import java.util.Optional;
import org.springframework.data.jpa.repository.JpaRepository;
import com.example.demo.entity.EmployeeEntity;
//import org.springframework.stereotype.Repository;


public interface Repository extends JpaRepository<EmployeeEntity, Integer> {

    // Optional<EmployeeEntity> findByEmail(String email);
}
