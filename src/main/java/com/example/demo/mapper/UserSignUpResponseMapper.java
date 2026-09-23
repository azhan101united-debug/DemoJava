package com.example.demo.mapper;

import com.example.demo.dto.UserResponseDTO;
import com.example.demo.dto.UserSignUpResponseDTO;
import com.example.demo.entity.EmployeeEntity;

/**
 * UserSignUpResponseMapper
 */
public class UserSignUpResponseMapper {


    public UserSignUpResponseDTO entityToSignUpResponse(EmployeeEntity entity){
        UserSignUpResponseDTO userSignUpResponseDTO = new UserSignUpResponseDTO();
        userSignUpResponseDTO.setId(entity.getId());
        userSignUpResponseDTO.setName(entity.getName());
        userSignUpResponseDTO.setEmail(entity.getEmail());
        userSignUpResponseDTO.setGender(entity.setGender()); 
        return userSignUpResponseDTO;
    }
   
    public EmployeeEntity userResponseDTOtoEntity(UserResponseDTO userResponseDTO )
    {
       EmployeeEntity employeeEntity = new EmployeeEntity();
       employeeEntity.setName(userResponseDTO.getName());
       employeeEntity.setClass(userResponseDTO.getClassName());
       employeeEntity.setGender(userResponseDTO.getGender());
       employeeEntity.setAge(userResponseDTO.getAge());
       employeeEntity.setPhoneNumber(userResponseDTO.getPhoneNumber());
       employeeEntity.setEmail(userResponseDTO.getEmail());
       employeeEntity.setPassword(userResponseDTO.getPassword());
       
       return employeeEntity;
    }

}