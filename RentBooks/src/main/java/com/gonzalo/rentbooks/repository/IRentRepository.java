package com.gonzalo.rentbooks.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.gonzalo.rentbooks.model.entitys.Rent;

public interface IRentRepository extends JpaRepository<Rent, Long> {
	
}
