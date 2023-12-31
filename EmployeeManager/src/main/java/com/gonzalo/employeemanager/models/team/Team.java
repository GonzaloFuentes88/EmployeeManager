package com.gonzalo.employeemanager.models.team;

import java.util.ArrayList;
import java.util.List;
import com.gonzalo.employeemanager.exceptions.NonExistent;
import com.gonzalo.employeemanager.models.TreeTeam;
import com.gonzalo.employeemanager.models.employee.Employee;
import com.google.gson.Gson;


public class Team implements TreeTeam{
	
	private String teamName;
	
	private String tarea;
	
	private List<TreeTeam> treeTeams = new ArrayList<>();
	
	protected Team() {}
	
	public static ITeamBuilder.TeamName builder(){
		return new TeamBuilder();
	}
	
	public String getTarea() {
		return tarea;
	}

	public void setTarea(String tarea) {
		this.tarea = tarea;
	}

	public List<TreeTeam> getTreeTeams() {
		return treeTeams;
	}

	public void setTreeTeams(List<TreeTeam> treeTeams) {
		this.treeTeams = treeTeams;
	}

	public String getTeamName() {
		return teamName;
	}

	public void setTeamName(String teamName) {
		this.teamName = teamName;
	}

	@Override
	public void add(TreeTeam obj){
		this.treeTeams.add(obj);
	}

	@Override
	public void remove(TreeTeam obj) throws NonExistent {
		
//		if(obj instanceof Employee) {
//			Long id = ((Employee) obj).getId();
//			try {
//				this.treeTeams.remove(obj);	
//			}catch(Exception e) {
//				throw new NonExistent("No user with id "+id+" found");
//			}
//		}
//		try {
//			this.treeTeams.remove(obj);
//		}catch(Exception e) {
//			throw new NonExistent("Team not found");
//		}
	}

	@Override
	public Boolean isTeam() {
		return true;
	}

	@Override
	public String viewInfo() {
		StringBuilder builder = new StringBuilder();
		Gson gson = new Gson();
		
//		builder
//			.append("Name of team : ").append(this.teamName).append("\n")
//			.append("Task of team : ").append(this.tarea).append("\n")
//			.append((!employees.isEmpty()) ? "-- Employees --":"");
//		
//		for(TreeTeam emp : employees) {
//			builder
//				.append("\n")
//				.append(emp.viewInfo());
//		}
		
		return gson.toJson(this);
	}
	
}
