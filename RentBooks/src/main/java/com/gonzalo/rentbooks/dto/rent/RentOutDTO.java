package com.gonzalo.rentbooks.dto.rent;

import java.time.LocalDate;

public class RentOutDTO {
	
	private Long RentId;
	
	private LocalDate rentalDate;
	
	private LocalDate expirationDate;
	
	private Long userId;

	public Long getRentId() {
		return RentId;
	}

	public void setRentId(Long rentId) {
		RentId = rentId;
	}

	public LocalDate getRentalDate() {
		return rentalDate;
	}

	public void setRentalDate(LocalDate rentalDate) {
		this.rentalDate = rentalDate;
	}

	public LocalDate getExpirationDate() {
		return expirationDate;
	}

	public void setExpirationDate(LocalDate expirationDate) {
		this.expirationDate = expirationDate;
	}

	public Long getUserId() {
		return userId;
	}

	public void setUserId(Long userId) {
		this.userId = userId;
	}
	
	
}
