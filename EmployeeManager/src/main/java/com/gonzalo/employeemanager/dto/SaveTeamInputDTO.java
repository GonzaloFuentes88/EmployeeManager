package com.gonzalo.employeemanager.dto;

import javax.validation.constraints.NotEmpty;

public class SaveTeamInputDTO {

	@NotEmpty
	private String teamName;
	
	@NotEmpty
	private String task;
	
	public String getTeamName() {
		return teamName;
	}
	public void setTeamName(String teamName) {
		this.teamName = teamName;
	}
	public String getTask() {
		return task;
	}
	public void setTask(String task) {
		this.task = task;
	}
	
	
	
}
