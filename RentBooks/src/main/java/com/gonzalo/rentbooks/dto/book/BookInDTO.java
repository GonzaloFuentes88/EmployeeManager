package com.gonzalo.rentbooks.dto.book;

import io.swagger.v3.oas.annotations.media.Schema;
import jakarta.validation.constraints.NotEmpty;
import jakarta.validation.constraints.Size;

public class BookInDTO {
	
	@Schema(description = "SBO of the book", example = "123456")
	@NotEmpty
	@Size(max=14, min=1)
	private String sbo;

	public String getSbo() {
		return sbo;
	}

	public void setSbo(String sbo) {
		this.sbo = sbo;
	}
}
