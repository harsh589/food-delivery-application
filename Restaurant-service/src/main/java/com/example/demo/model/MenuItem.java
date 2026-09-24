package com.example.demo.model;

import com.fasterxml.jackson.annotation.JsonIgnore;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;

@Entity
@Table(name="menu_items")
public class MenuItem {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	
	 @Column(nullable = false)
	    private String name;

	 private String category;
	 
	 @Column(nullable = false)
	    private Double price;

	    private Boolean isVeg;

	    private String description;
	    
	    @ManyToOne
	    @JoinColumn(name = "restaurant_id", nullable = false)
	    @JsonIgnore
	    private Restaurant restaurant;
	    
}
