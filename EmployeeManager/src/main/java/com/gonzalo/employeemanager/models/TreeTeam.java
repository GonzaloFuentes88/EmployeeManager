package com.gonzalo.employeemanager.models;

import com.gonzalo.employeemanager.exceptions.InvalidTeamOperationException;
import com.gonzalo.employeemanager.exceptions.NonExistent;

public interface TreeTeam {
	public void add(TreeTeam obj) throws InvalidTeamOperationException, NonExistent;
	public void remove(TreeTeam obj) throws InvalidTeamOperationException, NonExistent;
	public Boolean isTeam();
	public String viewInfo();
}
