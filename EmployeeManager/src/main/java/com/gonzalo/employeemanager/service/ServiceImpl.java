package com.gonzalo.employeemanager.service;

import java.time.LocalDate;
import java.util.List;

import com.gonzalo.employeemanager.exceptions.InvalidTeamOperationException;
import com.gonzalo.employeemanager.exceptions.NonExistent;
import com.gonzalo.employeemanager.models.TreeTeam;
import com.gonzalo.employeemanager.models.employee.Employee;
import com.gonzalo.employeemanager.models.team.Team;

@org.springframework.stereotype.Service
public class ServiceImpl implements Service<TreeTeam>{
	
	private TreeTeam localData;
	
	public ServiceImpl() throws InvalidTeamOperationException, NonExistent {
		TreeTeam team1 = Team.builder()
				.teamName("Team 1")
				.tarea("Clean rooms")
				.build();
		TreeTeam team2 = Team.builder()
				.teamName("Team 2")
				.tarea("Repair appliances")
				.build();
		TreeTeam team3 = Team.builder()
				.teamName("Team 3")
				.tarea("Painting houses")
				.build();
		TreeTeam team4 = Team.builder()
				.teamName("Team 4")
				.tarea("Sale of cleaning products")
				.build();
		
		TreeTeam employee1 = Employee.builder()
				.name("Employee")
				.lastName("1")
				.dateOfBirth(LocalDate.of(1999, 06, 06))
				.salary(200000D)
				.build();
		TreeTeam employee2 = Employee.builder()
				.name("Employee")
				.lastName("2")
				.dateOfBirth(LocalDate.of(2002, 05, 20))
				.salary(200000D)
				.build();
		TreeTeam employee3 = Employee.builder()
				.name("Employee")
				.lastName("3")
				.dateOfBirth(LocalDate.of(1995, 12, 01))
				.salary(200000D)
				.build();
		TreeTeam employee4 = Employee.builder()
				.name("Employee")
				.lastName("4")
				.dateOfBirth(LocalDate.of(1998, 12, 12))
				.salary(200000D)
				.build();
		
		try {
			team1.add(employee1);
			team1.add(team2);
			team2.add(employee2);
			team2.add(employee3);
			team2.add(team3);
			team3.add(team4);
			team4.add(employee4);
			
			localData = team1;
			
		} catch (InvalidTeamOperationException e) {
			throw e;
		} catch (NonExistent e) {
			throw e;
		}
	}
	
	@Override
	public List<TreeTeam> findAll() {
		// TODO Auto-generated method stub
		return null;
	}
	
	@Override
	public TreeTeam findOne(String identifier) {
//		localData.
		return null;
	}
	
	 @Override
	public void save(TreeTeam element) throws InvalidTeamOperationException, NonExistent {

		 try {
			localData.add(element);
			System.out.println(localData.viewInfo());
		} catch (InvalidTeamOperationException e) {
			throw e;
		} catch (NonExistent e) {
			throw e;
		}
		 
		 
	}

}
