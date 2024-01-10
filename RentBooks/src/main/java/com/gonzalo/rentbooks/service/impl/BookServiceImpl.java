package com.gonzalo.rentbooks.service.impl;

import java.util.ArrayList;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.gonzalo.rentbooks.dto.book.AddBookInDTO;
import com.gonzalo.rentbooks.dto.book.BookInDTO;
import com.gonzalo.rentbooks.dto.book.BookOutDTO;
import com.gonzalo.rentbooks.dto.book.DeleteBookInDTO;
import com.gonzalo.rentbooks.dto.book.ModifyBookInDTO;
import com.gonzalo.rentbooks.model.entitys.Book;
import com.gonzalo.rentbooks.repository.IBookRepository;
import com.gonzalo.rentbooks.service.IBookService;

@Service
public class BookServiceImpl implements IBookService{

	@Autowired
	private IBookRepository bookRepository;
	
	@Override
	public List<BookOutDTO> findAll() {
		List<BookOutDTO> listOut = new ArrayList<>();
		List<Book> listDb = bookRepository.findAll();
		
		for(Book bookDb : listDb) {
			BookOutDTO outObj = new BookOutDTO();
			outObj.setSbo(String.valueOf(bookDb.getSbo()));
			outObj.setBookGenre(bookDb.getBookgenre());
			outObj.setAuthor(bookDb.getAuthor());
			outObj.setAvailable(bookDb.getAvailable());
			outObj.setTitle(bookDb.getTitle());
			
			listOut.add(outObj);
		}
		return listOut;
	}

	@Override
	public BookOutDTO findOne(BookInDTO bookIn) {
		Long sbo = Long.parseLong(bookIn.getSbo());
		Book bookDb = bookRepository.findById(sbo).orElse(null);		
		BookOutDTO outObj = new BookOutDTO();
		if(bookDb != null) {			
			outObj.setSbo(String.valueOf(bookDb.getSbo()));
			outObj.setBookGenre(bookDb.getBookgenre());
			outObj.setAuthor(bookDb.getAuthor());
			outObj.setAvailable(bookDb.getAvailable());
			outObj.setTitle(bookDb.getTitle());
		}
		return outObj;
	}

	@Override
	public void delete(DeleteBookInDTO deleteIn) {
		Long sbo = Long.parseLong(deleteIn.getSbo());
		bookRepository.deleteById(sbo);
		
	}

	@Override
	public void update(ModifyBookInDTO modifyBookIn) {
		Book bookDb = new Book();
		bookDb.setAuthor(modifyBookIn.getAuthor());
		bookDb.setSbo(modifyBookIn.getSbo());
		bookDb.setBookgenre(modifyBookIn.getBookgenre());
		bookDb.setAvailable(modifyBookIn.getAvailable());
		bookDb.setTitle(modifyBookIn.getTitle());
		bookDb.setPdfFilePath(null);
		
		bookRepository.save(bookDb);
	}

	@Override
	public void save(AddBookInDTO addBookIn) {
		//Buscar en la bd, si lo encuentra tira mensaje de error
		//Si no encuentra rellena los datos y los manda a la db para crear el obj
		Long sbo = Long.parseLong(addBookIn.getSbo());
		Optional<Book> optBookDb = bookRepository.findById(sbo);
	}
	

}
