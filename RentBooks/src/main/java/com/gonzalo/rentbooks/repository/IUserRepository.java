package com.gonzalo.rentbooks.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.gonzalo.rentbooks.model.entitys.User;

public interface IUserRepository extends JpaRepository<User, Long>{

}
