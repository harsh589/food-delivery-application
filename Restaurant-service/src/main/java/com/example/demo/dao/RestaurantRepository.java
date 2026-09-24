package com.example.demo.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.demo.model.Restaurant;

public interface RestaurantRepository extends JpaRepository<Restaurant,Long> {

}
