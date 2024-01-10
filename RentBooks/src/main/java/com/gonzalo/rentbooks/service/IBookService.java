package com.gonzalo.rentbooks.service;

import java.util.List;

import com.gonzalo.rentbooks.dto.book.AddBookInDTO;
import com.gonzalo.rentbooks.dto.book.BookInDTO;
import com.gonzalo.rentbooks.dto.book.BookOutDTO;
import com.gonzalo.rentbooks.dto.book.DeleteBookInDTO;
import com.gonzalo.rentbooks.dto.book.ModifyBookInDTO;

public interface IBookService {
	public List<BookOutDTO> findAll();
	public BookOutDTO findOne(BookInDTO bookIn);
	public void delete(DeleteBookInDTO deleteIn);
	public void update(ModifyBookInDTO modifyBookIn);
	public void save(AddBookInDTO addBookIn);
}
