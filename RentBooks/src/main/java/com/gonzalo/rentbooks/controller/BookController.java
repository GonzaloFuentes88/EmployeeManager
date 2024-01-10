package com.gonzalo.rentbooks.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.validation.BindingResult;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.PatchMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.gonzalo.rentbooks.dto.book.AddBookInDTO;
import com.gonzalo.rentbooks.dto.book.BookInDTO;
import com.gonzalo.rentbooks.dto.book.BookOutDTO;
import com.gonzalo.rentbooks.dto.book.DeleteBookInDTO;
import com.gonzalo.rentbooks.dto.book.ListBookInDTO;
import com.gonzalo.rentbooks.dto.book.ListBookOutDTO;
import com.gonzalo.rentbooks.dto.book.ModifyBookInDTO;
import com.gonzalo.rentbooks.service.IBookService;

import jakarta.validation.Valid;

@RestController
@RequestMapping("/book")
@Validated
public class BookController {
	
	@Autowired
	private IBookService bookService;
	
	@PostMapping()
	public ResponseEntity<Void> addBook(@Valid @RequestBody AddBookInDTO inObj, BindingResult result){
		return ResponseEntity.created(null).build();
	}
	@PostMapping("/getElement")
	public ResponseEntity<BookOutDTO> viewBook(@Valid @RequestBody BookInDTO inObj, BindingResult result){
		BookOutDTO outObj = bookService.findOne(inObj);
		return ResponseEntity.ok(outObj);
	}
	@PostMapping("/getList")
	public ResponseEntity<ListBookOutDTO> viewListBook(@Valid @RequestBody ListBookInDTO inObj, BindingResult result){
		ListBookOutDTO outObj = new ListBookOutDTO();
		List<BookOutDTO> listDb = bookService.findAll();
		outObj.setListBook(listDb);
		outObj.setListSize(listDb.size());
		return ResponseEntity.ok(outObj);
	}
	@PostMapping("/delete")
	public ResponseEntity<Void> deleteBook(@Valid @RequestBody DeleteBookInDTO inObj, BindingResult result){
		bookService.delete(inObj);
		return ResponseEntity.noContent().build();
	}
	@PatchMapping()
	public ResponseEntity<Void> modifyBook(@Valid @RequestBody ModifyBookInDTO inObj, BindingResult result){
		bookService.update(inObj);
		return ResponseEntity.noContent().build();
	}

}
