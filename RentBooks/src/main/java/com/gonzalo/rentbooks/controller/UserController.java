package com.gonzalo.rentbooks.controller;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.PatchMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.gonzalo.rentbooks.dto.user.DeleteUserInDTO;
import com.gonzalo.rentbooks.dto.user.ModifyUserInDTO;
import com.gonzalo.rentbooks.dto.user.RegisertUserDTO;
import com.gonzalo.rentbooks.dto.user.UserInDTO;
import com.gonzalo.rentbooks.dto.user.UserOutDTO;

@RestController
@RequestMapping("/user")
public class UserController {

	
	@PostMapping("/register")
	public ResponseEntity<Void> registerUser(@RequestBody RegisertUserDTO inObj){
		return ResponseEntity.created(null).build();
	}
	
	@PostMapping("/getElement")
	public ResponseEntity<UserOutDTO> viewUser(@RequestBody UserInDTO inObj ){
		UserOutDTO outObj = new UserOutDTO();
		return ResponseEntity.ok(outObj);
	}
	
	@PatchMapping()
	public ResponseEntity<Void> modifyUser(@RequestBody ModifyUserInDTO inObj){
		return ResponseEntity.noContent().build();
	}
	
	@DeleteMapping()
	public ResponseEntity<Void> deleteUser(@RequestBody DeleteUserInDTO inObj){
		return ResponseEntity.noContent().build();
	}
}
