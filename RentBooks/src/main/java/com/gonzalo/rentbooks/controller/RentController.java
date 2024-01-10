package com.gonzalo.rentbooks.controller;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.PatchMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.gonzalo.rentbooks.dto.rent.CancelRentInDTO;
import com.gonzalo.rentbooks.dto.rent.ExtendRentInDTO;
import com.gonzalo.rentbooks.dto.rent.GeneretedRentInDTO;
import com.gonzalo.rentbooks.dto.rent.RentInDTO;
import com.gonzalo.rentbooks.dto.rent.RentListInDTO;
import com.gonzalo.rentbooks.dto.rent.RentListOutDTO;
import com.gonzalo.rentbooks.dto.rent.RentOutDTO;

@RestController
@RequestMapping("/rent")
public class RentController {
	
	@PostMapping()
	public ResponseEntity<Void> generatedRentBook(@RequestBody GeneretedRentInDTO inObj){
		
		return ResponseEntity.created(null).build();
	}
	
	@PostMapping("/getElement")
	public ResponseEntity<RentOutDTO> viewRentBook(@RequestBody RentInDTO inObj){
		RentOutDTO outObj = new RentOutDTO();
		return ResponseEntity.ok(outObj);
	}
	
	@PostMapping("/getList")
	public ResponseEntity<RentListOutDTO> viewListRentBook(@RequestBody RentListInDTO inObj){
		RentListOutDTO outObj = new RentListOutDTO();
		return ResponseEntity.ok(outObj);
	}
	
	@DeleteMapping("/cancelRent")
	public ResponseEntity<Void> cancelRentBook(@RequestBody CancelRentInDTO inObj){
		
		return ResponseEntity.noContent().build();
	}
	
	@PatchMapping("/extendRent")
	public ResponseEntity<Void> extendRentBook(@RequestBody ExtendRentInDTO inObj){
		
		return ResponseEntity.noContent().build();
	}
}
