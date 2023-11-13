package com.gonzalo.employeemanager.models.team;

import java.util.List;

import com.gonzalo.employeemanager.models.TreeTeam;

public interface ITeamBuilder {

	interface TeamName{
		Tarea teamName(String teamName);
	}
	interface Tarea{
		Optional tarea(String tarea);
	}
	
	interface Optional{
		Optional listTreeTeam(List<TreeTeam> treeTeam);
		Team build();
	}
	
	interface Build {
		Team build();
	}
	
}
