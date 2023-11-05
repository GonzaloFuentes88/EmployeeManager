package com.gonzalo.employeemanager.controllers;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.gonzalo.employeemanager.dto.ViewInfoDTO;
import com.gonzalo.employeemanager.models.TreeTeam;

@RestController
@RequestMapping("/treeTeam")
public class TreeTeamController {
	
	@GetMapping("/viewInfo")
	public ResponseEntity<TreeTeam> viewInfo(@RequestBody ViewInfoDTO info){
		TreeTeam obj = null;
		if(info.isTeam()) {
			//obj = service.findOne(info.getIdentifier());
		}else {
			
		}
		
		return ResponseEntity.ok(obj);
	}

}
