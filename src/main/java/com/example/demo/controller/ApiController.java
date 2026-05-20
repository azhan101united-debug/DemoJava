package com.example.demo.controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.entity.EmployeeEntity;
import com.example.demo.repository.Repository;

@RestController
@RequestMapping("/api/v1")
public class ApiController {

    @Autowired
    private Repository employeeRepository;

    @GetMapping("") // This maps to the base /api/v1 path
     public String welcome() {
     return "Welcome to the Employee API V1!";
}

    @GetMapping("/user")
    public List<EmployeeEntity> getAllEmployees() {
        return employeeRepository.findAll();
    }

    @GetMapping("/user/{id}")
    public Optional<EmployeeEntity> getEmployeesById(@PathVariable int id) {
        return employeeRepository.findById(id);
    }


    @PostMapping("/signup")
    @SuppressWarnings("null")
    public EmployeeEntity createEmployee (@RequestBody EmployeeEntity entity  ){
        return employeeRepository.save(entity);
    }

    @DeleteMapping("/user/{id}")
    public String deleteEmployee (@PathVariable int id ){
        if(employeeRepository.existsById(id)){ 
        employeeRepository.deleteById(id);
        }
         return ("Employee is deleted with id :" +id);
    }


    @GetMapping("/health")
    public String health() {
        return ( "Health Check ok");
    }




    
}