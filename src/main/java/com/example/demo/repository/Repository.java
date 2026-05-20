package com.example.demo.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import com.example.demo.entity.EmployeeEntity;

public interface Repository extends JpaRepository<EmployeeEntity, Integer> {

     
}
