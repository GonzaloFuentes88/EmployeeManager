package com.gonzalo.rentbooks.dto.book;

import io.swagger.v3.oas.annotations.media.Schema;

public class BookOutDTO {
	
	@Schema(description = "SBO of the book", example = "123456")
	private String sbo;
	
	@Schema(description = "Title of the book", example = "Title of example")
	private String title;
	
	@Schema(description = "Author of the book", example = "Author Example")
	private String author;
	
	@Schema(description = "genre of the book", example = "Terror")
	private String bookGenre;
	
	@Schema(description = "book pdf address", example = "")
	private String pdfFilePath;
	
	@Schema(description = "indicates if the book is available for renting", example = "true")
	private Boolean available;
	
	@Schema(description = "Indicates the rent associated with a book", example = "1")
	private String rentId;

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

	public String getRentId() {
		return rentId;
	}

	public void setRentId(String rentId) {
		this.rentId = rentId;
	}

}
