package com.example.demo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.stereotype.Service;

@Service
public class UserService {

	@Autowired
	UserRepository repo;
	
	@Autowired
	jwtUtil util;
	
	private final BCryptPasswordEncoder passwordEncoder = new BCryptPasswordEncoder();

    // 1. Register user
    public AuthResponse register(RegisterRequest request) {
        if (repo.existsByEmail(request.getEmail())) {
            throw new RuntimeException("Email already registered");
        }

        User user = User.builder()
                .name(request.getName())
                .email(request.getEmail())
                .password(passwordEncoder.encode(request.getPassword()))
                .role(request.getRole())
                .build();

        User saved = userRepository.save(user);

        String token = jwtUtil.generateToken(saved.getEmail(), saved.getId(), saved.getRole().name());

        return new AuthResponse(saved.getId(), saved.getName(), saved.getEmail(), saved.getRole().name(), token);
    }

	
	

}
