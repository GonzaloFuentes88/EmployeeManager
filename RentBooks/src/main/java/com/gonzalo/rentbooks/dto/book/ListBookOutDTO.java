package com.gonzalo.rentbooks.dto.book;

import java.util.List;

public class ListBookOutDTO {

	private List<BookOutDTO> listBook;
	
	private Integer listSize;

	public List<BookOutDTO> getListBook() {
		return listBook;
	}

	public void setListBook(List<BookOutDTO> listBook) {
		this.listBook = listBook;
	}

	public Integer getListSize() {
		return listSize;
	}

	public void setListSize(Integer listSize) {
		this.listSize = listSize;
	}
}
