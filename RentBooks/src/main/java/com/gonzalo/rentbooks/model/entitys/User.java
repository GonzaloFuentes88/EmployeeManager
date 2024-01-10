package com.gonzalo.rentbooks.model.entitys;

import java.util.List;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;

@Entity
public class User {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	
	private String username;
	
	private String password;
	
	@OneToMany(mappedBy = "user")
	private List<Rent> rentedBooks;

	public String getUsername() {
		return username;
	}

	public void setUsername(String username) {
		this.username = username;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public List<Rent> getRentedBooks() {
		return rentedBooks;
	}

	public void setRentedBooks(List<Rent> rentedBooks) {
		this.rentedBooks = rentedBooks;
	}
}
