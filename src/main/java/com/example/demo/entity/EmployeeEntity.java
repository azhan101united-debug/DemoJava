package com.example.demo.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;
import lombok.Data;

@Entity
@Table(name = "employees")
@NoArgsConstructor
@AllArgsConstructor
@Data

public class EmployeeEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY) 
    private int Id;

    private String Name;
    private String ClassName;
    private String Gender;
    private int Age;
    private long PhoneNumber;
    private String Email;
    private String Password;
}