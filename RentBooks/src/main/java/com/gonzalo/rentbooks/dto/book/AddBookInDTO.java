package com.gonzalo.rentbooks.dto.book;

import io.swagger.v3.oas.annotations.media.Schema;
import jakarta.validation.constraints.NotEmpty;
import jakarta.validation.constraints.Size;

public class AddBookInDTO {
	
	@Schema(description = "SBO of the book", example = "123456")
	@NotEmpty
	@Size(max=14, min=1)
	private String sbo;
	
	@Schema(description = "Title of the book", example = "Title of example")
	@NotEmpty
	@Size(max=20, min=1)
	private String title;
	
	@Schema(description = "Author of the book", example = "Author Example")
	@NotEmpty
	@Size(max=20, min=1)
	private String author;
	
	@Schema(description = "genre of the book", example = "Terror")
	@NotEmpty
	@Size(max=15, min=1)
	private String bookGenre;
	
	@Schema(description = "book pdf address", example = "")
	private String pdfFilePath;
	
	@Schema(description = "indicates if the book is available for renting", example = "true")
	private Boolean available = true;

	public String getSbo() {
		return sbo;
	}

	public void setSbo(String sbo) {
		this.sbo = sbo;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public String getAuthor() {
		return author;
	}

	public void setAuthor(String author) {
		this.author = author;
	}

	public String getBookGenre() {
		return bookGenre;
	}

	public void setBookGenre(String bookGenre) {
		this.bookGenre = bookGenre;
	}

	public String getPdfFilePath() {
		return pdfFilePath;
	}

	public void setPdfFilePath(String pdfFilePath) {
		this.pdfFilePath = pdfFilePath;
	}

	public Boolean getAvailable() {
		return available;
	}

	public void setAvailable(Boolean available) {
		this.available = available;
	}
}
