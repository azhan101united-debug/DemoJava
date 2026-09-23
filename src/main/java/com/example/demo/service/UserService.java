package com.example.demo.service;

import com.example.demo.dto.UserResponseDTO;
import com.example.demo.dto.UserSignUpResponseDTO;
import com.example.demo.entity.EmployeeEntity;
import com.example.demo.repository.Repository; // 1. Added missing repository import
import com.example.demo.mapper.UserSignUpResponseMapper; // 2. Added missing mapper import
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserService {

    @Autowired
    private Repository employeeRepository; 

    @Autowired
    private UserSignUpResponseMapper mapper; 


    public UserSignUpResponseDTO saveUserDetails(UserResponseDTO userResponseDTO) {
        EmployeeEntity entity = mapper.userResponseDTOtoEntity(userResponseDTO);
        
        EmployeeEntity savedEntity = employeeRepository.save(entity);
        
        UserSignUpResponseDTO userSignUpResponseDTO = mapper.entityToSignUpResponse(savedEntity); 
        
        return userSignUpResponseDTO;
    }
}
