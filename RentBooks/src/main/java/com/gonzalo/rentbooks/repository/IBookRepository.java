package com.gonzalo.rentbooks.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.gonzalo.rentbooks.model.entitys.Book;

public interface IBookRepository extends JpaRepository<Book, Long> {

}
