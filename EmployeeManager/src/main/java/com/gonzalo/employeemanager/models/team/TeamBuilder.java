package com.gonzalo.employeemanager.models.team;

import java.util.List;

import com.gonzalo.employeemanager.models.TreeTeam;
import com.gonzalo.employeemanager.models.team.ITeamBuilder.Optional;
import com.gonzalo.employeemanager.models.team.ITeamBuilder.Tarea;

public class TeamBuilder implements ITeamBuilder.TeamName, ITeamBuilder.Tarea, ITeamBuilder.Optional,ITeamBuilder.Build{

	private Team team;
	
	public TeamBuilder() {
		this.team = new Team();
	}
	
	@Override
	public Team build() {
		return this.team;
	}

	@Override
	public Optional listTreeTeam(List<TreeTeam> treeTeam) {
		this.team.setEmployees(treeTeam);
		return this;
	}

	@Override
	public Optional tarea(String tarea) {
		this.team.setTarea(tarea);
		return this;
	}

	@Override
	public Tarea teamName(String teamName) {
		this.team.setTeamName(teamName);
		return this;
	}
	
	

}
