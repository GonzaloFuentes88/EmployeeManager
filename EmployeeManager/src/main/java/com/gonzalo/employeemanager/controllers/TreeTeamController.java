package com.gonzalo.employeemanager.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.gonzalo.employeemanager.dto.SaveTeamInputDTO;
import com.gonzalo.employeemanager.dto.ViewInfoDTO;
import com.gonzalo.employeemanager.exceptions.InvalidTeamOperationException;
import com.gonzalo.employeemanager.exceptions.NonExistent;
import com.gonzalo.employeemanager.models.TreeTeam;
import com.gonzalo.employeemanager.models.team.Team;
import com.gonzalo.employeemanager.service.Service;

@RestController
@RequestMapping("/treeTeam")
public class TreeTeamController {
	
	@Autowired
	private Service<TreeTeam> service;
	
	@GetMapping(value = "/viewInfo", produces = MediaType.APPLICATION_JSON_VALUE)
	public ResponseEntity<TreeTeam> viewInfo(@RequestBody ViewInfoDTO info){
		TreeTeam obj = null;
		if(info.isTeam()) {
			//obj = service.findOne(info.getIdentifier());
		}else {
			
		}
		
		return ResponseEntity.ok(obj);
	}
	
	@PostMapping(value="/saveTeam",consumes = MediaType.APPLICATION_JSON_VALUE)
	public ResponseEntity<Void> saveTeam(@RequestBody SaveTeamInputDTO objIn) throws InvalidTeamOperationException, NonExistent{
		TreeTeam obj = Team.builder()
				.teamName(objIn.getTeamName())
				.tarea(objIn.getTask())
				.build();
		
		try {
			service.save(obj);
		} catch (InvalidTeamOperationException e) {
			throw e;
		} catch (NonExistent e) {
			throw e;
		}
		
		return ResponseEntity.created(null).build();
	}

}
