package com.gonzalo.rentbooks.dto.book;

public class ModifyBookInDTO {

	private Long sbo;
	
	private String title;
	
	private String author;
	
	private String bookgenre;
	
	private String pdfFilePath;
	
	private Boolean available;

	public Long getSbo() {
		return sbo;
	}

	public void setSbo(Long sbo) {
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

	public String getBookgenre() {
		return bookgenre;
	}

	public void setBookgenre(String bookgenre) {
		this.bookgenre = bookgenre;
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
