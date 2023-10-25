package com.gonzalo.employeemanager.models.team;

import com.gonzalo.employeemanager.models.TreeTeam;

public class Team implements TreeTeam{
	
	private String tarea;
	
	public String getTarea() {
		return tarea;
	}

	public void setTarea(String tarea) {
		this.tarea = tarea;
	}

	@Override
	public void add() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void remove() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public Boolean isTeam() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public String viewInfo() {
		// TODO Auto-generated method stub
		return null;
	}
	
}
