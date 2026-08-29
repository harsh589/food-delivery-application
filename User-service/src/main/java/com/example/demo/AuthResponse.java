package com.example.demo;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

public class AuthResponse {

    private Long userId;
    private String name;
    private String email;
    private String role;
    private String token;

    public AuthResponse() {
    }

    public AuthResponse(Long userId, String name, String email, String role, String token) {
        this.userId = userId;
        this.name = name;
        this.email = email;
        this.role = role;
        this.token = token;
    }

    public Long getUserId() {
        return userId;
    }

    public String getName() {
        return name;
    }
    
    public String getEmail() {
        return email;
    }

    public String getRole() {
        return role;
    }
    
    public String getToken() {
        return token;
    }

    public void setUserId(Long userId) {
        this.userId = userId;
    }
    
    public void setName(String name) {
        this.name = name;
    }
    
    public void setEmail(String email) {
        this.email = email;
    }

    public void setRole(String role) {
        this.role = role;
    }
    
    public void setToken(String token) {
        this.token = token;
    }
}