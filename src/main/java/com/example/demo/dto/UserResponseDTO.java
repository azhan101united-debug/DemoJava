package com.example.demo.dto;
import lombok.Data;


@Data
public class UserResponseDTO {
     
    private String Name;
    private String ClassName;
    private String Gender;
    private int Age;
    private long PhoneNumber;
    private String Email;
    private String Password;
    
}