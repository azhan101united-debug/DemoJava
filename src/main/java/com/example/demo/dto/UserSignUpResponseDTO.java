package com.example.demo.dto;
import lombok.Data;

@Data
public class UserSignUpResponseDTO {
   
    private int id;
    private String Name;
    private String Email;
    private String Gender;
    private long PhoneNumber;
    
}